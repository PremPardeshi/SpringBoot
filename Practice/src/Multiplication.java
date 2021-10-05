


interface Mult{
	//System.out.println("Inside interface");
	public int Multi(int n);
}


public class Multiplication {
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		Mult m=(n)-> n*n; 
		
		
		int a=m.Multi(20);
		System.out.println("Output :"+a);
	}
}