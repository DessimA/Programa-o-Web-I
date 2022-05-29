package com.trabalho2.trabalho.service;

import java.util.List;

import com.trabalho2.trabalho.model.Livro;
import com.trabalho2.trabalho.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepo;
    
    public void cadastrarLivro(Livro livro){
        livroRepo.save(livro);
    }

    public List<Livro> listarLivros() {
        return livroRepo.findAll();
    }
}
