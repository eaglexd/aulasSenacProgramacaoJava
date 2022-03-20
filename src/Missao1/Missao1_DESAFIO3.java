package Missao1;
/*
 * Autor: Adler Felippe Marques
 * Data: 06/03/22
 */
public class Missao1_DESAFIO3 {

	public static void main(String[] args) {
		//Apresenta o Título da Missão
		System.out.println("Inicio da Missão 1 - Desafio 3");
		System.out.println("Autor: Adler Felippe Marques");
		System.out.println("Data: 06/03/22");
		System.out.println("Conversão de Tipos");
		//Declaração de variáveis
		int A=7,B=6;
		double R1,R2;
		//Cálculo
		R1=(A+B)/2;
		R2=(double)(A+B)/2;		
		//Resultado
		System.out.println("O Resultado sem cast é: "+R1);
		System.out.println("O Resultado com cast é: "+R2);
		System.out.println("DESAFIO 3 CONCLUÍDO");

	}

}
