package com.br.sincronizacaoreceita.controller;

import com.br.sincronizacaoreceita.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;

@RestController
@RequestMapping("sincronizacao")
public class SincronizacaoController {

    @Autowired
    private ReceitaService receitaService;

    @GetMapping(value = "/{inputFile}")
    @ResponseBody
    public ResponseEntity<String> teste(@PathVariable String inputFile) throws IOException, InterruptedException, ParseException {
        try {
            receitaService.verificaConta(inputFile);
            return new ResponseEntity<>("Arquivo CSV Criado com Sucesso!", HttpStatus.CREATED);
        } catch (Exception e) {
            throw e;
        }
    }

}
