package br.com.ifce.repository;
 
import java.util.List;

import br.com.ifce.model.Filme;
 
public interface FilmeRepository {
 
    public void addFilme(Filme filme);
 
    public List<Filme> getAllFilmes();
 
    public void deleteFilme(Integer filmeId);
 
    public Filme updateFilme(Filme filme);
 
    public Filme getFilme(int filmeId);
}