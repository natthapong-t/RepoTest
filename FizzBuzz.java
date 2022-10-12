package main;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
	}
	
	
//	String Fizzbuzz() {
//		String s = "";
//		int n = 100;
//		for(int i = 1; i<=n; i++) {
//			
//			if(i%15 ==0) {
//				s = Integer.toString(i);
//				s = "FizzBuzz";
//			}else if (i%5 ==0) {
//				s = Integer.toString(i);
//				s = "Buzz";
//			}else if (i%3 == 0) {
//				s = Integer.toString(i);
//				s = "Fizz";
//			}else {
//				s = Integer.toString(i);
//			}
//			
//		} return s;		
//	};
	
	String anotherFizzBuzz(int i) {
		String s = "";
			
			if(i%15 == 0) {
				s = Integer.toString(i);
				s = "FizzBuzz";
			}else if (i%5 ==0) {
				s = Integer.toString(i);
				s = "Buzz";
			}else if (i%3 == 0) {
				s = Integer.toString(i);
				s = "Fizz";
			}else {
				s = Integer.toString(i);
			}
			return s;	
		} 
		
		
		
		
		
		
}
	
	
	
	

