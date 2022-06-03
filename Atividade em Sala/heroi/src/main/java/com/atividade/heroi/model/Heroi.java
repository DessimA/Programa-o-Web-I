package com.atividade.heroi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Heroi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private String personagem;
    private String desenho;
    private String categoria;

    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getPersonagem() {
        return this.personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getDesenho() {
        return this.desenho;
    }

    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

        
}
