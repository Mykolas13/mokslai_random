package com.mokykla.traukiniai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TraukiniaiApplication {

	@Bean
	public Docket swaggerDocket() {

		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.mokykla.traukiniai"))
				.build();
	}

	private ApiInfo apiInfo() {

		return new ApiInfoBuilder()
				.title("Mykoliuko dokumentai - Traukiniu valdymas")
				.version("0.0.1-SNAPSHOT")
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(TraukiniaiApplication.class, args);
	}
}
