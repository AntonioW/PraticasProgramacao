package atividadeUrna;

public class Main {

	public static void main(String[] args){
		String[] candidatos = new String[4];  
		candidatos[0] = "Antonio";
		candidatos[1] = "Wlisses";
		candidatos[2] = "Alves";
		candidatos[3] = "Benicio";
		Eleicao e1 = new Eleicao(candidatos);
		int eleitores = 7;  //determina o fim da votação
		e1.urna.tela();
		for (int i=1; i<=eleitores;i++){
			e1.iniciarVotacao();
		}
		e1.encerrarVotacao();
		System.out.println("=======+++++++++++++++++++=======");
		System.out.println("======= Votação Encerrada =======");
		System.out.println("============Resultado============");
		e1.exibirResultado();
		
		//tenta reiniciar a votação, mas a votação já foi encerrada...
		e1.iniciarVotacao(); //msg avisando que a votação já foi encerrada
	}
}
