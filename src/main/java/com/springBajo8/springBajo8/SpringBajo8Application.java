package com.springBajo8.springBajo8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@SpringBootApplication
@EnableReactiveMongoRepositories
//@EnableSwagger2
public class SpringBajo8Application {

	/*
	Documentacion con swagger 2.0
	@Bean
	public Docket citasApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}*/
	public static void main(String[] args) {
		SpringApplication.run(SpringBajo8Application.class, args);
	}

}
