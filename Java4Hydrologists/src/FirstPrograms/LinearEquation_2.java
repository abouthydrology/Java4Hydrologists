package FirstPrograms;

public class LinearEquation_2 {

	public double a=1;
	public double b=-2;
    public double sol;
	
public void solution(){
    this.sol=-b/a;
}
public static void main(String[] args) {
	
	System.out.print("Linear Equation 2 solution\n");
	LinearEquation_2 a=new LinearEquation_2();
	a.solution();
	System.out.println("The solution is: "+ a.sol);
    System.out.println("End of Computation");
}

}
