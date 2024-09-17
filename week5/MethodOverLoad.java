package week5;

public class MethodOverLoad extends MethodOverride {
	
	public void sub() {
		System.out.println(10+20);
	}

	/*public void sub() {
		System.out.println(50-20);
	}*/
	public void sub(int a) {
		System.out.println(a-20);
	}
	public void sub(int a, float b, String c) {
		System.out.println(a - b + c);
	}
	
	
	public static void main(String[] args) {
		MethodOverLoad obj = new MethodOverLoad();
		obj.sub();
		obj.sub(50);
		obj.sub(50,20.5f," Harrish");
		obj.sub();

	}

}
