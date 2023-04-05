package week5codingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) { // shows a string with spaces between the characters
		char[] charLog = log.toCharArray();
		
		for (char e: charLog) { 
			System.out.print(e + " ");
		}
		System.out.println("");
		
	}

	@Override
	public void Error(String error) { // Does the same as above but proceeded by an error warning
		char[] charError = error.toCharArray();
		System.out.print("ERROR ");
		for (char e: charError) {
			System.out.print(e + " ");
			
		}
		System.out.println("");
		
		
	}

}
