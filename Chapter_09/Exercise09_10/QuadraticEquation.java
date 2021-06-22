public class QuadraticEquation{
	private double a, b, c;
	QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getDiscriminant(){
		return Math.pow(b, 2) - (4 * a * c);
	}

	public double getRoot1(){
		if(getDiscriminant() < 0){
			return 0;
		}
		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
	}
	public double getRoot2(){
		if(getDiscriminant() < 0){
			return 0;
		}
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
	}


	//accessor methods
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}

}