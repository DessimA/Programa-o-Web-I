package br.com.ifce.service;

import java.util.List;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FilmeServiceImpl implements FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    @Transactional
    public void addFilme(Filme filme) {
    	filmeRepository.addFilme(filme);
    }

    @Override
    @Transactional
    public List<Filme> getAllFilmes() {
	return filmeRepository.getAllFilmes();
    }

    @Override
    @Transactional
    public void deleteFilme(Integer filmeId) {
    	filmeRepository.deleteFilme(filmeId);
    }

    public Filme getFilme(int filmeId) {
	return filmeRepository.getFilme(filmeId);
    }

    public Filme updateFilme(Filme filme) {
	return filmeRepository.updateFilme(filme);
    }

    public void setFilmeRepository(FilmeRepository filmeRepository) {
	this.filmeRepository = filmeRepository;
    }
}
