	
	public class TestaModeloAnemico {
		
		public static void main(String[] args) {
			
			Conta conta = new Conta();
			
			conta.setTitular("João");
			
			/* APOS CRIARMOS OS METODOS SACA(), DEPOSITA(), A INTERAÇÃO DO USUARIO VAI SER SEMPRE POR ESSES METODOS
			conta.setSaldo(100);
					 
			double valorSaque = 50.0;
			
			System.out.println("saldo inicial = R$" + conta.getSaldo());
			if(conta.getSaldo() >= valorSaque) {
				double novoSaldo = conta.getSaldo() - valorSaque;
				conta.setSaldo(novoSaldo);
				System.out.println("SAQUE REALIZADO COM SUCESSO!");
			} else {
				System.out.println("SALDO INSUFICIENTE PARA SAQUE.");
			}
			
			System.out.println("novo saldo = R$" + conta.getSaldo()); */
			
			//Apos criação do metodo:
			
			conta.deposita(100.05);
			
			double valorSaque = 150.00;
			System.out.println(conta.saca(valorSaque));
			System.out.println("Saldo atualizado = R$ " + conta.getSaldo());
			
			double valorDeposito = 70.0;
			conta.deposita(valorDeposito);
			
		}
	
	}
