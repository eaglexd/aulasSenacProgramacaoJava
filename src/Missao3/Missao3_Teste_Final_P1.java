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
		System.out.println("Digite o Primeiro n�mero para os c�lculos: ");
		double x1 = entrada.nextDouble();
		
		System.out.println("Digite o Segundo n�mero para os c�lculos> ");
		double x2 = entrada.nextDouble();
		
		R_SOMA = obj_calculadora.SOMAR(x1,x2);
		System.out.println("O resultado da Soma �: "+R_SOMA);
		
		R_SUB = obj_calculadora.SUBTRAIR(x1,x2);
		System.out.println("O resultado da Subtra��o �: "+R_SUB);
		
		if(x2==0) {
			System.out.println("Imposs�vel dividir por 0");			
		} else {
		R_DIV = obj_calculadora.DIVIDIR(x1,x2);
		System.out.println("O resultado da Divis�o �: "+R_DIV);
		}
		R_MULT = obj_calculadora.MULTIPLICAR(x1,x2);
		System.out.println("O resultado da Multiplica��o �: "+R_MULT);
		

	}

}
