package com.br.pdvpostocombustivel.api.contato;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contatos")
public class ContatoController {

    private final ContatoService service;

    public ContatoController(ContatoService service){
        this.service = service;
    }
}
