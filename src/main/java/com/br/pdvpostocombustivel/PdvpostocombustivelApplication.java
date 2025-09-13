package com.br.pdvpostocombustivel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.br.pdvpostocombustivel.domain.entity.Pessoa;

@SpringBootApplication
public class PdvpostocombustivelApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PdvpostocombustivelApplication.class, args);

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
	}
}
