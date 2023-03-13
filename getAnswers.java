package CulminatingPKG;

public class getAnswers 
{
	private String question = "";
	
	private String ansArr[] = new String[4];
	
	private String correctAns = "";
	
	public getAnswers (String question, String ansArr[], String correctAns)
	{
		this.question   = question;
		this.ansArr     = ansArr;
		this.correctAns = correctAns;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getAnsArr() {
		return ansArr;
	}

	public void setAnsArr(String[] ansArr) {
		this.ansArr = ansArr;
	}

	public String getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}
}