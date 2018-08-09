package entities;

public class Conta {
	
	private int numConta;
	private String titular;
	private double saldo;
	private final double TAXA_SAQUE = 5.00;
	
	public Conta(int numConta, String titular, double depositoInicial) {
		this.numConta = numConta;
		this.titular = titular;
		deposito(depositoInicial);
		
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void deposito(double dp) {
		if(dp > 0)saldo += dp;
		
	}
	
	public void saque(double sq) {
		if(sq > 0) saldo -= (TAXA_SAQUE + sq);
	}
	
	public String toString() {
		return "Account "
			  + getNumConta()
			  +", Holder: "
			  + getTitular()
			  +", Balance: $ "
			  + String.format("%.2f",getSaldo() ) ;
	}
	
}
