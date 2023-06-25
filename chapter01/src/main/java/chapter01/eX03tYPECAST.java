package chapter01;

public class eX03tYPECAST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i1 = 10;
			long l1 = 1000L;
			
			float f1 = 3.14f;
			double d1 = 3.14;
			
			int i2 = (int)l1;
			float f2 = (float) d1;
			int i3 = (int)f1;
			
			
			long l2 = i1;
			double d2 = f1;
			double d3 = i1;
			
			//데이터 의미가 다르면 개스팅 자체가 되지 않는다
			//boolean b = (boolean)i1;
					
			
	}

}
