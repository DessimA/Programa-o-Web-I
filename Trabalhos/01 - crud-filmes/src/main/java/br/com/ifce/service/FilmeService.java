package br.com.ifce.service;
 
import java.util.List;

import br.com.ifce.model.Filme;
 
public interface FilmeService {
     
    public void addFilme(Filme filme);
 
    public List<Filme> getAllFilmes();
 
    public void deleteFilme(Integer filmeId);
 
    public Filme getFilme(int filmeid);
 
    public Filme updateFilme(Filme filme);
}
