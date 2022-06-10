package com.aula.aula_04.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.aula_04.model.Livro;
import com.aula.aula_04.repository.LivroRepository;

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
    public void excluirLivroPorId(Long codigo){
        livroRepo.deleteById(codigo);
    }

    public Optional<Livro> buscarPorId(Long codigo) {
        return livroRepo.findById(codigo);
    }
}
