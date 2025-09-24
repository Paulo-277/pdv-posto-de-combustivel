package com.br.pdvpostocombustivel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// OpenAPI / Swagger
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "PDV Posto Combustível API",
                version = "v1",
                description = "API de exemplo com CRUD de Pessoas (Spring Boot 3 / Java 17).",
                contact = @Contact(name = "Prof. Esp. Ednilton Rauh", email = "ednilton@example.com"),
                license = @License(name = "MIT")
        ),
        servers = {
                @Server(url = "http://localhost:8080", description = "Ambiente Local")
        }
)
public class PdvpostocombustivelApplication {

    public static void main(String[] args) {
        SpringApplication.run(PdvpostocombustivelApplication.class, args);

        /*
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNomeCompleto("Paulo");
        pessoa1.setCpfCnpj("06328509274398");
        pessoa1.setNumeroCtps(1233L);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNomeCompleto("Pedrin");
        pessoa2.setCpfCnpj("066124543340888");
        pessoa2.setNumeroCtps(8786786L);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNomeCompleto("Beta");
        pessoa3.setCpfCnpj("animal");
        pessoa3.setNumeroCtps(78987L);

        System.out.println(pessoa1.getNomeCompleto());
        System.out.println(pessoa1.getCpfCnpj());
        System.out.println(pessoa1.getNumeroCtps());
        System.out.println("-------------------------------------");

        System.out.println(pessoa2.getNomeCompleto());
        System.out.println(pessoa2.getCpfCnpj());
        System.out.println(pessoa2.getNumeroCtps());
        System.out.println("-------------------------------------");

        System.out.println(pessoa3.getNomeCompleto());
        System.out.println(pessoa3.getCpfCnpj());
        System.out.println(pessoa3.getNumeroCtps());
        System.out.println("-------------------------------------");
         */
    }
}
