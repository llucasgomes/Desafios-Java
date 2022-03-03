/*- Desenvolva uma aplicação no console(terminal) que faça a conversão de
temperatura em Fahrenheit para Celsius. 
*/


import java.util.Scanner;

public class ConversaoDeTemperatura {

	public static void main(String[] args) {
		double  c,f;
		
		Scanner leitor = new Scanner(System.in);
		System.out.printf("1.Fahrenheit\n2.Celsius\nInsira a Temperatura a ser convertida: ");
		int temp = leitor.nextInt();
		
		
		//Logica 
		switch (temp) {
		case 1:
			System.out.print("Insira a Temperatura Fahrenheit: ");
			f = leitor.nextInt();
			c = (f - 32) / 1.8;
			System.out.print("Conversao ficará com o valor de "+ c +" C");
			break;
		case 2:
			System.out.print("Insira a Temperatura Celsius: ");
			c = leitor.nextInt();
			f = c * 1.8 + 32;
			System.out.print("Conversao ficará com o valor de "+ f +" F");
			break;		

		default:
			System.out.print("INVALIDO!!!!!!!");
			break;
		}
		leitor.close();
		
	}

}
