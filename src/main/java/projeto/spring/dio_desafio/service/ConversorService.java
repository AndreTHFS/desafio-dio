package projeto.spring.dio_desafio.service;



import java.math.BigDecimal;
import java.util.Map;


public interface ConversorService {
    Map<String, Object> converterMoeda(String origem, String destino, BigDecimal valor);
    Map<String, Object> listarMoedasSuportadas();
}
