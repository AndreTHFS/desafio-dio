package projeto.spring.dio_desafio.service.impl;


import org.springframework.stereotype.Service;
import projeto.spring.dio_desafio.client.dto.CotacaoDTO;
import projeto.spring.dio_desafio.facede.ConversorFacade;
import projeto.spring.dio_desafio.service.ConversorService;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Service
public class ConversorServiceImpl implements ConversorService {

    private final ConversorFacade conversorFacade;

    public ConversorServiceImpl(ConversorFacade conversorFacade) {
        this.conversorFacade = conversorFacade;
    }

    @Override
    public Map<String, Object> converterMoeda(String origem, String destino, BigDecimal valor) {
        // Validações simples
        if (origem == null || destino == null || valor == null) {
            throw new IllegalArgumentException("Parâmetros não podem ser nulos");
        }

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }

        // Obtém cotação via Facade
        CotacaoDTO cotacao = conversorFacade.obterCotacao(origem, destino);

        // Converte o valor
        BigDecimal valorConvertido = conversorFacade.converterValor(valor, cotacao);

        // Prepara resposta
        Map<String, Object> resultado = new HashMap<>();
        resultado.put("origem", origem);
        resultado.put("destino", destino);
        resultado.put("valorOriginal", valor);
        resultado.put("valorConvertido", valorConvertido);
        resultado.put("cotacao", cotacao.getBid());
        resultado.put("data", formatarData(cotacao.getCreate_date()));
        resultado.put("timestamp", LocalDateTime.now().toString());

        return resultado;
    }

    @Override
    public Map<String, Object> listarMoedasSuportadas() {
        Map<String, Object> resposta = new HashMap<>();
        resposta.put("moedas", new String[]{"USD", "EUR", "BTC", "GBP", "ARS", "CAD"});
        resposta.put("destinoPadrao", "BRL");
        return resposta;
    }

    private String formatarData(String dataOriginal) {
        try {
            // Exemplo de formato: "2024-02-24 15:30:45"
            return dataOriginal;
        } catch (Exception e) {
            return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        }
    }
}
