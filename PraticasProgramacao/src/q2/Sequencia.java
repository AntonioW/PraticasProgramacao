package q2;

/* 
 * */

public class Sequencia {

	private int valor;
	private int[] sequenciaAteValor;
	
	
	public Sequencia(int val){
		valor = val;
		sequenciaAteValor = this.gerarSequencia();
	}
	
	public int getValor(){
		return valor;
	}
	
	public int[] getSequenciaAteValor() {
		return sequenciaAteValor;
	}
	
	public int[] gerarSequencia(){
		int tamanhoArray = getValor();
		int[] seq = new int[tamanhoArray];
		int i = 1;
		while (i <= tamanhoArray) {
			seq[i-1] = i;
			i++;
		}
		return seq;
	}
	
	public void imprimeSequencia(){
		for(int i=0; i < getSequenciaAteValor().length; i++){
			System.out.println(sequenciaAteValor[i]);
		}
	}
	
	
	public static void main(String[] args){
		Sequencia sq = new Sequencia(10000);
		sq.imprimeSequencia();
	}		

	
}
