package Moodanalysisalgorithm;

public class Moodanalysis {
	
	String message;
	
	public Moodanalysis() {
		super();
	}

	public Moodanalysis(String message) {
		super();
		this.message = message;
	}

	public String analysemood() {
		if (message.contains("uff"))
			return "SAD";
		else
			return "HAPPY";
	}
	
	public String analysemoodexception() throws MoodAnalysisException {
		if(message != null)
		if (message.contains("Sad")) {
			System.out.println("Valid");
			return "Sad";
		}
		throw new MoodAnalysisException("NullPointerException occured");
	}

}
