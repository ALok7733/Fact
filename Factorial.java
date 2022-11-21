

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial.getFact();
	}

	
	public static void getFact() {
		
		int num = 5;
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
			
		}
		System.out.println("Factorial of:  "+num+ " is: = "+fact);
	}
}
