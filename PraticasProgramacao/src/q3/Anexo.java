package q3;

public class Anexo {
	private String name;
	private String texto;
	
	public void setName(String str){
		name = str;
	}
	
	public String getName(){
		return name;
	}
	
	public void setTexto(String txt){
		texto = txt;
	}
	
	public String getTexto(){
		return texto;
	}
	
	public boolean contains(String str){
		if (texto.contains(str)){
			return true;
		}
		else
			return false;
	}
//teste
	public static void main(String args[]){
		Anexo a1 = new Anexo();
		a1.texto= "testando";
		if (a1.contains("test")){
			System.out.println("contem");
		}
		System.out.println(a1.texto);
	}

}

