package br.com.ifce.test;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;
import br.com.ifce.repository.FilmeRepositoryImpl;

public class ViewTest {
    public static void main(String[] args) {
        

        Filme filme = new Filme();
        
        filme.setNome("Vingadores");
        filme.setDuracao("120 min");
        filme.setData_lancamento("2022-02-01");
        filme.setPreco(50.3);

        FilmeRepository filmeRepo = new FilmeRepositoryImpl();

        filmeRepo.addFilme(filme);
        
        filme.setNome("Missão impossivel");
        
        filmeRepo.updateFilme(filme);
        
        //filmeRepo.deleteFilme(1);
        
        filmeRepo.getAllFilmes();
        Filme filmeRetornado = filmeRepo.getFilme(1);

        System.out.println(filmeRetornado.getNome());

    }       
}
