package exercise3;

public class ContaBancaria {
	
	private int numeroConta;
	private double saldo;
	private String titular;
	
	public ContaBancaria(){
		this.saldo = 0.0;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double saldo() {
		return saldo;
	}
	
	public String titular() {
		return titular;
	}
	
	public void setNumeroConta(int numConta) {
		this.numeroConta = numConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setTitular(String nome) {
		this.titular = nome;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito no valor de " + valor + " realidado com sucesso!");
		
	}
	
	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Fundos insuficientes para saque!");
		}else {
			saldo -= valor;
			System.out.println("Saque no valor de " + valor+ " realizado com sucesso!");
		}
	} 
	
	public void exibirDados() {
		System.out.println("Nome do titular:  " + titular);
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("O saldo atual da sua conta é: " + saldo);	
	}
	

}
