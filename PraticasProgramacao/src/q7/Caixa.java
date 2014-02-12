package q7;

public class Caixa {

	private static int filaDeEspera;
	
	
	public static void proximo() {
		if (filaDeEspera>0){
			filaDeEspera--;
		} else {
			System.out.println("Não tem ninguém na fila!");
		}
	}
	
	public static void criarFila(int tamanho){
		filaDeEspera = tamanho;
	}
	
	public static void quantosNafila(){
		System.out.println(filaDeEspera);
	}
	
	//testes
	@SuppressWarnings("static-access")
	public static void main(String[] args){
		Caixa c1 = new Caixa();
		Caixa c2 = new Caixa();
		Caixa c3 = new Caixa();
		c1.proximo();
		c2.proximo();
		c3.proximo();
		Caixa.criarFila(8);
		c1.proximo(); 
		System.out.println(c2.filaDeEspera);
		System.out.println(c3.filaDeEspera);
		c2.proximo();
		System.out.println(Caixa.filaDeEspera);
		c3.proximo(); 
		System.out.println(c1.filaDeEspera);
		c2.quantosNafila();
	}
	
}
