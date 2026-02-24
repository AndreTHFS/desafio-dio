package projeto.spring.dio_desafio.facede;

import org.springframework.stereotype.Component;
import projeto.spring.dio_desafio.client.dto.AwesomeApiClient;
import projeto.spring.dio_desafio.client.dto.CotacaoDTO;
import java.math.BigDecimal;
import java.util.Map;
@Component
public class ConversorFacade {

    private final AwesomeApiClient awesomeApiClient;

    public ConversorFacade(AwesomeApiClient awesomeApiClient) {
        this.awesomeApiClient = awesomeApiClient;
    }

    public CotacaoDTO obterCotacao(String moedaOrigem, String moedaDestino) {
        String par = moedaOrigem + "-" + moedaDestino;
        String chave = moedaOrigem + moedaDestino;

        try {
            Map<String, CotacaoDTO> response = awesomeApiClient.getCotacoes(par);
            return response.get(chave);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar cotação: " + e.getMessage());
        }
    }
    public BigDecimal converterValor(BigDecimal valor, CotacaoDTO cotacao) {
        return valor.multiply(cotacao.getBidAsBigDecimal())
                .setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }
}
