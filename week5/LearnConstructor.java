package week5;

public class LearnConstructor {
	
	public LearnConstructor() {
		System.out.println("Default");
	}
	
	public LearnConstructor(String name) {
		System.out.println(name + "Parameter");
		
	}
	
	public void LearnConstructor() {
		System.out.println("method");
		
	}

	public static void main(String[] args) {
		
		LearnConstructor obj = new LearnConstructor();
		LearnConstructor obj2 = new LearnConstructor("this is");

		obj.LearnConstructor();
		

	}

}
