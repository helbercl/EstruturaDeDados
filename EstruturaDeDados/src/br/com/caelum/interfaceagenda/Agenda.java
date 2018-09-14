package br.com.caelum.interfaceagenda;

import br.com.caelum.modelo.Contatos;

public interface Agenda {
	
	public void inserir(Contatos contato);
	public Contatos recuperar (Contatos contato);
	public void atualizar(Contatos contato);
	public void remover (Contatos contato);
	public void listaContatos();
	

}
