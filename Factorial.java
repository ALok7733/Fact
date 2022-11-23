public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enetr a number for which you need factorial");
//		int num = sc.nextInt();
		
		int num = Factorial.generateRandom();
//		System.out.println("Random numer is: "+num);
		int res = 1;
		for(int i=1;i<=num;i++) {
			res = res * i;
		}
		System.out.println("Factorial of "+num+": is = "+res);
	}
	
	
	public static int generateRandom(){
	    double random = Math.random()*10;
	    return (int)random;
	}
	


}
