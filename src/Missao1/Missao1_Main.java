package Missao1;
/*
 * Autor: Adler Felippe Marques
 * Data: 06/03/22
 */

public class Missao1_Main {

	public static void main(String[] args) {
		//Apresenta o Título da Missão
		System.out.println("Inicio da Missão 1");
		System.out.println("Autor: Adler Felippe Marques");
		System.out.println("Data: 06/03/22");
		System.out.println("Cálculo da Nota Bimestral");
		
		//Declara as variáveis
		int Nota_Trabalho=22,Nota_Prova=58,Nota_Bimestre;
		//Realiza a soma (Passo 3 da atividade)
		Nota_Bimestre = Nota_Trabalho+Nota_Prova;
		//Apresenta o resultado da nota bimestral no console (Passo 4 da atividade)
		System.out.println("A nota bimestral é: "+ Nota_Bimestre);
		

	}

}
