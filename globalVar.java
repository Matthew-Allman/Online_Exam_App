package CulminatingPKG;

import java.util.ArrayList;

public class globalVar 
{
	public static int transFlag   = 0;
	public static int studentIndex = -1;
	
	public static ArrayList <student> studentList = new ArrayList <>();	
	


	public static void setStudentList() {
		student studentInfo1 = new student("Matthew", "Allman", 1111, "password1");
		student studentInfo2 = new student("Rowan", "Davies", 2222, "password2");
		
		studentList.add(studentInfo1);
		studentList.add(studentInfo2);
	}
	
    public static ArrayList<student> getStudentList() {
		return studentList;
	}
}