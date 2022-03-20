package Missao3;
/*
 * Autor: Adler Felippe Marques
 * Data: 11/03/22
 */
public class Missao3_Main {

	public static void main(String[] args) {
		//Apresenta o Título da Missão
		System.out.println("Inicio da Missão 3 (Principal)");
		System.out.println("Autor: Adler Felippe Marques");
		System.out.println("Data: 11/03/22");
		
		//Declarando Variaveis
		double R_SOMA,R_SUB,R_MULT,R_DIV;
		
		//Inicio do Codigo
		Missao3_Calculadora obj_calculadora = new Missao3_Calculadora();
			
		//COLOCANDO VALOR NAS VARIAVEIS SEM PARAMETROS
		/*
		 * obj_calculadora.N1 = 20.5;
		 * obj_calculadora.N2 = 12.1;
		*/
		
		//COLOCANDO VALOR NAS VARIAVEIS DO METODO COM PARAMETROS
		R_SOMA = obj_calculadora.SOMAR(2,2);
		System.out.println(R_SOMA);
		
		R_SUB = obj_calculadora.SUBTRAIR(2,2);
		System.out.println(R_SUB);
		
		R_DIV = obj_calculadora.DIVIDIR(2,2);
		System.out.println(R_DIV);
		
		R_MULT = obj_calculadora.MULTIPLICAR(2,2);
		System.out.println(R_MULT);
		

	}

}
