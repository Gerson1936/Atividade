package Prova;

public class ContaEmpresarial extends Conta {

	private double limiteSaque;
	private double limiteEmprestimo;

	public ContaEmpresarial() {
		super();
		this.limiteSaque = 0.0;
		this.limiteEmprestimo = 0.0;
	}

	public ContaEmpresarial(int numeroDaConta, String nomeTitular, int idade, double saldoDaConta,
			double limiteSaque, double limiteEmprestimos) {
		super(numeroDaConta, nomeTitular, idade, saldoDaConta);
		this.limiteSaque = limiteSaque;
		this.limiteEmprestimo = limiteEmprestimos;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public double getLimiteEmprestimos() {
		return limiteEmprestimo;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void setLimiteEmprestimos(double limiteEmprestimos) {
		this.limiteEmprestimo = limiteEmprestimos;
	}

	@Override
	public double emprestimo(double valor) {
		if (valor > 0 && valor <= limiteEmprestimo) {
			double emprestimoComTaxa = valor + 50.0;
			return super.emprestimo(emprestimoComTaxa);
		} else {
			System.out.println("Saldo insuficiente para saque.");
			return getSaldoDaConta();
		}

	}
	@Override
	public double sacar(double valor) {
		if (valor > 0 && valor <= limiteSaque) {
			double sacarComTaxa = valor + 5.0;
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
        System.out.println("Limite de Empréstimo: " + getLimiteEmprestimos());
        System.out.println("----------------------------------------------------------------------------");
    }
}
