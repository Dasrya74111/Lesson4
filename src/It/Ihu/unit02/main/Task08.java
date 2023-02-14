package It.Ihu.unit02.main;
import static java.lang.Math.tan;

public class Task08 {

	public static void main(String[] args) {
		
		double x;
		double Fx;
	
		double a = 0;
		double b = 9;
		double h = 2;
	
	
		for (x = a; x <= b; x += h) {
			System.out.print("x = " + x);
			if (x < b){
				Fx = 2 * (Math.tan(x / 2) + 1);
				System.out.println("  F(x) = " + Fx);
			
		}
	}
	

	
	}

}
