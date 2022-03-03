/*- Desenvolva uma aplicação no console(terminal) para calcular o valor da hora de
um serviço. 
*/


import java.util.Scanner;
public class HoraDeServico {

	public static void main(String[] args) {
		int hora;
		double valor;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Valor do serviço: R$ ");
		valor = leitor.nextDouble();
		System.out.print("Em quantas horas finalizou o serviço: ");
		hora = leitor.nextInt();
		System.out.println("");
		
		valor =   valor / (double)hora;
		System.out.print("O valor da hora sairá por R$ "+valor);
		
		leitor.close();
		
				

	}

}
