package ex01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("12345");
		contaSimples.setSaldo(0);
		
		System.out.println(contaSimples);
		
		contaSimples.depositar(100);
		contaSimples.sacar(50);
		contaSimples.sacar(100);
		
		System.out.println();
		
		ContaPoupanca contaPoupanca= new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Poupança");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setSaldo(0);
		contaPoupanca.setDiaRendimento(18);

		contaPoupanca.depositar(100);
		contaPoupanca.sacar(50);
		contaPoupanca.sacar(100);

		System.out.println(contaPoupanca);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado. \nNovo Saldo: " +contaPoupanca.getSaldo());
		}else 
			System.out.println("Hoje não é dia de rendimento.");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setLimite(100);
		contaEspecial.setNomeCliente("Cliente Conta Especial");
		contaEspecial.setNumConta("3333");
		contaEspecial.setSaldo(-50);
		//contaEspecial.depositar(50);
		contaEspecial.sacar(100);
		//contaEspecial.sacar(50);
		
		System.out.println(contaPoupanca);
		
		System.out.println(contaEspecial);
	}

}
