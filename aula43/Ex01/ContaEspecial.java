package ex01;

public class ContaEspecial extends ContaBancaria{
	private double  limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		String s ="***Conta Especial***\n";
		s += "Limite: " +limite +"\n";
		s += super.toString();
		return s;	}
	
	public void sacar(double saque) {		//4 criar os métodos
		if(saque<=(this.getSaldo() + limite)) {
			this.setSaldo(this.getSaldo() - saque);
			System.out.printf("Saque %.2f realizado com sucesso\n", saque);
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	

}
