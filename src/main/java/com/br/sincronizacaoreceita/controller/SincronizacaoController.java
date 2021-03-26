package com.br.sincronizacaoreceita.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sincronizacao")
public class SincronizacaoController {

    @GetMapping
    public String teste(){
        return "funfou";
    }

}
