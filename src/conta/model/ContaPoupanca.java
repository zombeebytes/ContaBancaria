package conta.model;

import conta.model.Conta;

public class ContaPoupanca extends Conta {
	private int aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {

		super(numero, agencia, tipo, titular, saldo, aniversario);
		this.aniversario = aniversario;

	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("\nAniversário da Conta: " + this.aniversario);
	}
}