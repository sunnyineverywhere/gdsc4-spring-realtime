package server.gdsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import server.gdsc.domain.entity.Account;

@EnableJpaAuditing
@SpringBootApplication
public class GdscApplication {

	public static void main(String[] args) {
		SpringApplication.run(GdscApplication.class, args);
	}

}
