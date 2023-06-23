package chapter01;

public class Ex12bitwiseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0x0f; 
		int b = 0xf0;
		
		System.out.println(a&b);  //0
		System.out.println(a | b); //255
		System.out.println(a^b); //255
		System.out.println(-a); //-16
		System.out.println(a >> 3); ;1
		System.out.println(a << 3);
		
		
				

	}

}
