package semana04;

public class ContaBancaria {
	
	private double saldo;
	private final int LIMITE_SAQUE = 1000;
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(valor <= LIMITE_SAQUE) {
			if(valor <= saldo) {
				this.saldo -= valor;
			}
			else {
				System.out.println("Saldo insuficiente!");
			}
		}
		else {
			System.out.println("Valor máximo atingido!");
		}
	}
	
	public void consultar() {
		System.out.println(this.saldo);
	}

	public void transfere(ContaBancaria conta, double valor) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	

}
