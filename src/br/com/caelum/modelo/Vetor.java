package br.com.caelum.modelo;

import br.com.caelum.interfaceagenda.ListaAlunos;

public class Vetor implements ListaAlunos {

	private Aluno[] alunos = new Aluno[100];
	private static int controle = 0;
	@Override
	public void inserirFimLista(Aluno aluno) {

		if (alunos[controle] == null) {
			alunos[controle] = aluno;
			
		} else {
			System.out.println("Não foi inserido! Limite maximo de " + controle + " excedido de Aluno");
		}
		this.controle++;
	}

	@Override
	public void inserirPosicaoDefinida(Aluno aluno, int posicao) {

		if (alunos[posicao] == null) {
			alunos[posicao] = aluno;
		} else {
			System.out.println("Não foi inserido! A posição " + posicao + " contem Aluno!");
		}

	}

	@Override
	public Aluno retornaDadosPosicaoDefinida(int posicao) {

		Aluno aluno = null;
		if (alunos[posicao] != null) {
			aluno = alunos[posicao];
		}
		return aluno;
	}

	@Override
	public void removeDadosPosicaoDefinida(int posicao) {
		if (alunos[posicao] != null) {
			alunos[posicao] = null;
		} else {
			System.out.println("Não foi removido por não existir aluno cadastrado na posição[ " + posicao + "].");
		}

	}

	@Override
	public boolean verificarElementoListagem(Aluno aluno) {

		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i] != null && alunos[i].getNome().equals(aluno.getNome())) {
				return true;
			}

		}

		return false;
	}

	@Override
	public void quantidadeListagem() {

		System.out.println("Total Cadastrado :" + alunos.length);

	}

	public void imprimirDadosDaLista() {
		for (Aluno aluno : alunos) {
			///if (aluno != null) {
				System.out.println("Lista de Alunos Cadastrados " + aluno);
			//}

		}
	}
	

}
