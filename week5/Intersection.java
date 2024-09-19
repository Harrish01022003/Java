package week5;
import java.util.*;
public class Intersection {

	public static void main(String[] args) {
		 
		int[] a = {1,2,3,4,5,6};
		int[] b = {5,6,7,8,9,55,22};
		System.out.println("Duplicate values are");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
			
		}
		
	}

}

   