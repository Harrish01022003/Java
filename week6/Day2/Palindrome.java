package week6;

public class Palindrome {

	public static void main(String[] args) {
		String value  = "madam";
		String rev = "";
		for (int i = 0; i < value.length(); i++) {
			rev = value.charAt(i) + rev;	
		}
		if(value.equalsIgnoreCase(rev)) {
			System.out.println("The given String is Palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}

	}

}
