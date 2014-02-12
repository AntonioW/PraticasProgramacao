package q8;
import java.util.Scanner;
import java.util.ArrayList;


public class Oito {

	public ArrayList<String> lerStrings(){
		ArrayList<String> lista = new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Boolean stop = false;
		String s = "";
		while (stop == false) {
			s = sc.nextLine();
			if (lista.size() == 0){
				lista.add(s);
			} else {
				if (lista.get(lista.size() -1).equals(s) == false) {
					lista.add(s);
				} else {
					stop = true;
				}
			}
		}	
		return lista;
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
		for (int i = 0; i < (list.size() - 1); i++) {
				conc = conc + list.get(i);	
				}
		return conc;
	}
	
	//testes
	public static void main (String[] args) {
		Oito oito = new Oito();
		ArrayList<String> lista = new ArrayList<String>();
		lista = oito.lerStrings();
		System.out.println("Número de Strings lidas: " + lista.size());
		System.out.println("Tamanho da maior String lida: " + oito.getTamanhoMaiorStrLida(lista));
		System.out.println("Strings concatenadas: " + oito.juntaStrings(lista));
		
	}


}
	
	
