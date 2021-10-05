interface div{
	float divi(float a,float b);
}
public class Division {
public static void main(String[] args) {
	
	div d=(a,b)->a/b;
	float c=d.divi(16,4);
	System.out.println("Division :"+c);
}
}
