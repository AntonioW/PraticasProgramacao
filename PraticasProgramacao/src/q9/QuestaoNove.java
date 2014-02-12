package q9;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestaoNove {
	ArrayList<String> lidas = new ArrayList<String>();
	String[] arrayStrings;
	int contador = 0;
	
	//determina o tamanho do array a ser verificado; 15, na questão nove
	public void setArrayStrings(int n){
		arrayStrings = new String[n];
	}
	
		
	public String lerString(){
		String str;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		return str;
	}
	
	public void armazenarString(String str){
		lidas.add(str);
	}
	
	public boolean temIgual(String str){
		boolean tem = false;
		for(int i=0;i<arrayStrings.length;i++){
			if (str.equalsIgnoreCase(arrayStrings[i])){
				tem = true;
			}
		}
		return tem;
	}
	
	
	public void iniciarLeitura(){
		boolean tem = false;
		String ultima;
		while(tem == false){
			for(int i = 0; i<arrayStrings.length; i++){
				ultima = lerString();
				lidas.add(ultima);
				if (temIgual(ultima)){
					tem=true;
					arrayStrings[i] = ultima;
					break;
				} else {
					arrayStrings[i] = ultima;
				}
			}
		}
	}
	
	
	
	
	
	
	
	public int getTamanhoMaiorStrLida(ArrayList<String> list) {
		int tamanho = 0;
		for (int i = 0; i < list.size(); i++) {
			if (tamanho< list.get(i).length()) {
				tamanho = list.get(i).length();   	
			}
		} 
		return tamanho;
	}
	
	public String juntaStrings(ArrayList<String> list) {
		String conc="";
		for (int i = 0; i < (list.size()-1); i++) {
				conc = conc + list.get(i);	
				}
		return conc;
	}
	
	public void imprimirArray(){
		for (int i=0;i<arrayStrings.length;i++){
			System.out.println(arrayStrings[i]);
		}
	}
	

	
	public static void main(String[] args){
		System.out.println("Pronto. Digite...");
		QuestaoNove qn = new QuestaoNove();
		qn.setArrayStrings(3);
		qn.iniciarLeitura();
		System.out.println(qn.juntaStrings(qn.lidas));
		qn.imprimirArray();
	}
}