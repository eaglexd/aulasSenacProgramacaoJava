package Missao2;
/*
 * Autor: Adler Felippe Marques
 * Data: 06/03/22
 */
public class Missao2_DESAFIO4_EXTRA {

	public static void main(String[] args) {
		//Apresenta o T�tulo da Miss�o
		System.out.println("Inicio da Miss�o 2 (Desafio 4 EXTRA)");
		System.out.println("Autor: Adler Felippe Marques");
		System.out.println("Data: 07/03/22");
		System.out.println("Numeros Impares de 11 a 40");
		//Declara��o de Vari�veis
		int i = 11;
		//Inicio do C�digo
		while (i<=40) {
			if(i%2!=0){
				System.out.println(i);
			}
			i+=3;
		}
		System.out.println("Fim do C�digo de Numeros Pares");
		System.out.println("MISS�O 2 - DESAFIO 4 - CONCLU�DO");
	}

}
