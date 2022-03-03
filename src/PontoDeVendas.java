
/*Desenvolva uma aplicação no console(terminal) de ponto de vendas (PDV),
conforme modelo abaixo: - Valor total: 200,00 - Desconto(%): 5 - Total com desconto: 190,00
(valor calculado) - Valor pago: 200,00 - Troco: 10,00 (valor calculado) 
*/

import java.util.Scanner;
public class PontoDeVendas {

	public static void main(String[] args) {
		double pago,troco,desconto,pedido,pd,vp;
		Scanner leitor = new Scanner(System.in);
		
		
		//Puxar informações
		System.out.printf("Insira o valor do pedido: R$ ");
		pedido = leitor.nextDouble();
		System.out.print("Desconto (%) a ser dado no pedido: ");
		desconto = leitor.nextDouble();
		System.out.println("");
		
		pd = pedido * (desconto/100);
		System.out.println("Valor do pedido original: R$ "+pedido);
		System.out.println("Valor do pedido com desconto de "+((int) desconto)+"% : R$ "+pd);
		System.out.println("");
		
		//Informação sbre o valor pago
		
		System.out.printf("Valor entregue para pagamento: R$ ");
		pago = leitor.nextDouble();
		
		vp = pedido - pd;
		troco = Math.abs( pago- vp);
		
		//Caso tenha troco
		switch ((int)troco) {
		case 0:System.out.println("Pagamento realizado s/ troco");break;
			
		default:System.out.printf("Troco de: R$"+(double)troco);break;
			
		}
		leitor.close();
	}

}
