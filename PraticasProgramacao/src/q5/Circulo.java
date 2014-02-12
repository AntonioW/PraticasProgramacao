package q5;

 

public class Circulo implements FormaGeometrica {
	double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	public double getArea(){
		return 3.14 * raio * raio;
	}
	
	public double getPerimetro(){
		return 2 * 3.14 * raio;
	}
	
	public void desenhar(){
		
	}
	
}
