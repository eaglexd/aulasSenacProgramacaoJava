package Missao2;
/*
 * Autor: Adler Felippe Marques
 * Data: 06/03/22
 */
public class Missao2_DESAFIO4_EXTRA {

	public static void main(String[] args) {
		//Apresenta o Título da Missão
		System.out.println("Inicio da Missão 2 (Desafio 4 EXTRA)");
		System.out.println("Autor: Adler Felippe Marques");
		System.out.println("Data: 07/03/22");
		System.out.println("Numeros Impares de 11 a 40");
		//Declaração de Variáveis
		int i = 11;
		//Inicio do Código
		while (i<=40) {
			if(i%2!=0){
				System.out.println(i);
			}
			i+=3;
		}
		System.out.println("Fim do Código de Numeros Pares");
		System.out.println("MISSÃO 2 - DESAFIO 4 - CONCLUÍDO");
	}

}
