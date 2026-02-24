package projeto.spring.dio_desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DioDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioDesafioApplication.class, args);

		System.out.println("\n" +
				"╔════════════════════════════════════════════════════╗\n" +
				"║     💰 CONVERSOR DE MOEDAS RODANDO!               ║\n" +
				"╠════════════════════════════════════════════════════╣\n" +
				"║ 🔗 Swagger UI: http://localhost:8080/swagger-ui.html ║\n" +
				"║ 📚 API Docs: http://localhost:8080/api-docs       ║\n" +
				"║ 🔍 Teste: http://localhost:8080/api/conversor/USD/BRL/100 ║\n" +
				"╚════════════════════════════════════════════════════╝");
	
	}

}
