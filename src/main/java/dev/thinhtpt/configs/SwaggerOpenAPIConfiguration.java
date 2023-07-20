package dev.thinhtpt.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.stereotype.Component;

/**
 * The SwaggerOpenAPIConfiguration is a class that provides the configuration for Swagger OpenAPI.
 *
 * @author Theon Tran Phan Truong Thinh
 * @version 1.0
 * @since 20/07/2023 8:56 PM
 */
@OpenAPIDefinition(
    info =
        @Info(
            title = "Spring CQRS and Event Sourcing Microservice",
            description = "Spring Postgresql MongoDB Kafka CQRS and Event Sourcing Microservice"))
@Component
public class SwaggerOpenAPIConfiguration {}
