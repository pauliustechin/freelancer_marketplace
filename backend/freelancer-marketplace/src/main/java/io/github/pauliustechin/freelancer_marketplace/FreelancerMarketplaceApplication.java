package io.github.pauliustechin.freelancer_marketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FreelancerMarketplaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreelancerMarketplaceApplication.class, args);
	}

}
