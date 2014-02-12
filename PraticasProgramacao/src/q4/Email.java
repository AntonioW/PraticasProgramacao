package q4;

import q3.Anexo;

public class Email {
	private String enderecoOrigem;
	private String enderecoDestino;
	private String mensagem;
	private Anexo anexo01;
	private Anexo anexo02;
	private Anexo anexo03;
	private String data;
	
	public Email(String endOrig, String endDest, String msg, Anexo ax1, Anexo ax2, 
			Anexo ax3, String data){
		setEnderecoOrigem(endOrig);
		setEnderecoDestino(endDest);
		setMensagem(msg);
		setAnexo01(ax1);
		setAnexo02(ax2);
		setAnexo03(ax3);
		setData(data);
	}
	
	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}
	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}
	public String getEnderecoDestino() {
		return enderecoDestino;
	}
	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Anexo getAnexo01() {
		return anexo01;
	}
	
	public void setAnexo01(Anexo a1) {
		if (jaExiste(a1, anexo02, anexo03)== false){
			this.anexo01 = a1;
		}
	}
	
	public Anexo getAnexo02() {
		return anexo02;
	}
	
	public void setAnexo02(Anexo a2) {
		if (jaExiste(a2, anexo01, anexo03) == false){
			this.anexo02 = a2;
		}
	}
	
	public Anexo getAnexo03() {
		return anexo03;
	}
	
	public void setAnexo03(Anexo a3) {
		if (jaExiste(a3, anexo01, anexo02) == false){
			this.anexo03 = a3;
		}
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	public boolean checaIgualdadeAnexos(Anexo anx1, Anexo anx2){
		if ((anx1== null) || (anx2==null)){
			return false;
		}
		if (anx1.getName()==anx2.getName()){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean jaExiste(Anexo ax1, Anexo ax2, Anexo ax3){
		if ((checaIgualdadeAnexos(ax1,ax2)) || ((checaIgualdadeAnexos(ax1,ax3))) ||
				((checaIgualdadeAnexos(ax2,ax3)))){
			return true;
		} else {
			return false;
		}
	}
	
	
	//para anexos com nomes iguais ele apresenta um java.lang.NullPointerException
	public static void main(String[] args){
		Anexo a1 = new Anexo();
		a1.setName("Anexo 1");
		Anexo a2 = new Anexo();
		a2.setName("Anexo 2");
		Anexo a3 = new Anexo();
		a3.setName("Anexo 3");
		System.out.println(a1.getName() + a2.getName() + a3.getName());
		if (a1.getName()==a2.getName()){
			System.out.println("iguais");
		}
		
		Email e1 = new Email("R1, nº 1. B1", "R2, nº2. B2","Oi! Bom dia!", a1, a2, a3, "01/02/2014");
		System.out.println(e1.getEnderecoOrigem() + e1.getEnderecoDestino() + e1.getMensagem() +
		e1.getAnexo01().getName() + e1.getAnexo02().getName() + e1.getAnexo03().getName() +
		e1.getData());   
	}
	
}
