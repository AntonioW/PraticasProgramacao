package atividadeUrna;

public class Main {

	public static void main(String[] args){
		String[] candidatos = new String[4];  
		candidatos[0] = "Antonio";
		candidatos[1] = "Wlisses";
		candidatos[2] = "Alves";
		candidatos[3] = "Benicio";
		Eleicao e1 = new Eleicao(candidatos);
		int eleitores = 7;  //determina o fim da vota��o
		e1.urna.tela();
		for (int i=1; i<=eleitores;i++){
			e1.iniciarVotacao();
		}
		e1.encerrarVotacao();
		System.out.println("=======+++++++++++++++++++=======");
		System.out.println("======= Vota��o Encerrada =======");
		System.out.println("============Resultado============");
		e1.exibirResultado();
		
		//tenta reiniciar a vota��o, mas a vota��o j� foi encerrada...
		e1.iniciarVotacao(); //msg avisando que a vota��o j� foi encerrada
	}
}
