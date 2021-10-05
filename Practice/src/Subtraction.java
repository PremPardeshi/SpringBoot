interface Sub{
	int subs(int a, int b);
}
public class Subtraction {

	public static void main(String[] args) {
		Sub s=(a,b)->a-b;
		int c=s.subs(256,128);
		System.out.println("Substraction :" +c);
	}
}
