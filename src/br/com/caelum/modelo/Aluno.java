package br.com.caelum.modelo;

public class Aluno {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	//imprimir alunos na tela
	public String toString() {
		return this.nome;
	}
	//comparar dois objetos Alunos--Critério será dois alunos
	public boolean equals(Object o) {
		Aluno outro = (Aluno)o;
		return this.nome.equals(outro.nome);
	}

}
