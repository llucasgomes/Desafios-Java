/*Desenvolva uma aplicação no console(terminal) para calcular o valor da
porcentagem usando Regra de 3, conforme modelo abaixo: x% de y = valor  
*/


import java.util.Scanner;

public class RegraDeTres {

	public static void main(String[] args) {
		
		double porcentagem, valor;
		Scanner leitor = new Scanner(System.in);
		
		
	//Puxar informações
		System.out.printf("Insira o valor da %% a ser descoberto: ");
		porcentagem = leitor.nextDouble();
		System.out.printf("Insira o valor ser descoberto: ");
		valor = leitor.nextDouble();
		System.out.printf("");
		
	//Logica
		double res = (valor / 100)* porcentagem;
		System.out.printf(porcentagem+"%% de "+valor+" é "+res);
	
		leitor.close();
	}

}
