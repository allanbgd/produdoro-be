package dev.wakandaacademy.produdoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(
		basePackages = "dev.wakandaacademy.produdoro.usuario.infra"
)
public class ProdudoroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdudoroApplication.class, args);
	}

}
