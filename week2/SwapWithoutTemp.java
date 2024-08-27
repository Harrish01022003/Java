package week2;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		b = b - a;
		a = a + b;
		System.out.println("a = " + a + " " + "b = " + b);

	}

}
// console a = 20 b = 10
