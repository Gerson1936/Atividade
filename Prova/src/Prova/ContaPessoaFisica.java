package Prova;

public class ContaPessoaFisica extends Conta {
	private double limiteSaque;
	private double limiteEmprestimo;

	public ContaPessoaFisica() {
		super();
		this.limiteSaque = 0.0;
		this.limiteEmprestimo = 0.0;
	}

	public ContaPessoaFisica(int numeroDaConta, String nomeTitular, int idade, double saldoDaConta,
			double limiteSaque, double limiteEmprestimo) {
		super(numeroDaConta, nomeTitular, idade, saldoDaConta);
		this.limiteSaque = limiteSaque;
		this.limiteEmprestimo = limiteEmprestimo;

	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	@Override
	public double emprestimo(double valor) {
		if (valor > 0 && valor <= limiteEmprestimo) {
			double emprestimoComTaxa = valor + 15.0;
			return super.emprestimo(emprestimoComTaxa);
		} else {
			System.out.println("Saldo insuficiente para saque.");
			return getSaldoDaConta();
		}

	}

	@Override
	public double sacar(double valor) {
		if (valor > 0 && valor <= limiteSaque) {
			double sacarComTaxa = valor + 3.0;
			return super.sacar(sacarComTaxa);
		} else {
			System.out.println("Saque falhou. Verifique o valor ou limite de saque.");
			return getSaldoDaConta();
		}
		
		
	}
	public void exibirExtrato() {
        System.out.println("Conta Empresarial:");
        System.out.println("Número da Conta: " + getNumeroDaConta());
        System.out.println("Nome do Titular: " + getNomeTitular());
        System.out.println("Idade do Titular: " + getIdade());
        System.out.println("Saldo: " + getSaldoDaConta());
        System.out.println("Limite de Saque: " + getLimiteSaque());
        System.out.println("Limite de Empréstimo: " + getLimiteEmprestimo());
        System.out.println("----------------------------------------------------------------------------");
    }
}
