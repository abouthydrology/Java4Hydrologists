package FirstPrograms;

public class LinearEquationUsage_2 {
	
	static double aa=3,bb=-5;

	public static void main(String[] args) {
		
		LinearEquation_2 a=new LinearEquation_2();
	    a.a=aa;
		a.b=bb;
		a.solution();
		System.out.println("La soluzione e': "+a.sol);
		

	}

}
