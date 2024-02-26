package io.sboot.vers.mgtut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MgtutApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgtutApplication.class, args);
		/*
		 * Sets up default configuration
		 * Starts Spring application context
		 * Performs class path scan
		 * Starts Tomcat Server
		 */
	}

}
