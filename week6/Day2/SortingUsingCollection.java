package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List<String> values = new ArrayList<String>();
		values.add("HCL");
		values.add("Wipro");
		values.add("Aspire system");
		values.add("CTS");
		
		int size = values.size();
		
		Collections.sort(values);
		Collections.reverse(values);
		System.out.println(values);


		

	}

}
