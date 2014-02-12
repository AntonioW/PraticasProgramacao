package atividadeUrna;

//uma única urna em cada eleicao

public class Eleicao {

	Urna urna;
	String[] candidatos;
	
	public Eleicao(String[] cddts){
		candidatos = cddts;
		urna = new Urna(candidatos);
	}
		
	public void iniciarVotacao(){
		urna.iniciarVotacao();
	}
	
	
	public void encerrarVotacao(){
		urna.apurarVotos();
	}
	
	public void exibirResultado(){
		urna.resultadoApuracao();
	}
	
}
