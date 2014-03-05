package FirstPrograms;

public class Sum2 {

	//Very simple program to show how to call a different class in the same package - not making it static
	public static void main(String[] args) {
		// Come chiamare una classe da un'altra classe
       Sum oscar=new Sum();
       System.out.println(oscar.sum());
       oscar.setA(3);
       System.out.println(oscar.sum());
	}

}
