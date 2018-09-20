package br.com.caelum.interfaceagenda;

import br.com.caelum.modelo.Aluno;

public interface ListaAlunos {
	
	public void inserirFimLista (Aluno aluno);
	public void inserirPosicaoDefinida(Aluno aluno, int posicao);
	public Aluno retornaDadosPosicaoDefinida(int posicao);
	public void removeDadosPosicaoDefinida(int posicao);
	public boolean verificarElementoListagem(Aluno aluno);
	public void quantidadeListagem();

}
