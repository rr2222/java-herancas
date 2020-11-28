package herancas;

public class Pessoa {
	private String nome;
	private String sobrenome;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return this.nome + " " + this.sobrenome; 
	}
	
	
	
}
