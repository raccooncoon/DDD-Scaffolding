package com.dddscaffolding;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "DDD Scaffolding",
		version = "v1",
		description = "도메인 주도 설계를 위한 스캐폴딩 프로젝트입니다"
))
public class DddScaffoldingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddScaffoldingApplication.class, args);
	}

}
