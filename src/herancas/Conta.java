package herancas;

public class Conta {
	protected Double saldo;
	
	public Conta() {}
	
	public Conta(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double valor) {
		this.saldo = valor;
	}
	
	public void sacar(Double valor) {
		this.saldo = this.saldo - valor;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
