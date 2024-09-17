package week5;

public class Reverse {

	public static void main(String[] args) {
		
		String movie = "Greatest of all time";
		char[] charArray = movie.toCharArray();
		int count = 0;
		for(int i = charArray.length-1;i>=0;i--) {
			//System.out.println(charArray[i]);  //ln
			if(charArray[i]=='e') {
				count=count+1;
			}		
		}
		System.out.println(count);

	}
}

//psudocode 
