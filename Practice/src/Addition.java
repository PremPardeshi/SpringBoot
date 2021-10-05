interface add{
	int adding(int a,int b);
}
public class Addition {
	public static void main(String[] args) {
		add a=(b,c)->b+c;
		int c=a.adding(10,20);
		System.out.println("Addition :"+c);
	}

}
