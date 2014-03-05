package FirstPrograms;

public class HelloWorldwithData {
	//Here we added data to show how a class contains both data and methods
	
	//Data section - Data of a class are called "fields" of the class
	static public int a=8,b=1;	
	
	//Method area. Here just a simple sum
	
	static public int  sum(){
		
		return a+b;
		
	}
   
	//Here the main
	public static void main(String[] args){
		System.out.println("Benvenuti nel mondo di Java");
		System.out.println(sum());
	}
	
}
