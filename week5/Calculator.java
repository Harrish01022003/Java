package week5;

public class Calculator {
	
	int a = 10;
	int b = 20;
	String name = "Addition";
	
	public void addition(String name, int a, int b) {
		this.a = a;
		this.b = b;
		this.name = name;
		
		System.out.println(a + b + name);
		
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.addition("Harrish", 30, 6);

	}

}
