package FirstPrograms;

public class LinearEquation_1 {

	public double a=1,b=-2;
	
public double solution(){
	
	double sol=1;
    sol=-b/a;
	return sol;
}
public static void main(String[] args) {
	
	System.out.print("Linear Equation   1 solution\n");
	LinearEquation_1 a=new LinearEquation_1();
	System.out.println("The solution is: "+ a.solution());
    System.out.println("End of Computation");
}

}
