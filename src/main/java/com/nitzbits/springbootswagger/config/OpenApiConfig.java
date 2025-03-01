package com.nitzbits.springbootswagger.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
        (info = @Info(title = "Spring Boot Application with Swagger",
                description = "This application is in initial phase for implementing swagger.",
                version = "1.0"))
public class OpenApiConfig {

}
