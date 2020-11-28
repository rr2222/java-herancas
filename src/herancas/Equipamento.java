package herancas;

public class Equipamento {
	private Boolean ligado;

	public Equipamento(Boolean ligado) {
		
		this.ligado = ligado;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}
	
	public Boolean getLigado() {
		return ligado;
	}

	
	public void liga() {
		this.ligado = true;
	}
	
	public void desliga() {
		this.ligado = false;
	}
	
	
	
}
