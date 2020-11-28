package herancas;

public class Funcionario extends Pessoa {
	private Integer matricula;
	private Double salario;
	
	
	public Funcionario() {
		super();
	}


	public Funcionario(String nome, String sobrenome, Double salario, Integer matricula) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
	}


	public Integer getMatricula() {
		return matricula;
	}


	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		if(salario < 0) {
			System.out.print("Impossivel receber valor negativo");
		}else {
			this.salario = salario;
		}

	}
	
	public Double getSalarioPrimeiraParcela() {
		return getSalario() * 0.6;
	}
	
	public Double getSalarioSegundaParcela() {
		return getSalario() * 0.4;
	}
	
	
	
	
}
