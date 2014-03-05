package FirstPrograms;

// Same contents than HelloWorldWithData but using private fields - which require getter and setter
// and not making the fields static, which requires instantiation of an object
public class Sum {
    
	private int a=8,b=1;

	//Methods section
	public int  sum(){
		
		return getA()+b;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Benvenuti nel mondo di Java");
		Sum u=new Sum();
		System.out.println(u.sum());
		System.out.println(u.getA());
		u.setA(3);
		System.out.println(u.getA());
		System.out.println(u.sum());
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}

}
