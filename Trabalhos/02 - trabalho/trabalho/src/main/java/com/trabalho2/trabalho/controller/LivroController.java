package com.trabalho2.trabalho.controller;

import java.util.List;

import com.trabalho2.trabalho.model.Livro;
import com.trabalho2.trabalho.service.LivroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/livro/listar")
    public ModelAndView listarLivros(){
        List<Livro> livros = livroService.listarLivros();

        ModelAndView mv = new ModelAndView("listagem-livro");

        mv.addObject("listaLivros", livros);

        return mv;
    }
}
