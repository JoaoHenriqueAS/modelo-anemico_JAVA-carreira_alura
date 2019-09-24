
public class Conta {
	
	private String titular;
	private double saldo;
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public String saca(double valor) {
		if(valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			String respostaPositiva = "Saque realizado com sucesso!";
			
			return respostaPositiva;
		}
		String respostaNegativa = "Saldo insuficiente para saque.";
		return respostaNegativa;
	}
	
	public String deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			String respostaPositiva = "Deposito realizado com sucesso!";
			
			return respostaPositiva;
		}
		String respostaNegativa = "Saldo insuficiente para Deposito.";
		return respostaNegativa;
	}
	 
	public double getSaldo() {
		return saldo;
	}

}
