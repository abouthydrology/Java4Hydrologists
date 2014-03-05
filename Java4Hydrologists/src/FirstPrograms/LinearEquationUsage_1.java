package FirstPrograms;

public class LinearEquationUsage_1 {
	
	static double aa=3,bb=-5;

	public static void main(String[] args) {
	

		LinearEquation_1 a=new LinearEquation_1();
		a.a=aa;
		a.b=bb;
		System.out.println("La soluzione e': "+a.solution());
		

	}

}
