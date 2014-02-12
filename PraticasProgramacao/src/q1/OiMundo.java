package q1;

public class OiMundo {

	private String mensagem;
	
	public OiMundo(){
		setMensagem("Oi Mundo!");
	}
	
	public OiMundo(String str){
		setMensagem(str);
	}
	
	public String getMensagem(){
		return mensagem;
	}
	
	public void setMensagem(String str){
		mensagem = str;
	}

	public void mostraMensagem(){
		System.out.println(getMensagem());
	}
	
	public static void main(String[] args){
		OiMundo hello = new OiMundo("Hello World");
		hello.mostraMensagem();
	}
}
