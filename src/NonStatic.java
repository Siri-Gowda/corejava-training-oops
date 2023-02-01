
public class NonStatic {
	public static void main(String args[]) {
		NonStatic obj = new NonStatic();
		obj.sum(10, 20);
		
	
		
	}
	public void sum(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}

}

