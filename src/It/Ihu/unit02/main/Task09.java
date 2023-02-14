package It.Ihu.unit02.main;
import static java.lang.Math.pow;

public class Task09 {

	public static void main(String[] args) {
		
		int x;
		double Fx;
	
		x = 5;
	
		if (x <= -3) {
			Fx = 9;
		} else {
			Fx = 1 / (Math.pow(x, 2) + 1);
		}
		System.out.println("F(x) = " + Fx);


	}

}
