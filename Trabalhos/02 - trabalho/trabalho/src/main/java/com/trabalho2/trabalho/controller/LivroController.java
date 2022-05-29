package com.trabalho2.trabalho.controller;

import com.trabalho2.trabalho.model.Livro;
import com.trabalho2.trabalho.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivroController {

    @Autowired
    private LivroService livroService;
        
    @GetMapping("/olaMundo")
    public String olaMundo() {
        return "ola-mundo";
    }

    @GetMapping("livro/formulario")
    public String formulario(){
        return "formulario";
    }

    @GetMapping("/livro/salvar")
    public String salvar(Livro livro){
        livroService.cadastrarLivro(livro);
        
        return "sucesso";
    }
}
