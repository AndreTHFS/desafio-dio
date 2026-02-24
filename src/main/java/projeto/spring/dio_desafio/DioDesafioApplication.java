package projeto.spring.dio_desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DioDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioDesafioApplication.class, args);
	}

}
