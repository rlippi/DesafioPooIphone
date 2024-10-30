package usuario;

import funcionalidades.smartphone.Iphone;
import funcionalidades.internet.*;
import funcionalidades.musica.*;
import funcionalidades.telefone.*;

public class Usuario {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		Internet internet = iphone;
		Musica musica = iphone;
		Telefone telefone = iphone;
		
		System.out.println("NAVEGADOR SAFARI");
		internet.adicionarNovaAba();
		internet.atualizarPagina();
		internet.exibirPagina("http://teste.com");
		
		System.out.println();
		
		System.out.println("IPOD");
		musica.pausar();
		musica.selecionarMusica("Wicked Game");
		musica.tocar();
		
		System.out.println();
		
		System.out.println("LIGAÇÃO");
		telefone.atender();
		telefone.iniciarCorreioVoz();
		telefone.ligar("19933381243");		
		
	}

}
