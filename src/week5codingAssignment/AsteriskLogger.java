package week5codingAssignment;

public class AsteriskLogger implements Logger {
	
	

	@Override
	public void Log(String log) { // shows the string with asterisks around it
		System.out.println("***" + log + "***");
	
		
	}
	@Override
	public void Error(String error) { // makes a box of asterisks around the string
		System.out.println("*****************");
		System.out.println("***" + "ERROR " + error + "***");
		System.out.println("*****************");
		
		
	}
}
