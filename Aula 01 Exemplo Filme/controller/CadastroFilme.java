package controller;
import java.util.ArrayList;
import java.util.List;

import model.Filme;

public class CadastroFilme {
	private List<Filme> filmes = new ArrayList<Filme>();

	
	public void adicionarFilme(Filme filme) {
		this.filmes.add(filme);
	}
	
	public void removerFilme(Filme filme) {
		this.filmes.remove(filme);
	}
	
	public void imprimirFilmes() {
		for (Filme filme : filmes) {
			System.out.println("Titulo: " + filme.getTitulo());
			System.out.println("Categoria: " + filme.getCategoria());
			System.out.println("Duracao: " + filme.getDuracao()+" min");
			System.out.println("Preco:R$" + filme.getPreco());
		}
	}
}
