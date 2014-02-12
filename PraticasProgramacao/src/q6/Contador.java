package q6;

public class Contador {

	private static int valor = 0;
	private static boolean jaDesfez = true;
	
	public Contador(){
		valor = 0;
	}
	public static void incrementar() {
		valor++;
		jaDesfez = false;
	}
	
	public static void desfazer(){
		if (jaDesfez == false){
			valor--;
			jaDesfez = true;
		}
		else {
			System.out.println("não foi possivel desfazer, Verifique se o valor do "
					+ "contador é igual a zero, ou se o método desfazer já foi chamado"
					+ "Incremente novamente, antes de tentar desfazer.");
		}
	}
	
	public int getValor(){
		return valor;
	}
	
	//testes
	@SuppressWarnings("static-access")
	public static void  main(String[] args){
		Contador cont = new Contador();
		Contador cont2 = new Contador();
		cont.desfazer();
		System.out.println(valor);
		cont2.incrementar();
		cont2.incrementar();
		System.out.println(valor);
		System.out.println(Contador.valor);
		cont.desfazer(); System.out.println(cont.valor);
		cont.desfazer(); System.out.println(cont.valor);
		cont.incrementar(); System.out.println(cont.valor);
		cont.desfazer(); System.out.println(cont.valor);
		System.out.println("Valor:" + cont.getValor());
	}
}
