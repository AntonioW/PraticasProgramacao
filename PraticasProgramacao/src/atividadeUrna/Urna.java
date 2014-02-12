package atividadeUrna;

import java.util.Scanner;

public class Urna {
	private String[] candidatos;
	private int[] votos;
	private int numeroVotosNulos;
	private int numeroVotosBrancos;
	private boolean finalizada = false; // indica se já houve apuração
		
	public Urna(String[] nomeCandidatos){
		candidatos = nomeCandidatos;
		votos = new int[nomeCandidatos.length];
	}
	
	public int getNumeroVotosBrancos(){
		return this.numeroVotosBrancos;
	}
	public int getNumeroVotosNulos(){
		return this.numeroVotosNulos;
	}
	
	public String[] getCandidatos(){
		return candidatos;
	}
	
	//cria uma tela com as opções de voto
	public void tela(){
		System.out.println("=====  Selecione um dos candidatos =====");
		System.out.println("========================================");
		System.out.println("         [0] - Branco");
		for (int i=0;i<candidatos.length;i++){
			System.out.println("         ["+(i+1)+"] - "+ candidatos[i]);
		}
		System.out.println("========================================");	
	}
	
	//admitindo o que o o valor lido será, sempre, do tipo int, e maior ou igual a zero
	public int lerVoto(){
		int opcao;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		opcao = sc.nextInt();
		return opcao;
	}
	
	//qualquer opção de voto diferente das disponíveis na tela de votação, anulará o voto
	public void atribuirVoto(){
		int numeroDoCandidato = lerVoto();
		if (numeroDoCandidato==0){
			numeroVotosBrancos++;
		} else{
			if (numeroDoCandidato > votos.length){  
				numeroVotosNulos++;
			} else{
				votos[numeroDoCandidato - 1]++;
			}
		}
	}
	
	
	public void iniciarVotacao(){
		if (finalizada == false){  
			atribuirVoto(); 
		} else {
			System.out.println("Votação encerrada! Os votos desta urna já foram apurados!");
		}
	}
	
	//finaliza a votação nesta urna
	public void apurarVotos(){
		finalizada = true;
	}
	
	public void resultadoApuracao(){
		for(int i=0;i<candidatos.length;i++){
			System.out.println(candidatos[i] + ": " + votos[i]);
		}
		System.out.println("Votos em branco: " + getNumeroVotosBrancos());
		System.out.println("Votos Nulos: " + getNumeroVotosNulos());
	}
}
