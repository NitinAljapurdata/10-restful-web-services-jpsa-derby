package abb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories(basePackages="viveksingh.restful.dao")
@EnableWebMvc
@ComponentScan(basePackages="viveksingh.restful")
@EntityScan(basePackages="viveksingh.restful.bean")
public class JpaDerbyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDerbyApplication.class, args);
	}

}
