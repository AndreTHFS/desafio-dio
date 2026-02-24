package projeto.spring.dio_desafio.client.dto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "awesomeapi", url = "https://economia.awesomeapi.com.br")
public interface AwesomeApiClient {

    /**
     * Consulta cotação de uma ou mais moedas
     * @param moedas formato: "USD-BRL" ou "USD-BRL,EUR-BRL,BTC-BRL"
     * @return Mapa com as cotações
     */
    @GetMapping("/json/last/{moedas}")
    Map<String, CotacaoDTO> getCotacoes(@PathVariable("moedas") String moedas);
}
