package chapter01;

public class Ex11Logical0perator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//!(npt)
		//! ㅅ겯 =. ㄹ민ㄷ
		// ! false => true
		System.out.println(!(3!=2))
		
		// &&(and, 논리곱)
		//
		System.out.println(3>2 && 3>4); //false
		
		// ||(or, 논리합)
		System.out.println( 3!=2 || -1>0); // true
		
		//^(xor, 베타적 논리하)
		// true ^ false = True
		System.out.println( 3!=2 ^ -1>0); // true	
	}

}
