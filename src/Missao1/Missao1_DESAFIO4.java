package Missao1;
/*
 * Autor: Adler Felippe Marques
 * Data: 06/03/22
 */
public class Missao1_DESAFIO4 {

	public static void main(String[] args) {
		//Apresenta o T?tulo da Miss?o
		System.out.println("Inicio da Miss?o 1 (Desafio 4)");
		System.out.println("Autor: Adler Felippe Marques");
		System.out.println("Data: 06/03/22");
		System.out.println("Altera??o do Desafio 2");
		
		//Declarando as vari?veis
		int trabalho1=15,prova1=51,trabalho2=28,prova2=63,nota_1_bimestre,nota_2_bimestre;
		double nota_final;
		//Calculando
		nota_1_bimestre=trabalho1+prova1;
		nota_2_bimestre=trabalho2+prova2;
		nota_final=(double)(nota_1_bimestre+nota_2_bimestre)/2;
		System.out.println("A m?dia final do aluno ? "+nota_final);
		System.out.println("DESAFIO 4 CONCLU?DO! - M?DIA CALCULADA COM CAST");
	}

}