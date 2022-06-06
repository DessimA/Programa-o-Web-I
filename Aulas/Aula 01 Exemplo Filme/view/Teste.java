package view;
import controller.CadastroFilme;
import model.Filme;

public class Teste {

	public static void main(String[] args) {
		Filme filme1 = new Filme();
		filme1.setTitulo("Missao Impossivel");
		filme1.setCategoria("acao");
		filme1.setDuracao(120);
		filme1.setPreco(20);
		
		CadastroFilme cadFilme = new CadastroFilme();
		cadFilme.adicionarFilme(filme1);
		
		cadFilme.imprimirFilmes();
	}

}