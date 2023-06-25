package chapter01;

public class HelloWorld {

	int cc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa;

		aa = aaa(10,20);
		System.out.println(aa);
			 		
	}
	
	
	private static int aaa(int a , int b) {
		int bb; 
		
		bb = a + b;
		
		bb = bb + bbb(3,5) ;
		
		return bb;
	}
	

	private static  int bbb(int a , int b) {
		int bb; 
		
		bb = a * b;
		
		
		
		return bb;
	}
	
}
 