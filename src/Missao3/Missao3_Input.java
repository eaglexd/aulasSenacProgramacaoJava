package Missao3;
/*
 * Autor: Adler Felippe Marques
 * Data: 12/03/2022
 */

import java.util.Scanner;

public class Missao3_Input {

	public static void main(String[] args) {
		//Criando o Objeto entrada baseado na classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		//Criando as entradas de dados
		System.out.println("Digite uma Frase: ");
		String Texto = entrada.nextLine();
		
		System.out.println("Digite um número inteiro: ");
		int N_int = entrada.nextInt();
		
		System.out.println("Digite um número real: ");
		double N_double = entrada.nextDouble();
		
		//Mostrando o Resultado das entradas
		System.out.println(Texto);
		System.out.println(N_int);
		System.out.println(N_double);
		
		//Fechando o objeto entrada
		entrada.close();

	}

}
