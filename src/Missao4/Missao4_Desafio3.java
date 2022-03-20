package Missao4;
/*
 * Autor: Adler Felippe Marques
 * Data: 13/03/22
 */
public class Missao4_Desafio3 {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------");
		System.out.println("Verificando o Comprimento da String");
		
		String nome="Adler";
		int tamanho = nome.length();
		System.out.println(tamanho);
		//-----------------------------------------------------------------------------------
		System.out.println("--------------------------------------------");
		System.out.println("Verificando Se são Strings iguais");
		
		String nome_cadastrado = "Adler";
		String nome_digitado = "Adler";
		if(nome_cadastrado.equals(nome_digitado)) {
			System.out.println("Os Nomes são iguais");
		}
		else {
			System.out.println("Os Nomes são diferentes");
		}
		//-----------------------------------------------------------------------------------
			System.out.println("--------------------------------------------");
			System.out.println("Verificando Se são Strings iguais(Metodo 2)");
			
			String nome_cadastrado1 = "Adler";
			String nome_cadastrado2 = "ADLER";
			
			if(nome_cadastrado1.equalsIgnoreCase(nome_cadastrado2))
				System.out.println("Os nomes são iguais");
			else
				System.out.println("Os nomes São Diferentes");
			
		//-----------------------------------------------------------------------------------
			System.out.println("--------------------------------------------");
			System.out.println("Identificando caractere em uma determinada posição");
			
			String nome1="Luiz";
			System.out.println(nome1.charAt(0)); //Primeira Letra do nome
			for (int i=3;i<nome1.length();i++) {
				System.out.println(nome1.charAt(i));
			}
			
			
			
			

	}

}
