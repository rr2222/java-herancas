package herancas;

public class Poupanca extends Conta {
	
	private Integer diaRendimento;
	
	

	public Poupanca() {
		super();
		
	}


	public Poupanca(Double saldo) {
		super(saldo);
		
	}


	public Poupanca(Double saldo, Integer diaRendimento) {
		super(saldo);
		this.diaRendimento = diaRendimento;
	}


	public Integer getDiaRendimento() {
		return diaRendimento;
	}


	public void setDiaRendimento(Integer diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	@Override
	public void setSaldo(Double valor) {
		if(valor < 0) {
			System.out.println("Impossivel depositar valor negativo");
		}else {
			saldo = saldo + valor;
		}
	}
	
	public void sacar(Double valor) {
		this.saldo = this.saldo - valor;
	}
	
	
}
