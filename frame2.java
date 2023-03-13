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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Window.Type;

public class frame2 
{

	static ArrayList <getAnswers> compSciAnswersList = new ArrayList <>();
	static ArrayList <getAnswers> bioAnswersList     = new ArrayList <>();
	static ArrayList <getAnswers> historyAnswersList = new ArrayList <>();	
	
	static globalVar GV            = new globalVar();
	static subject quizInfo        = new subject();
	static String questionsArr[]   = new String[5];
	static String answersArr[]     = new String[4];
	
	static String compSciCorrectAnswer = "";
	static String bioCorrectAnswer     = "";
	static String historyCorrectAnswer = "";
	static String inputtedAns          = "";
	
	static int qIdx                    = 0;
	
	
	JFrame frame2;
	
	private JLabel lblNewLabel;
	private JLabel lblQuestion;
	private JLabel lblSubjectQuiz;
	private JLabel lblWhatIs;
	private JRadioButton rdbtnAnswer1;
	private JRadioButton rdbtnAnswer2;
	private JRadioButton rdbtnAnswer3;
	private JRadioButton rdbtnAnswer4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					frame2 window = new frame2();
					window.frame2.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frame2() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame:
	 * 
	 *   Set up the quiz question, the four multiple choice answers on the window
	 *   before the window is displayed to the user.
	 * 
	 */
	private void initialize() 
	{	
		qIdx = 0;
		
		//  Global variable (GV.transFlag) is used to pass which subject quiz (Computer Science, Bio, or History) the
		//  user has selected in the first window (the login window).
		//
		switch (GV.transFlag)
		{
		    //  GV.transFlag = 1 indicates the user has chosen to do the Computer Science quiz in the first frame
		    //
			case 1:
			{
				//  compSciAnswersList is an object of the getAnswers class.
				//  This getAnswers class contain all the information required for a given
				//  multiple-choice question, which include:
				//     1)  the actual question wording
				//     2)  the four possible multiple-choice answers, and
				//     3)  the correct answer to the given question
				//
				compSciAnswersList   = quizInfo.getCompSciQAndA(compSciAnswersList);
				
				//  Separate compSciAnswersList arrayList object into its three other objects or datatypes.
				//
				answersArr           = compSciAnswersList.get(qIdx).getAnsArr();
				questionsArr[qIdx]   = compSciAnswersList.get(qIdx).getQuestion();
				compSciCorrectAnswer = compSciAnswersList.get(qIdx).getCorrectAns();
				
				//  Configure the question window with these information. This will display the first question
				//  from the Computer Science quiz. That is, the index (qIdx) = 0.
				//
				lblSubjectQuiz = new JLabel("Computer Science Quiz");
				lblQuestion    = new JLabel("Question " + (qIdx + 1));
				lblWhatIs      = new JLabel(questionsArr[qIdx]);
				rdbtnAnswer1   = new JRadioButton(answersArr[0]);
				rdbtnAnswer2   = new JRadioButton(answersArr[1]);
				rdbtnAnswer3   = new JRadioButton(answersArr[2]);
				rdbtnAnswer4   = new JRadioButton(answersArr[3]);
				break;
			}
			
		    //  GV.transFlag = 2 indicates the user has chosen to do the Biology quiz in the first frame
		    //
			case 2:
			{			
				bioAnswersList     = quizInfo.getBioQAndA(bioAnswersList);
				
				answersArr         = bioAnswersList.get(qIdx).getAnsArr();
				questionsArr[qIdx] = bioAnswersList.get(qIdx).getQuestion();
				bioCorrectAnswer   = bioAnswersList.get(qIdx).getCorrectAns();
				
				lblSubjectQuiz = new JLabel("Biology Quiz");
				lblQuestion    = new JLabel("Question " + (qIdx + 1));
				lblWhatIs      = new JLabel(questionsArr[qIdx]);
				rdbtnAnswer1   = new JRadioButton(answersArr[0]);
				rdbtnAnswer2   = new JRadioButton(answersArr[1]);
				rdbtnAnswer3   = new JRadioButton(answersArr[2]);
				rdbtnAnswer4   = new JRadioButton(answersArr[3]);
				break;
			}
			
		    //  GV.transFlag = 3 indicates the user has chosen to do the History quiz in the first frame
		    //
			case 3:
			{
				historyAnswersList    = quizInfo.gethistoryQAndA(historyAnswersList);
				
				answersArr         = historyAnswersList.get(qIdx).getAnsArr();
				questionsArr[qIdx] = historyAnswersList.get(qIdx).getQuestion();
				historyCorrectAnswer  = historyAnswersList.get(qIdx).getCorrectAns();
				
				lblSubjectQuiz = new JLabel("History Quiz");
				lblQuestion    = new JLabel("Question " + (qIdx + 1));
				lblWhatIs      = new JLabel(questionsArr[qIdx]);
				rdbtnAnswer1   = new JRadioButton(answersArr[0]);
				rdbtnAnswer2   = new JRadioButton(answersArr[1]);
				rdbtnAnswer3   = new JRadioButton(answersArr[2]);
				rdbtnAnswer4   = new JRadioButton(answersArr[3]);
				break;
			}
		}
		
		frame2 = new JFrame();
		frame2.setBackground(Color.BLUE);
		frame2.setType(Type.POPUP);
		frame2.getContentPane().setBackground(new Color(176, 224, 230));
		frame2.setFont(new Font("Arial Black", Font.BOLD, 22));
		frame2.setTitle("Quiz");
		frame2.setBounds(100, 100, 792, 604);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		//JLabel lblSubjectQuiz = new JLabel("");
		lblSubjectQuiz.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblSubjectQuiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubjectQuiz.setBounds(216, 26, 341, 58);
		frame2.getContentPane().add(lblSubjectQuiz);
		
		//JLabel lblQuestion = new JLabel("");
		lblQuestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuestion.setFont(new Font("Arial", Font.BOLD, 25));
		lblQuestion.setBounds(310, 74, 154, 48);
		frame2.getContentPane().add(lblQuestion);
		
		//JLabel lblWhatIs = new JLabel();
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblWhatIs.setBounds(38, 133, 675, 33);
		frame2.getContentPane().add(lblWhatIs);
		
		//JRadioButton rdbtnAnswer1 = new JRadioButton("");
		rdbtnAnswer1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnAnswer1.setBounds(93, 185, 378, 48);
		frame2.getContentPane().add(rdbtnAnswer1);
		
		//JRadioButton rdbtnAnswer2 = new JRadioButton("");
		rdbtnAnswer2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnAnswer2.setBounds(93, 235, 378, 48);
		frame2.getContentPane().add(rdbtnAnswer2);
		
		//JRadioButton rdbtnAnswer3 = new JRadioButton("");
		rdbtnAnswer3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnAnswer3.setBounds(93, 283, 378, 48);
		frame2.getContentPane().add(rdbtnAnswer3);
		
		//JRadioButton rdbtnAnswer4 = new JRadioButton("");
		rdbtnAnswer4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnAnswer4.setBounds(93, 333, 378, 48);
		frame2.getContentPane().add(rdbtnAnswer4);
		
		ButtonGroup btnGrp = new ButtonGroup();
		btnGrp.add(rdbtnAnswer1);
		btnGrp.add(rdbtnAnswer2);
		btnGrp.add(rdbtnAnswer3);
		btnGrp.add(rdbtnAnswer4);
		
		JButton btnNextQuestion = new JButton("Next Question");
		btnNextQuestion.setBackground(Color.GREEN);
		
		//  When the user presses the "Next Question" button, this method will be executed.
		//
		btnNextQuestion.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				//  Clear the previously selected answer of the radio button group.
				//
			    btnGrp.clearSelection();
			    
				//  Clear the previously response that the user received when they hit the "Enter" button
			    //  to check their answer to the previous question.
				//
			    lblNewLabel.setText("");
				
			    
			    //  Display the next question based upon which quiz the user is taking (Chem, Bio, or Hist)
			    //  obtained through the value of GV.transFlag.
			    //
				qIdx++;
				
				switch (GV.transFlag)
				{
					case 1:
					{
						answersArr           = compSciAnswersList.get(qIdx).getAnsArr();
						questionsArr[qIdx]   = compSciAnswersList.get(qIdx).getQuestion();
						compSciCorrectAnswer = compSciAnswersList.get(qIdx).getCorrectAns();
				
						lblSubjectQuiz.setText("Computer Science Quiz");
						lblQuestion.setText("Question " + (qIdx + 1));
						lblWhatIs.setText(questionsArr[qIdx]);
						rdbtnAnswer1.setText(answersArr[0]);
						rdbtnAnswer2.setText(answersArr[1]);
						rdbtnAnswer3.setText(answersArr[2]);
						rdbtnAnswer4.setText(answersArr[3]);
						break;
					}
					case 2:
					{
						answersArr         = bioAnswersList.get(qIdx).getAnsArr();
						questionsArr[qIdx] = bioAnswersList.get(qIdx).getQuestion();
						bioCorrectAnswer   = bioAnswersList.get(qIdx).getCorrectAns();
				
						lblSubjectQuiz.setText("Biology Quiz");
						lblQuestion.setText("Question " + (qIdx + 1));
						lblWhatIs.setText(questionsArr[qIdx]);
						rdbtnAnswer1.setText(answersArr[0]);
						rdbtnAnswer2.setText(answersArr[1]);
						rdbtnAnswer3.setText(answersArr[2]);
						rdbtnAnswer4.setText(answersArr[3]);
						break;
					}
					case 3:
					{
						answersArr           = historyAnswersList.get(qIdx).getAnsArr();
						questionsArr[qIdx]   = historyAnswersList.get(qIdx).getQuestion();
						historyCorrectAnswer = historyAnswersList.get(qIdx).getCorrectAns();
				
						lblSubjectQuiz.setText("History Quiz");
						lblQuestion.setText("Question " + (qIdx + 1));
						lblWhatIs.setText(questionsArr[qIdx]);
						rdbtnAnswer1.setText(answersArr[0]);
						rdbtnAnswer2.setText(answersArr[1]);
						rdbtnAnswer3.setText(answersArr[2]);
						rdbtnAnswer4.setText(answersArr[3]);
						break;
					}
				}
			}
		});
		btnNextQuestion.setEnabled(false);
		btnNextQuestion.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNextQuestion.setBounds(505, 408, 235, 39);
		frame2.getContentPane().add(btnNextQuestion);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setBackground(Color.BLUE);
		btnEnter.setEnabled(true);
		
		//  When the "Enter" button is pressed, check if the answer selected is correct.
		//
		btnEnter.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				int tmpScore = 0;
				
				switch (GV.transFlag)	
				{
					case 1:
					{
						//  Check id any of the four radio buttons has been selected.
						//
						if (rdbtnAnswer1.isSelected() || 
							rdbtnAnswer2.isSelected() ||
							rdbtnAnswer3.isSelected() ||
						    rdbtnAnswer4.isSelected()) 
							{
							
								//  Get information on which radio button has been selected.
							    //
								rdbtnAnswer1.setActionCommand(compSciAnswersList.get(qIdx).getAnsArr()[0]);
								rdbtnAnswer2.setActionCommand(compSciAnswersList.get(qIdx).getAnsArr()[1]);
								rdbtnAnswer3.setActionCommand(compSciAnswersList.get(qIdx).getAnsArr()[2]);
								rdbtnAnswer4.setActionCommand(compSciAnswersList.get(qIdx).getAnsArr()[3]);
								
								inputtedAns = btnGrp.getSelection().getActionCommand();
								
								//  Check if the inputed answer matches the correct answer stored in the 
								//  compSciCorrectAnswer string.
								//
								if (inputtedAns.equals(compSciCorrectAnswer))
								{	
									lblNewLabel.setText("Correct Answer!");
									
									tmpScore = GV.getStudentList().get(GV.studentIndex).getCompSciScore();
									tmpScore++;
									GV.getStudentList().get(GV.studentIndex).setCompSciScore(tmpScore);
								}
								else
								{
									lblNewLabel.setText("Incorrect Answer! ");
								}
								
								
								//  Each quiz has five questions, so disable the "Next Question" button
								//  when all four questions have been displayed and answered by the user.
								//  Give the score.
								//
								if (qIdx == 4)
								{
									btnNextQuestion.setEnabled(false);
									
									if (inputtedAns.equals(compSciCorrectAnswer))
									{	
										lblNewLabel.setText("Correct Answer!          Your score is: " 
									  + GV.getStudentList().get(GV.studentIndex).getCompSciScore() 
									  + "/5");
										
									}
									else
									{
										lblNewLabel.setText("Incorrect Answer!          Your score is: " 
									  + GV.getStudentList().get(GV.studentIndex).getCompSciScore() 
									  + "/5");
									}	
								}
								else
								{
									btnNextQuestion.setEnabled(true);
								}
							}
							else
							{
								// MessageDialog to show no information selected using the radio buttons.
								JOptionPane.showMessageDialog (null, "Please select an4 answer before pressing Enter");					
							}
						break;
					}
					
					case 2:
					{
						if (rdbtnAnswer1.isSelected() || 
							rdbtnAnswer2.isSelected() ||
							rdbtnAnswer3.isSelected() ||
							rdbtnAnswer4.isSelected()) 
							{
								rdbtnAnswer1.setActionCommand(bioAnswersList.get(qIdx).getAnsArr()[0]);
								rdbtnAnswer2.setActionCommand(bioAnswersList.get(qIdx).getAnsArr()[1]);
								rdbtnAnswer3.setActionCommand(bioAnswersList.get(qIdx).getAnsArr()[2]);
								rdbtnAnswer4.setActionCommand(bioAnswersList.get(qIdx).getAnsArr()[3]);
								
								inputtedAns = btnGrp.getSelection().getActionCommand();
								
								if (inputtedAns.equals(bioCorrectAnswer))
								{	
									lblNewLabel.setText("Correct Answer!");
									
									tmpScore = GV.getStudentList().get(GV.studentIndex).getBioScore();
									tmpScore++;
									GV.getStudentList().get(GV.studentIndex).setBioScore(tmpScore);
								}
								else
								{
									lblNewLabel.setText("Incorrect Answer! ");
								}
								
								if (qIdx == 4)
								{
									btnNextQuestion.setEnabled(false);
									
									if (inputtedAns.equals(bioCorrectAnswer))
									{	
										lblNewLabel.setText("Correct Answer!          Your score is: " 
									  + GV.getStudentList().get(GV.studentIndex).getBioScore() 
									  + "/5");
									}
									else
									{
										lblNewLabel.setText("Incorrect Answer!            Your score is: " 
									  + GV.getStudentList().get(GV.studentIndex).getBioScore() 
									  + "/5");
									}	
								}
								else
								{
									btnNextQuestion.setEnabled(true);
								}
							}
							else
							{
								// MessageDialog to show information selected radion buttons.
								JOptionPane.showMessageDialog (null, "Please select an answer before pressing Enter");					
							}
						break;
					}
					case 3:
					{
						if (rdbtnAnswer1.isSelected() || 
							rdbtnAnswer2.isSelected() ||
							rdbtnAnswer3.isSelected() ||
							rdbtnAnswer4.isSelected()) 
							{
								rdbtnAnswer1.setActionCommand(historyAnswersList.get(qIdx).getAnsArr()[0]);
								rdbtnAnswer2.setActionCommand(historyAnswersList.get(qIdx).getAnsArr()[1]);
								rdbtnAnswer3.setActionCommand(historyAnswersList.get(qIdx).getAnsArr()[2]);
								rdbtnAnswer4.setActionCommand(historyAnswersList.get(qIdx).getAnsArr()[3]);
								
								inputtedAns = btnGrp.getSelection().getActionCommand();
								
								if (inputtedAns.equals(historyCorrectAnswer))
								{	
									lblNewLabel.setText("Correct Answer!");
									
									tmpScore = GV.getStudentList().get(GV.studentIndex).getHistoryScore();
									tmpScore++;
									GV.getStudentList().get(GV.studentIndex).setHistoryScore(tmpScore);
								}
								else
								{
									lblNewLabel.setText("Incorrect Answer! ");
								}
								
								if (qIdx == 4)
								{
									btnNextQuestion.setEnabled(false);
									
									if (inputtedAns.equals(historyCorrectAnswer))
									{	
										lblNewLabel.setText("Correct Answer!          Your score is: " 
									  + GV.getStudentList().get(GV.studentIndex).getHistoryScore() 
									  + "/5");
									}
									else
									{
										lblNewLabel.setText("Incorrect Answer!          Your score is: " 
									  + GV.getStudentList().get(GV.studentIndex).getHistoryScore() 
									  + "/5");
									}	
								}
								else
								{
									btnNextQuestion.setEnabled(true);
								}
							}
							else
							{
								// MessageDialog to show information selected radion buttons.
								JOptionPane.showMessageDialog (null, "Please select an answer before pressing Enter");					
							}
						break;
					}
				}
				
			}
		});
		btnEnter.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEnter.setBounds(260, 407, 235, 39);
		frame2.getContentPane().add(btnEnter);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(96, 486, 653, 39);
		frame2.getContentPane().add(lblNewLabel);
	
	}
}