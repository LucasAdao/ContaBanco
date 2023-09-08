package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = sca.nextLine();
		
		System.out.println("Oi " + nome + "!! Vamos te ajudar a acessar sua conta no banco!");
		System.out.println("Digite sua agência:");
		String agn = sca.nextLine();
		System.out.println("Digite o número da sua conta:");
		int conta = sca.nextInt();
		double saldo = 237.48;
		System.out.println("Olá " + nome + ", obrigado por usar nosso banco, sua Agência é:"+ agn +" e sua conta é:" + conta+ " e seu saldo de R$"+ saldo + " já esta disponível para saque!!!");
		sca.close();
	}

}
