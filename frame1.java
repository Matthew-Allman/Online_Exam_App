package CulminatingPKG;
	
	/**
	*
	* @author   Matthew Allman
	* @version  1.0
	* @since    2022-Jan-23
	*
	*
	* Problem Defined:
	* 
	*  As schools are online again, students and teachers must be ready to teach and learn in isolated environments. 
	*  There is thus a need for activities students can do to break the monotony of the lockdown. Such a fun activity 
	*  could doubly serve as a learning tool as well. The principal of Bramalea Secondary School, Mr. Kidd, has 
	*  assigned the students in Ms. Barring’s grade 12 Computer Science (ICS4U0) class, the educational task of 
	*  creating an educational game that students can play on their devices at home. It is hoped that this will 
	*  help with the monotony of students switching to online learning. 
	*
	* Purpose:
	*
	*  To address the needs of Mr. Kidd, I have created a GUI (Graphical User Interface) Trivia Gaming application 
	*  that will:
	*    •  First allow the student to be verified by logging into the App.
	*    •  The initial window will be this Login window that will allow the user to enter their name and student number.
	*    •  After their entered information has been verified, the program will prompt the user to choose a grade 12 course.
	*    •  Three courses will be available to the user to take the trivia quiz on.
	*    •  Once the student has chosen their course, the application will display a second window.
	*    •  Trivia questions on general content from this course will be presented to the user in a multiple choice format.
	*    •  Each question will have a choice of four possible answers. 
	*    •  It should allow the user to choose whichever option of subject they wish to answer trivia questions on. 
	*    •  The student should be able to click whichever answer they feel is correct. 
	*    •  If the answer they choose was wrong, the application will indicate a wrong answer.
	*    •  If the answer is correct, it will indicate a correct answer.
	*    •  It will then allow the user to go to the next question by a "Next Question" button. 
	*	 •  There will be 5 multiple-choice questions for each quiz. 
	*    •  At the end of the quiz, the program should give the student their scores. 
	*   
	*     
	*/
	
	import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.awt.event.ActionEvent;
	import java.awt.Font;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import javax.swing.JPasswordField;
import java.awt.Color;
	
	public class frame1 {
	
		//  The "studentList" arraylist will store objects of the student class.
		//  on start up, the application creates two students and saved their information into
		//  this arraylist. Therefore only two students have access to this app.
		//
		static ArrayList <student> studentList = new ArrayList <>();
		
		// To pass information between classes, I have created a class and named it Global Variables (GV).
		// There are probably better ways to do this, but time is a constraint, and this is easy to 
		// implement and it works.
		//
		static globalVar GV = new globalVar();

		private JFrame frmGradeQuiz;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JPasswordField passwordField;
	
		
		
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						frame1 window = new frame1();
						window.frmGradeQuiz.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
		
		
		/**
		 * Create the application.
		 */
		public frame1() 
		{
			initialize();
			
			//  Set up the students who have valid (authorized) access to this App.
			//
			GV.setStudentList();
		}
	
		
	
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frmGradeQuiz = new JFrame();
			frmGradeQuiz.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 10));
			frmGradeQuiz.setBackground(new Color(245, 245, 220));
			frmGradeQuiz.getContentPane().setBackground(Color.LIGHT_GRAY);
			frmGradeQuiz.setTitle("Grade 12 Quiz");
			frmGradeQuiz.setBounds(100, 100, 838, 596);
			frmGradeQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmGradeQuiz.getContentPane().setLayout(null);
			
			// This is the "Computer Science (ICS4U0)" button, for the student to take the
			// Computer Science quiz.
			//
			JButton btnNewButton = new JButton("Computer Science (ICS4U0)");
			btnNewButton.setForeground(new Color(107, 142, 35));
			btnNewButton.setBackground(Color.WHITE);
			
			//  When this button is pressed (i.e. the student wishes to take the CompSci quiz),
			//  this event (ActionEvent) is triggered, and control passes to this method.
			//
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{					
					//  The global variable (GV.transFlag) will indicate to the second window
					//  that the CompSci quiz has been selected.
					//
					GV.transFlag = 1;
					
					//  Closes the first window.
					//
					frmGradeQuiz.dispose();
					
					//  The second window is initialized.
					//
					frame2 frame2Info = new frame2();
					
					//  And then displayed.
					//
					frame2Info.frame2.setVisible(true);
				}
			});
			btnNewButton.setEnabled(false);
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			btnNewButton.setBounds(25, 78, 230, 39);
			frmGradeQuiz.getContentPane().add(btnNewButton);
			
			// This is the "Biology (SBI4U0)" button, for the student to take the
			// Biology quiz.
			//
			JButton btnComputerScience = new JButton("Biology (SBI4U0)");
			btnComputerScience.setBackground(Color.WHITE);
			btnComputerScience.setEnabled(false);
				
			//  When this button is pressed (i.e. the student wishes to take the Biology quiz),
			//  this event (ActionEvent) is triggered, and control passes to this method.
			//
			btnComputerScience.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					GV.transFlag = 2;
					frmGradeQuiz.dispose();
	
					frame2 frame2Info = new frame2();
					frame2Info.frame2.setVisible(true);				
				}
			});
			btnComputerScience.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			btnComputerScience.setBounds(293, 78, 235, 39);
			frmGradeQuiz.getContentPane().add(btnComputerScience);
			
			
			// This is the "History (CHY4U0)" button, for the student to take the
			// History quiz.
			//
			JButton btnNewButton_1_1 = new JButton("History (CHY4U0)");
			btnNewButton_1_1.setBackground(Color.WHITE);
			
			//  When this button is pressed (i.e. the student wishes to take the History quiz),
			//  this event (ActionEvent) is triggered, and control passes to this method.
			//
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					GV.transFlag = 3;
					frmGradeQuiz.dispose();
					
					frame2 frame2Info = new frame2();
					frame2Info.frame2.setVisible(true);
				}
			});
			btnNewButton_1_1.setEnabled(false);
			btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			btnNewButton_1_1.setBounds(567, 78, 230, 39);
			frmGradeQuiz.getContentPane().add(btnNewButton_1_1);
			
			JLabel lblEnterFirstName = new JLabel("Enter First Name:");
			lblEnterFirstName.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblEnterFirstName.setBounds(127, 229, 158, 33);
			frmGradeQuiz.getContentPane().add(lblEnterFirstName);
			
			JLabel lblEnterLastName = new JLabel("Enter Last Name:");
			lblEnterLastName.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblEnterLastName.setBounds(127, 282, 158, 33);
			frmGradeQuiz.getContentPane().add(lblEnterLastName);
			
			JLabel lblEnterStudentNumber = new JLabel("Enter Student Number:");
			lblEnterStudentNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblEnterStudentNumber.setBounds(127, 336, 158, 33);
			frmGradeQuiz.getContentPane().add(lblEnterStudentNumber);
			
			textField = new JTextField();
			textField.setBackground(Color.LIGHT_GRAY);
			textField.setToolTipText("Click to Enter a Registered Name ");
			textField.setColumns(10);
			textField.setBounds(319, 229, 172, 33);
			frmGradeQuiz.getContentPane().add(textField);
			
			JLabel lblLogin = new JLabel("Login");
			lblLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblLogin.setBounds(48, 171, 158, 33);
			frmGradeQuiz.getContentPane().add(lblLogin);
			
			textField_1 = new JTextField();
			textField_1.setBackground(Color.LIGHT_GRAY);
			textField_1.setToolTipText("Click to Enter the Last Name of the SAME Registered Name");
			textField_1.setColumns(10);
			textField_1.setBounds(319, 285, 172, 33);
			frmGradeQuiz.getContentPane().add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setBackground(Color.LIGHT_GRAY);
			textField_2.setToolTipText("Click to Enter Student Number ");
			textField_2.setColumns(10);
			textField_2.setBounds(319, 341, 172, 33);
			frmGradeQuiz.getContentPane().add(textField_2);
			
			JLabel lblEnterPassword = new JLabel("Enter Password:");
			lblEnterPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblEnterPassword.setBounds(127, 389, 158, 33);
			frmGradeQuiz.getContentPane().add(lblEnterPassword);
			
			passwordField = new JPasswordField();
			passwordField.setBackground(Color.LIGHT_GRAY);
			passwordField.setToolTipText("Click to Enter the Password of the Registered Name");
			passwordField.setBounds(319, 397, 172, 33);
			frmGradeQuiz.getContentPane().add(passwordField);
			
			JLabel lblEnterLastName_1 = new JLabel("");
			lblEnterLastName_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblEnterLastName_1.setBounds(127, 489, 556, 33);
			frmGradeQuiz.getContentPane().add(lblEnterLastName_1);
			
			// This is the "Enter" button, for the student to be authorized to take the quiz.
			// The student data has been pre-loaded into the  "studentList" arraylist.
			//
			JButton btnEnter = new JButton("Enter");
			btnEnter.setBackground(Color.GREEN);
			btnEnter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					try
					{
						String firstName  = "";
						String lastName   = "";
						String password   = "";
						int studentNumber = 0;
						boolean validUser = false;
						
						
						//  Get the student information that the student has enetered during the login 
						//  process.
						//
						firstName     = textField.getText();
						lastName      = textField_1.getText();
						studentNumber = Integer.parseInt(textField_2.getText());
						password      = passwordField.getText();
						
						//  Get the valid users info that we previously stored. validUser
						//
						studentList   = GV.getStudentList();
							
						//  Compare the info just entered by the student to the info we have stored in the
						//  "studentList" arrayList, as objects of the student class.
						//
					    for (int i = 0; i < studentList.size(); i++) 
					    {
							if (studentList.get(i).getFirstName().equals(firstName)    && 
								studentList.get(i).getLastName().equals(lastName)      &&
								studentList.get(i).getStudentNumber() == studentNumber &&
								studentList.get(i).getPassword().equals(password))
								{
									validUser       = true;
									GV.studentIndex = i;
								}		
					    }
					    
					    //  A successful login gives an appropriate message on the application window.
					    //  And the subject buttons are enabled.
					    //
						if (validUser)
						{
							btnNewButton.setEnabled(true);
							btnComputerScience.setEnabled(true);
							btnNewButton_1_1.setEnabled(true);
							
							lblEnterLastName_1.setText("You have Successfully logged in! Please select a Quiz");		
						}
						else
						{
						    //  An unsuccessful login gives an error message window
						    //
							JOptionPane.showMessageDialog (null, "Wrong information or password entered! Please Try Again");
						}
					}
					
					catch (Exception e1)
					{
						JOptionPane.showMessageDialog (null, "Please fill out required information!");
					}
				}
			});
			btnEnter.setFont(new Font("Times New Roman", Font.BOLD, 20));
			btnEnter.setBounds(567, 440, 235, 39);
			frmGradeQuiz.getContentPane().add(btnEnter);
		}
	}