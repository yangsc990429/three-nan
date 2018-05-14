package org.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "dubbo-provider.xml")
public class ThreeNanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreeNanApplication.class, args);
	}
}
