package conta.model;

import conta.util.Cores;

public abstract class Conta {
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	private int aniversario;

	public Conta(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
		this.aniversario = aniversario;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\n Saldo Induficiente!" + Cores.TEXT_RESET);
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public void depositar(float valor) {

	}

	public void visualizar() {
		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;

		}
		System.out.println("_____________________________________");
		System.out.println("|          Dados da Conta           |");
		System.out.println("|___________________________________|");
		System.out.println("Número: " + this.numero);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);

	}
}