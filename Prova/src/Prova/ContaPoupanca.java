package Prova;

public class ContaPoupanca extends Conta {
	private final double rendimento;

		
		public ContaPoupanca() {
			super();
			this.rendimento = 0.07;
		}
		public ContaPoupanca(int numeroDaConta, String nomeTitular, int idade, double saldoDaConta, double rendimento) {
			super(numeroDaConta, nomeTitular, idade, saldoDaConta);
			this.rendimento = rendimento;
		}
		public double getRendimento() {
			return rendimento;
		}
		
		public double atualizarComRendimento() {
			double novoValor = getSaldoDaConta() + (getSaldoDaConta() * rendimento);
			System.out.println("Rendimento aplicado: Novo Saldo: " + novoValor);
			return novoValor;
		}
		public void exibirExtrato() {
	        System.out.println("Conta Empresarial:");
	        System.out.println("Número da Conta: " + getNumeroDaConta());
	        System.out.println("Nome do Titular: " + getNomeTitular());
	        System.out.println("Idade do Titular: " + getIdade());
	        System.out.println("Saldo: " + getSaldoDaConta());
	        System.out.println("Rendimento: " + getRendimento());
	        System.out.println("----------------------------------------------------------------------------");
		}
	    
	}
