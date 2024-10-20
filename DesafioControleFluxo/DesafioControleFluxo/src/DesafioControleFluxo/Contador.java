package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			if (parametroUm == parametroDois) {
				System.out.println("Parâmetro UM igual ao Parâmetro DOIS.");
			}
			else if (parametroUm < parametroDois){
				System.out.println("Parâmetro UM MENOR que o Parâmetro DOIS.");
			}
			//else 
				//System.out.println("Parâmetro 1 menor que Parâmetro 2");
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
			
		terminal.close();	
			
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			System.out.println();
			System.out.println("O segundo parâmetro DEVE ser MAIOR que o primeiro.");
			System.out.println();
		}
		
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int indice = 1; indice <= contagem; indice++) {
			System.out.println("Imprimindo o número" + indice);
		}	
	}
}



