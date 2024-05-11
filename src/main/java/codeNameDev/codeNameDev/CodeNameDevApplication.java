package codeNameDev.codeNameDev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.*;

@EnableJpaAuditing
@SpringBootApplication
public class CodeNameDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeNameDevApplication.class, args);
	}

}
