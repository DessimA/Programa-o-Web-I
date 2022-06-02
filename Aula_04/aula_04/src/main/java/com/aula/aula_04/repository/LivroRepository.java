package com.aula.aula_04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.aula_04.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}
