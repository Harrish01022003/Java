package week3.day1;

public abstract class Concrete {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected");
		
	}
	@Override
	public void disconnect() {
		System.out.println("Disconneccted");
		// TODO Auto-generated method stub
		
	}
	@Override
    public void executeUpdate() {
		System.out.println("update was executed");
	}
	
}
