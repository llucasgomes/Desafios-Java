/*Para carros com motor flex é preciso ter cautela ao escolher o combustível na
hora de abastecer. A principal diferença de preços e vantagens entre os dois combustíveis está
na proporção preço X desempenho. Para o álcool ser mais vantajoso do que a gasolina, o preço
do litro tem que custar até 70% do litro da gasolina. Baseado nestas informações desenvolva
um aplicativo no console(terminal) para determinar qual é o combustível mais vantajoso para
abastecer*/


import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		double gasolina,alcool;
		Scanner leitor = new Scanner (System.in);
		
		//Pegando Info
		
		System.out.print("Valor da Gasolina: R$");
		gasolina = leitor.nextDouble();
		System.out.print("Valor da Alcool: R$");
		alcool = leitor.nextDouble();
		
		if (alcool <= (gasolina * 0.7)) {
			System.out.print("Mais vantagem abatecer com ALCOOL");
			
		} else {
			System.out.print("Mais vantagem abatecer com GASOLINA");
		}
		leitor.close();
	}

}
