package com.trabalho2.trabalho.repository;

import com.trabalho2.trabalho.model.Livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}
