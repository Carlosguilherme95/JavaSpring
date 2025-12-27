package com.devsuperior.aula;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class AulaApplication implements CommandLineRunner {
	private OrderService orderService;

	public AulaApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {

		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1309,95.90,0.0);
		System.out.println("Pedido código:"+order.getCode() +"\n"+"Valor Total: "+orderService.total(order));

	}
}
