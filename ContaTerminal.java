package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[]args) {
		int numeroConta;
		String Agencia;
		String cliente;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do cliente: ");
		cliente = entrada.nextLine();
		
		// usuário digitando o número da agência 
		System.out.println("Olá, digite o número da sua agência: ");
		Agencia = entrada.nextLine();
		
		// usuário digitando o número da conta 
		System.out.println("Agora, digite o número da sua conta: ");
		numeroConta = entrada.nextInt();
		
		// usuário verificando o saldo
		System.out.println("Digite o Saldo: ");
		String saldoStr = entrada.nextLine(); // Lê toda a linha

		double saldo = 0;
		try {
		    saldo = Double.parseDouble(saldoStr); // Convertendo para double 
		} catch (NumberFormatException e) {
		    System.out.println("Erro: Saldo inválido. Digite novamente:");
		    saldoStr = entrada.nextLine(); // Lendo o novo valor
		    try {
		        saldo = Double.parseDouble(saldoStr);
		    } catch (NumberFormatException e2) {
		        System.out.println("Erro: Falha ao ler o saldo. Saldo padrão (0) será utilizado.");
		        saldo = 0; // Valor padrão
		        
		    }
		}
		/* no método saldo, foi utilizado digamos que uma exceção, 
		 foi criado atráves do try, a exceção para que apareça a mensagem para o usuário
		 e ele digite novamente para que assim, o valor seja salvo. 
		*/

		
		// Após todas as informações terem sido inseridas, o sistema agora irá exibir a mensagem:
		System.out.println("Olá "+cliente+", obrigado por criar uma conta "
				+ "em nosso banco!");
		System.out.println("Sua agência é "+Agencia+", sua conta é "+numeroConta+" e seu saldo de "+saldo+" já está disponível.");
		
	}

}
