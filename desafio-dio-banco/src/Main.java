
public class Main {

	public static void main(String[] args ) {
		Cliente eri = new Cliente();
		eri.setNome("Eri");
		
		Conta cc = new ContaCorrente(eri);
		Conta poupanca = new ContaPoupanca(eri);
		
		cc.depositar(100);		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
