package week6;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String name = "babu";
		char[] arr = name.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j =i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=' ';
					count++;
				}
				if(count>1) {
					arr[i] = ' ';
				}
				
			}}
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]!=' ') {
					System.out.print(arr[j]);
				}

			}
		
		

	}

}
