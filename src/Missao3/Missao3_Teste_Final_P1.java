package Missao3;
import java.util.Scanner;
/*
 * Autor: Adler Felippe Marques
 * Data: 11/03/22
 */
public class Missao3_Teste_Final_P1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//Declarando Variaveis
		double R_SOMA,R_SUB,R_MULT,R_DIV;
		
		
		
		//Inicio do Codigo
		Missao3_Calculadora obj_calculadora = new Missao3_Calculadora();
			
		//COLOCANDO VALOR NAS VARIAVEIS DO METODO COM PARAMETROS
		System.out.println("Digite o Primeiro número para os cálculos: ");
		double x1 = entrada.nextDouble();
		
		System.out.println("Digite o Segundo número para os cálculos> ");
		double x2 = entrada.nextDouble();
		
		R_SOMA = obj_calculadora.SOMAR(x1,x2);
		System.out.println("O resultado da Soma é: "+R_SOMA);
		
		R_SUB = obj_calculadora.SUBTRAIR(x1,x2);
		System.out.println("O resultado da Subtração é: "+R_SUB);
		
		if(x2==0) {
			System.out.println("Impossível dividir por 0");			
		} else {
		R_DIV = obj_calculadora.DIVIDIR(x1,x2);
		System.out.println("O resultado da Divisão é: "+R_DIV);
		}
		R_MULT = obj_calculadora.MULTIPLICAR(x1,x2);
		System.out.println("O resultado da Multiplicação é: "+R_MULT);
		

	}

}
