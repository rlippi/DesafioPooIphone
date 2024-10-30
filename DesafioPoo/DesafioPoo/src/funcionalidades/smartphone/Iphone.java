package funcionalidades.smartphone;

import funcionalidades.internet.Internet;
import funcionalidades.musica.Musica;
import funcionalidades.telefone.Telefone;

public class Iphone implements Internet, Musica, Telefone{
	
	//FUNCIONALIDADES DA INTERNET
	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando Aba pelo iPhone...");
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página pelo Iphone...");
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página pelo iPhone... " + url);
	}
		
		
	//FUNCIONALIDES DE MÚSICA
	@Override
	public void tocar() {
		System.out.println("Tocando música pelo iPhone...");
	}
	
	@Override
	public void pausar() {
		System.out.println("Pausando música pelo iPhone...");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música pelo iPHone... " + musica);
	}
	
	
	//FUNCIONALIDADES DE TELEFONE
	@Override
	public void atender() {
		System.out.println("Atendendo ligação pelo iPhone...");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando pelo iPhone... " + numero);
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz pelo iPhone...");
	}

	

	
	
	
	
}
