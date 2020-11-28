package application;

import herancas.Conta;
import herancas.Funcionario;
import herancas.Pessoa;
import herancas.Poupanca;
import herancas.Professor;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Joao", "Medeiros");
		Funcionario pessoa2 = new Funcionario("Leonardo", "Messias", 1000.00, 100);
		Professor pessoa3 = new Professor("Antonio", "Silva", 1500.00, 200);
		
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		System.out.println(pessoa3.getNomeCompleto());
		
		System.out.println("-----------------------");
		
		System.out.println(pessoa2.getSalarioPrimeiraParcela());
		System.out.println(pessoa2.getSalarioSegundaParcela());
		System.out.println(pessoa3.getSalarioPrimeiraParcela());
		System.out.println(pessoa3.getSalarioSegundaParcela());
		
		System.out.println("-----------------------");
		Conta conta1 = new Conta();
		conta1.depositar(10000.00);
		conta1.sacar(15000.00);
		Poupanca poupanca1 = new Poupanca();
		poupanca1.depositar(15000.00);
		poupanca1.sacar(20000.00);
		System.out.println(poupanca1.getSaldo());
		
		
		
		System.out.println();
	
	}

}
