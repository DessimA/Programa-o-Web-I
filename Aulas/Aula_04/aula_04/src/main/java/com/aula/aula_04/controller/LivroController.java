package com.aula.aula_04.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aula.aula_04.model.Livro;
import com.aula.aula_04.service.LivroService;

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

    @RequestMapping("/livro/salvar")
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

        @GetMapping("/livro/excluir/{codigo}")
        public ModelAndView excluirLivroPorId(@PathVariable Long codigo){
            livroService.excluirLivroPorId(codigo);

            ModelAndView mv = new ModelAndView("redirect:/livro/listar");
            
            return mv;
    }
    @RequestMapping("/livro/atualizar/{codigo}")
        public ModelAndView atualizarLivroPorId(@PathVariable Long codigo){
            Optional<Livro> livro = livroService.buscarPorId(codigo);
            ModelAndView mv = new ModelAndView("formulario");
            mv.addObject("livro", livro);

            return mv;           
    }
}
