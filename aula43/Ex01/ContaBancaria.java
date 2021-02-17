package ex01;

public class ContaBancaria {
	private String nomeCliente;			// 1 atributos em private
	private String numConta;
	private static double saldo;
	
	public String getNomeCliente() {	// 2 criar os getters and setters
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {					// 3 criar o toString
		// TODO Auto-generated method stub
		String s="";
		s += "Nome: " +nomeCliente;
		s += "\nConta: " +numConta;
		s += "\nSaldo: " +saldo;
		s +="\n";
		return s;
	}
	
	public void sacar(double saque) {		//4 criar os métodos
		if(saque<=saldo) {
			saldo -= saque;
			System.out.printf("Saque %.2f realizado com sucesso\n", saque);
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public static void depositar(double deposito) {
		saldo += deposito;
		System.out.printf("Depósito de %.2f realizado com sucesso.\n", deposito);
		System.out.printf("Saldo de %.2f\n", saldo);
	}
	
}
