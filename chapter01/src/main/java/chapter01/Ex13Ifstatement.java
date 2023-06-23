package chapter01;
		
public class Ex13Ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = ' '
		int score = 82;
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >=80){
			grade = 'b';
		} else if(score>=70){ 
			grade = 'c';
		}	else {
			grade = 'd'
				
			}
		}
		
		grade = grade - grade%10
				
	
	
	
		System.out.println('학점은 ' + grade + "입니다."); 

	}

}
