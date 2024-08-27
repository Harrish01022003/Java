package week2;

public class Factorial {
	public static void main(String[] args) {
		int num = 7;
		int fact = 1;
		for(int i = num;i >= 1;i--) {
			fact = i * fact; //10
			//to print each loop
			// System.out.println(fact); 
		}
		System.out.println("Factorial of " + num +" is " + fact );
	}

}
//console Factorial of 7 is 5040
