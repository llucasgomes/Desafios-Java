/*Para carros com motor flex � preciso ter cautela ao escolher o combust�vel na
hora de abastecer. A principal diferen�a de pre�os e vantagens entre os dois combust�veis est�
na propor��o pre�o X desempenho. Para o �lcool ser mais vantajoso do que a gasolina, o pre�o
do litro tem que custar at� 70% do litro da gasolina. Baseado nestas informa��es desenvolva
um aplicativo no console(terminal) para determinar qual � o combust�vel mais vantajoso para
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
