package com.ttzh.concertTicket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class ConcertTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcertTicketApplication.class, args);
	}

}
