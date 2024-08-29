package week2;

public class ReturnType {
	public int cashWithdrawal() {
		int amount = 20000;
		System.out.println(amount);
		return amount;
	}
	public int cashDeposit() {
		int amount = 5000;
		System.out.println(amount);
		return amount;
	}
	
	public static void main(String[] args) {
		ReturnType obj = new ReturnType();
		int store = obj.cashWithdrawal();  
		
		store = 25000;
		System.out.println(store);
		
		store = 30000;
		System.out.println(store);
		
		obj.cashDeposit();
		
	}

}
