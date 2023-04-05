package week5codingAssignment;

public class App {
	
	public static void main(String[] args) {
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		asteriskLogger.Log("Hello");
		System.out.println();
		asteriskLogger.Error("ID10T");
		
		System.out.println("");
		
		Logger logger2 = new SpacedLogger();
		logger2.Log("Welcome Will Robinson");
		System.out.println("");
		logger2.Error("DANGER WILL ROBINSON");
	
	}

}
