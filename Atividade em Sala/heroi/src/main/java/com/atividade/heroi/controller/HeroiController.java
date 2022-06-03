package com.atividade.heroi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.atividade.heroi.model.Heroi;
import com.atividade.heroi.service.HeroiService;

@Controller
public class HeroiController {

    @Autowired
    private HeroiService heroiService;
        
    @GetMapping("/olaMundo")
    public String olaMundo() {
        return "ola-mundo";
    }

    @GetMapping("heroi/formulario")
    public String formulario(){
        return "formulario";
    }

    @GetMapping("/heroi/salvar")
    public String salvar(Heroi heroi){
        heroiService.cadastrarHeroi(heroi);        
        return "sucesso";
    }

    @GetMapping("/heroi/listar")
    public ModelAndView listarHerois(){
        List<Heroi> herois = heroiService.listarHerois();

        ModelAndView mv = new ModelAndView("listagem-heroi");

        mv.addObject("listarHerois", herois);

        return mv;
    }

        @GetMapping("/heroi/excluir/{codigo}")
        public ModelAndView excluirHeroiPorId(@PathVariable Long codigo){
            heroiService.excluirHeroiPorId(codigo);

            ModelAndView mv = new ModelAndView("redirect:/heroi/listar");
            
            return mv;
    }
    
}