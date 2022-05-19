package br.com.ifce.model;
 
import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table(name = "Filme")
public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;

	@Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_lancamento")
    private String data_lancamento;

    @Column(name = "preco")
    private double preco;

    @Column(name = "duracao")
    private String duracao;

      public int getId() {
    	return id;
    }

    public void setId(int id) {
    	this.id = id;
    }

    public String getNome() {
    	return nome;
    }

    public void setNome(String nome) {
    	this.nome = nome;
    }

    public String getData_lancamento() {
    	return data_lancamento;
    }

    public void setData_lancamento(String data_lacamento) {
    	this.data_lancamento = data_lacamento;
    }
   
    public double getPreco() {
    	return preco;
    }

    public void setPreco(double preco) {
    	this.preco = preco;
    }

    public String getDuracao() {
    	return duracao;
    }

    public void setDuracao(String duracao) {
    	this.duracao = duracao;
    }
  
}