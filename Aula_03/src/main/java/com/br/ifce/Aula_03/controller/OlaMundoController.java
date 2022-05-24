package com.br.ifce.Aula_03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController{

    @GetMapping("/")
    public String olaMundo(){
        //pessoaService.cadastrar(pessoa);
        return "ola-mundo";
    }
}