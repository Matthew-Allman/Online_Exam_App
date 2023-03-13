package CulminatingPKG;

public class student 
{
	private String firstName = "";
	private String lastName   = "";
	private String password  = "";
	
	private int studentNumber = 0;
	private int bioScore      = 0;
	private int historyScore     = 0;
	private int compSciScore  = 0;
	
	public student (String firstName, String lastName, int studentNumber, String password )
	{
		this.firstName     = firstName;
		this.lastName      = lastName;
		this.password      = password;
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getBioScore() {
		return bioScore;
	}

	public void setBioScore(int bioScore) {
		this.bioScore = bioScore;
	}

	public int getHistoryScore() {
		return historyScore;
	}

	public void setHistoryScore(int historyScore) {
		this.historyScore = historyScore;
	}

	public int getCompSciScore() {
		return compSciScore;
	}

	public void setCompSciScore(int compSciScore) {
		this.compSciScore = compSciScore;
	}
	
	public String toString()
	{
		return "xxx";
	}
	
}