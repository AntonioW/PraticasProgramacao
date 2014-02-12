package q5;

public class Retangulo implements FormaGeometrica {

	double base;
	double altura;
	
	public Retangulo(double b, double a){
		base = b;
		altura = a;
	}
	public double getArea() {
		return (base * altura);
	}
	
	public double getPerimetro() {
		return 2*(base+altura);
	}
	
	public void desenhar(){
		
	}
	
	
}
