package com.home.loans;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Loans microservice REST API Documentation",
                description = "Loans microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Majd Haidar",
                        email = "haidarmajd@hotmail.com",
                        url = "https://github.com/majdhaidar"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://github.com/majdhaidar"
                )
        )
)
public class LoansApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }

    @Value("${build.version:NotFound}")
    private String buildVersion;

    @Override
    public void run(String... args) throws Exception {
        started();
    }

    void started() {
        System.out.println("Application started with version: " + buildVersion);
    }
}
