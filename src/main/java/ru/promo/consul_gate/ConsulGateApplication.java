package ru.promo.consul_gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.yml")
public class ConsulGateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulGateApplication.class, args);
	}

}
