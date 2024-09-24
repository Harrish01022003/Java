package week6;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit amount 300000");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();

	}

}
