package FirstPrograms;

public class LinearEquation_0 {

		public static double a=1,b=-2;
		
	public static double solution(){
		
		double sol=1;
	    sol=-b/a;
		return sol;
	}
	public static void main(String[] args) {
		
		System.out.print("Linear Equation 0 solution\n");
		System.out.println("The solution is: "+ solution());
        System.out.println("End of Computation");
	}

}
