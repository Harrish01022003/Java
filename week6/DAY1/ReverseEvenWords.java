package week6;
public class ReverseEvenWords {

    public static void main(String[] args) {

        String test = "I am a software tester";

        String[] arr = test.split(" ");

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 != 0) {
                
                String reverse = "";

                for (int j = arr[i].length() - 1; j >= 0; j--) {
 //string lengt()               	
                    reverse = reverse + arr[i].charAt(j);
                }
                arr[i] =reverse; 
                
              //  System.out.print(arr[i] + " ");   
            }
        }
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i]+" ");
			
		}
    }
}
