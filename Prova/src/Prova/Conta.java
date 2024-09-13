package Prova;

public class Conta {

		private int numeroDaConta;
		private String nomeTitular;
		private int idade;
		private double saldoDaConta;

		public Conta() {
			this.numeroDaConta = 0;
			this.nomeTitular = "";
			this.idade = 0;
			this.saldoDaConta = 0.0;
		}

		public Conta(int numeroDaConta, String nomeTitular, int idade, double saldoDaConta) {
			this.numeroDaConta = numeroDaConta;
			this.nomeTitular = nomeTitular;
			this.idade = idade;
			this.saldoDaConta = saldoDaConta;
		}

		public int getNumeroDaConta() {
			return numeroDaConta;
		}

		public String getNomeTitular() {
			return nomeTitular;
		}

		public int getIdade() {
			return idade;
		}

		public double getSaldoDaConta() {
			return saldoDaConta;
		}

		public void setNumeroDaConta(int numeroDaConta) {
			this.numeroDaConta = numeroDaConta;
		}

		public void setNomeTitular(String nomeTitular) {
			this.nomeTitular = nomeTitular;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public double depositar(double valor) {
			if (valor > 0) {
				saldoDaConta += valor;
				return saldoDaConta;
			}
			return saldoDaConta;
		}
		
		public double saldo(double valor) {
			saldoDaConta += valor;
			return saldoDaConta;
		}
		public double sacar(double valor) {
	        if (valor <= saldoDaConta) {
	            saldoDaConta -= valor;
	        } else {
	            System.out.println("Saldo insuficiente para saque.");
	        }
	        return saldoDaConta;
		}

		public double emprestimo(double valor) {
	        if (valor <= saldoDaConta) {
	            saldoDaConta -= valor;
	        } else {
	            System.out.println("Empréstimo não pode ser realizado.");
	        }
	        return saldoDaConta;
			
		}

	}

