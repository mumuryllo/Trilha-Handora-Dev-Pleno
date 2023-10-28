package components;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"components/config", "components/model", "components/repository",  "components/controller"})
public class SeguradoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeguradoraApplication.class, args);
	}

}
