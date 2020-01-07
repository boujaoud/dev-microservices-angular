package org.jb.customerservice;

import org.jb.customerservice.entities.Customer;
import org.jb.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"jamal1","jamal1@gmail.com"));
			customerRepository.save(new Customer(null,"jamal2","jamal2@gmail.com"));
			customerRepository.save(new Customer(null,"jamal3","jamal3@gmail.com"));
			customerRepository.findAll().forEach(System.out::println);
		};
	}
}
