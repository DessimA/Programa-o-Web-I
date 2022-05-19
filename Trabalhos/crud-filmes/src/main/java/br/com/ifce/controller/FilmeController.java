package br.com.ifce.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.ifce.model.Filme;
import br.com.ifce.service.FilmeService;

@Controller
public class FilmeController {

    @SuppressWarnings("unused")
	private static final Logger logger = Logger
		.getLogger(FilmeController.class);

    public FilmeController() {
		System.out.println("FilmeController()");
	}

    @Autowired
    private FilmeService filmeService;


    @RequestMapping(value = {"", "/", "home"})
    public ModelAndView listFilme(ModelAndView model) throws IOException {
    	List<Filme> listFilme = filmeService.getAllFilmes();
    	model.addObject("listFilme", listFilme);
    	model.setViewName("home");
    	return model;
    }

    @RequestMapping(value = "/newFilme", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
    	Filme filme = new Filme();
    	model.addObject("filme", filme);
    	model.setViewName("filme-form");
    	return model;
    }

    @RequestMapping(value = "/saveFilme", method = RequestMethod.POST)
    public ModelAndView saveFilme(@ModelAttribute Filme filme) {
        if (filme.getId() == 0) {             
            filmeService.addFilme(filme);
    	} else {
            filmeService.updateFilme(filme);
    	}
    	return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/deleteFilme", method = RequestMethod.GET)
    public ModelAndView deleteFilme(HttpServletRequest request) {
        int filmeId = Integer.parseInt(request.getParameter("id"));
        filmeService.deleteFilme(filmeId);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editFilme", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int filmeId = Integer.parseInt(request.getParameter("id"));
        Filme filme = filmeService.getFilme(filmeId);
        ModelAndView model = new ModelAndView("filme-form");
        model.addObject("filme", filme);

    	return model;
    }

}