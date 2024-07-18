package poo.main;
import poo.gestaodecontas.Conta;
import poo.gestaodecontas.Cliente;
import poo.gestaodecaixaeletronico.CadastroContas;
import poo.gestaodecaixaeletronico.Terminal;
public class Main {
   
	public static void main(String[] args) {
		
		Cliente cliente[]= {new Cliente("123","Dhaniélysson"), new Cliente("456", "Jean"), new Cliente ("834", "Yago"), new Cliente ("347", "Robson")};
		
		
		CadastroContas c1= new CadastroContas(4);
		
		for(int i=0; i< cliente.length;i++) {
		//	c1.adicionaConta(new Conta(cliente[i+10],123,1000.0));
		c1.adicionaConta(new Conta(i+1,cliente[i],123,1000.0));
			
		}
		(new Terminal(c1)).iniciarOperacao();
	}
}
