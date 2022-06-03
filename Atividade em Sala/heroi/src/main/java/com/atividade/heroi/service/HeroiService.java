package com.atividade.heroi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.heroi.model.Heroi;
import com.atividade.heroi.repository.HeroiRepository;

@Service
public class HeroiService {
    @Autowired
    private HeroiRepository heroiRepo;
    
    public void cadastrarHeroi(Heroi heroi){
        heroiRepo.save(heroi);
    }

    public List<Heroi> listarHerois() {
        return heroiRepo.findAll();
    }
    public void excluirHeroiPorId(Long codigo){
        heroiRepo.deleteById(codigo);
    }
}
