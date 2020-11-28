package herancas;

public class Professor extends Funcionario {
	
	
	
	public Professor() {
		super();
		
	}

	public Professor(String nome, String sobrenome, Double salario, Integer matricula) {
		super(nome, sobrenome, salario, matricula);
		
	}

	@Override
	public Double getSalarioPrimeiraParcela() {
		return getSalario();
	}
	
	public Double getSalarioSegundaParcela() {
		return 0.0;
	}
	
}
