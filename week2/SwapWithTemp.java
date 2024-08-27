package week2;

public class SwapWithTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;

		temp = a; // 10
		a = b;
		b = temp;

		System.out.println("a = " + a + " " + "b = " + b);

	}
}

// console a = 20 b = 10
