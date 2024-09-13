package Prova;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ContaEmpresarial contaE1 = new ContaEmpresarial();
		ContaEmpresarial contaE2 = new ContaEmpresarial();
		
		ContaPessoaFisica contaF1 = new ContaPessoaFisica();
		ContaPessoaFisica contaF2 = new ContaPessoaFisica();
		ContaPessoaFisica contaF3 = new ContaPessoaFisica();
		
		ContaPoupanca contaP1 = new ContaPoupanca();
		ContaPoupanca contaP2 = new ContaPoupanca();
		
	     System.out.println("Cadastro da Conta Empresarial 1:");
	        System.out.print("Digite o Número da Conta: ");
	        int numeroContaE1 = input.nextInt();
	        input.nextLine(); 
	        
	        System.out.print("Digite o Nome do Titular: ");
	        String nomeTitularE1 = input.nextLine();
	        
	        System.out.print("Digite a Idade do Titular: ");
	        int idadeE1 = input.nextInt();
	        
	        System.out.print("Digite o Saldo Inicial: ");
	        double saldoE1 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Saque: ");
	        double limiteSaqueE1 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Empréstimo: ");
	        double limiteEmprestimoE1 = input.nextDouble();
	        
	        contaE1.setNumeroDaConta(numeroContaE1);
	        contaE1.setNomeTitular(nomeTitularE1);
	        contaE1.setIdade(idadeE1);
	        contaE1.saldo(saldoE1);  
	        contaE1.setLimiteSaque(limiteSaqueE1);
	        contaE1.setLimiteEmprestimos(limiteEmprestimoE1);
		
	        System.out.println("----------------------------------------------------------------------------");
	        
	        System.out.println("\nCadastro da Conta Empresarial 2:");
	        System.out.print("Digite o Número da Conta: ");
	        int numeroContaE2 = input.nextInt();
	        input.nextLine();  
	        
	        System.out.print("Digite o Nome do Titular: ");
	        String nomeTitularE2 = input.nextLine();
	        
	        System.out.print("Digite a Idade do Titular: ");
	        int idadeE2 = input.nextInt();
	        
	        System.out.print("Digite o Saldo Inicial: ");
	        double saldoE2 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Saque: ");
	        double limiteSaqueE2 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Empréstimo: ");
	        double limiteEmprestimoE2 = input.nextDouble();
	       
	        contaE2.setNumeroDaConta(numeroContaE2);
	        contaE2.setNomeTitular(nomeTitularE2);
	        contaE2.setIdade(idadeE2);
	        contaE2.saldo(saldoE2);
	        contaE2.setLimiteSaque(limiteSaqueE2);
	        contaE2.setLimiteEmprestimos(limiteEmprestimoE2);
	        
	        System.out.println("----------------------------------------------------------------------------");
	        
	        System.out.println("\nCadastro da Conta Pessoa Física 1:");
	        System.out.print("Digite o Número da Conta: ");
	        int numeroContaF1 = input.nextInt();
	        input.nextLine(); 
	        
	        System.out.print("Digite o Nome do Titular: ");
	        String nomeTitularF1 = input.nextLine();
	        
	        System.out.print("Digite a Idade do Titular: ");
	        int idadeF1 = input.nextInt();
	        
	        System.out.print("Digite o Saldo Inicial: ");
	        double saldoF1 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Saque: ");
	        double limiteSaqueF1 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Empréstimo: ");
	        double limiteEmprestimoF1 = input.nextDouble();

	        contaF1.setNumeroDaConta(numeroContaF1);
	        contaF1.setNomeTitular(nomeTitularF1);
	        contaF1.setIdade(idadeF1);
	        contaF1.saldo(saldoF1);
	        contaF1.setLimiteSaque(limiteSaqueF1);
	        contaF1.setLimiteEmprestimo(limiteEmprestimoF1);
	        
	        System.out.println("----------------------------------------------------------------------------");
	        
	        System.out.println("\nCadastro da Conta Pessoa Física 2:");
	        System.out.print("Digite o Número da Conta: ");
	        int numeroContaF2 = input.nextInt();
	        input.nextLine(); 
	        
	        System.out.print("Digite o Nome do Titular: ");
	        String nomeTitularF2 = input.nextLine();
	        
	        System.out.print("Digite a Idade do Titular: ");
	        int idadeF2 = input.nextInt();
	        
	        System.out.print("Digite o Saldo Inicial: ");
	        double saldoF2 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Saque: ");
	        double limiteSaqueF2 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Empréstimo: ");
	        double limiteEmprestimoF2 = input.nextDouble();

	        contaF1.setNumeroDaConta(numeroContaF2);
	        contaF1.setNomeTitular(nomeTitularF2);
	        contaF1.setIdade(idadeF2);
	        contaF1.saldo(saldoF2);
	        contaF1.setLimiteSaque(limiteSaqueF2);
	        contaF1.setLimiteEmprestimo(limiteEmprestimoF2);
	        
	        System.out.println("----------------------------------------------------------------------------");
	        
	        System.out.println("\nCadastro da Conta Pessoa Física 3:");
	        System.out.print("Digite o Número da Conta: ");
	        int numeroContaF3 = input.nextInt();
	        input.nextLine(); 
	        
	        System.out.print("Digite o Nome do Titular: ");
	        String nomeTitularF3 = input.nextLine();
	        
	        System.out.print("Digite a Idade do Titular: ");
	        int idadeF3 = input.nextInt();
	        
	        System.out.print("Digite o Saldo Inicial: ");
	        double saldoF3 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Saque: ");
	        double limiteSaqueF3 = input.nextDouble();
	        
	        System.out.print("Digite o Limite de Empréstimo: ");
	        double limiteEmprestimoF3 = input.nextDouble();

	        contaF1.setNumeroDaConta(numeroContaF3);
	        contaF1.setNomeTitular(nomeTitularF3);
	        contaF1.setIdade(idadeF3);
	        contaF1.saldo(saldoF3);
	        contaF1.setLimiteSaque(limiteSaqueF3);
	        contaF1.setLimiteEmprestimo(limiteEmprestimoF3);
	        
	        System.out.println("----------------------------------------------------------------------------");
	        
	     
	        System.out.println("\nCadastro da Conta Poupança 1:");
	        System.out.print("Digite o Número da Conta: ");
	        int numeroContaP1 = input.nextInt();
	        input.nextLine();  

	        System.out.print("Digite o Nome do Titular: ");
	        String nomeTitularP1 = input.nextLine();

	        System.out.print("Digite a Idade do Titular: ");
	        int idadeP1 = input.nextInt();

	        System.out.print("Digite o Saldo Inicial: ");
	        double saldoP1 = input.nextDouble();

	        contaP1.setNumeroDaConta(numeroContaP1);
	        contaP1.setNomeTitular(nomeTitularP1);
	        contaP1.setIdade(idadeP1);
	        contaP1.saldo(saldoP1); 

	        System.out.println("----------------------------------------------------------------------------");
	        
	        System.out.println("\nCadastro da Conta Poupança 2:");
	        System.out.print("Digite o Número da Conta: ");
	        int numeroContaP2 = input.nextInt();
	        input.nextLine();  

	        System.out.print("Digite o Nome do Titular: ");
	        String nomeTitularP2 = input.nextLine();

	        System.out.print("Digite a Idade do Titular: ");
	        int idadeP2 = input.nextInt();

	        System.out.print("Digite o Saldo Inicial: ");
	        double saldoP2 = input.nextDouble();

	       
	        contaP2.setNumeroDaConta(numeroContaP2);
	        contaP2.setNomeTitular(nomeTitularP2);
	        contaP2.setIdade(idadeP2);
	        contaP2.saldo(saldoP2); 
	        
	       contaE1.exibirExtrato();
	       contaE2.exibirExtrato();
	       contaF1.exibirExtrato();
	       contaF2.exibirExtrato();
	       contaF3.exibirExtrato();
	       contaP1.exibirExtrato();
	       contaP2.exibirExtrato();
	   
	  
	        
	        
    
	}

}
