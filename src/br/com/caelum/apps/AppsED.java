package br.com.caelum.apps;

import br.com.caelum.modelo.Aluno;
import br.com.caelum.modelo.Vetor;

public class AppsED {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		Aluno aluno6 = new Aluno();

		aluno1.setNome("João");
		aluno2.setNome("José");
		aluno3.setNome("Maria");
		aluno4.setNome("Pedro");
		aluno5.setNome("Arquimedes");
		aluno6.setNome("Helton");

		Vetor lista = new Vetor();
		lista.inserirFimLista(aluno1);//Adiciona João na posição 0
		lista.inserirFimLista(aluno2);//Adiciona José na posição 1

		lista.inserirPosicaoDefinida(aluno3, 10);//Adiciona Maria na posição 10
		lista.inserirPosicaoDefinida(aluno4, 8);//Adiciona Pedro na posição 8
		
		lista.inserirFimLista(aluno6);//Adiciona Helton na posição 2
		System.out.println("Retornar Dados Posição Definida :" + lista.retornaDadosPosicaoDefinida(10));

		//Impressões
		lista.quantidadeListagem();
		lista.imprimirDadosDaLista();
		//Impressões
		

		lista.removeDadosPosicaoDefinida(0);//Remove João na posição 0
		lista.removeDadosPosicaoDefinida(4);
		lista.inserirFimLista(aluno5);
		System.out.println("==================================================");
		lista.imprimirDadosDaLista();

		if (lista.verificarElementoListagem(aluno1) == true) {
			System.out.println("Objeto " + aluno1.getNome() + " encontrado!");
		} else {
			System.out.println("Objeto " + aluno1.getNome() + " não encontrado!");
		}

	}

}
