package week1;

//DATA_TYPES

public class Day3 {

	public static void main(String[] args) {
		 
		String mobileName = "redmi";
		int mobilePrice = 25000;
		float mobileDiscount = 10.5f;
		long imeNumber = 754888606598653l;
		double sarNumber =7.98653784087548;
		char mobileLogo = 'R';
		boolean isWorking = true;
		
		System.out.println(mobileName);
		System.out.println(mobilePrice);
		System.out.println(mobileDiscount);
		System.out.println(imeNumber);
		System.out.println(sarNumber);
		System.out.println(mobileLogo);
		System.out.println(isWorking);
		
		System.out.println("-------Single Line----------");
		
		System.out.println(mobileName + mobilePrice + mobileDiscount + imeNumber + sarNumber + mobileLogo + isWorking);
		
		System.out.println("-------Single Line With Space----------");
		
		System.out.println(mobileName +" "+ mobilePrice + mobileDiscount +" "+ imeNumber +" "+ sarNumber +" "+ mobileLogo +" "+ isWorking);
		
		System.out.println("-------Single Line Command multi line print----------");
		
		System.out.println(mobileName +"\n"+ mobilePrice + mobileDiscount +"\n"+ imeNumber +"\n"+ sarNumber +"\n"+ mobileLogo +"\n"+ isWorking);
		
	}

}
