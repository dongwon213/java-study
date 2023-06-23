package chapter01;

public class Ex28Gugudan2 {

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.print("hello world" + "\n");
		
		System.out.println("======");
		
		for(int i = 1; i < 9; i++) {
			for(int j = 1; j < 9; i++) {
				System.out.print(j + "x" + i + "=" + (i*j))
				if (j < 9) {
					System.out.print("\t");
				}
				else {
					System.out.print("\n");
				}
				
				
				
			}
		}
		
	}

}





// \t는 거리두기
// \n은 뉴라인