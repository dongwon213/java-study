package chapter01;

public class Ex15Ifstatement {

	public static void main(String[] args) {
		// Q2: 최대값을 판별하는 조건을 완성해 보세요.

		int a1 = 20;

		int a2 = 10;

		int a3 = 50;
		
		if (a1 >= a2) {
			if (a1 >= a3) {
				int max = a1;
				System.out.println(a1)
			}else {
				int max = a3;
				System.out.println(a3)
			}
		}else {
			if (a2 >= a3) {
				int max = a2;
				System.out.println(a2);
			}else {
				int max = a3
				System.out.println(a3)
			}
				
			
		}
		System.out.println("최앳닶은 "+max)

	}

}
