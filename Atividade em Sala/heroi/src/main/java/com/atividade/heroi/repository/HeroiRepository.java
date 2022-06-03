package com.atividade.heroi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade.heroi.model.Heroi;

@Repository
public interface HeroiRepository extends JpaRepository<Heroi, Long>{
    
}
