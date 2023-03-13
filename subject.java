package CulminatingPKG;

import java.util.ArrayList;

public class subject 
{	
	//
	//  The bioQuestionsArr[][] array is a 2-dimensional array, with two rows and 20 columns, 
	//  where row 0 contain the questions, and row 1 contain the corresponding answer.
	//
	//                                column 0      column 1       column 2            column 19        
	//                             +-------------+-------------+------------   .... -+------------+
	//          row 0 ---------->  | question 1  | question 2  |  question 3   ....  |question 20 |  
	//          row 1 ---------->  | answer 1    | answer 2    |  answer 3     ....  |answer 20   |
	//                             +-------------+-------------+------------   .... -+------------+
	//
	//
	private String bioQuestionsArr[][]  = {{"Pine, fir, spruce, cedar, larch and cypress are the famous timber-yielding plants of which several also occur widely in the hilly regions of India. "
			+ "								All these belong to :"
			                               ,"Pollination is best defined as :"
			                               ,"Plants receive their nutrients mainly from :"
			                               ,"Movement of cell against concentration gradient is called :"
			                               ,"Photosynthesis generally takes place in which parts of the plant?"
			                               ,"Plants synthesis protein from :"
			                               ,"Plants absorb dissolved nitrates from soil and convert them into :"
			                               ,"One of the following is not a function of bones :"
			                               ,"Once the erythrocytes enter the blood in humans, "
			                               +"It is estimated that they have an average lifetime of how many days. Is it:"
			                               ,"Placenta is the structure formed :"
			                               ,"Our skin, when exposed to excess sunlight, becomes dark. This is because our skin pigments called :"
			                               ,"The smallest of the FORMED elements of the blood are the :"
			                               ,"In cell division, the phase following the metaphas is known as :"
			                               ,"Which of the following are NOT part of a neuron?"
			                               ,"Which of the following statements is TRUE of insulin? Is it :"
			                               ,"Fertilization of the ovum by the sperm usually occurs in the :"
			                               ,"The corpeus luteum secretes :"
			                               ,"Which of the following does sperm NOT travel through?"
			                               ,"A layer of dead skin cells is found in the:"
			                               ,"Myelin sheaths are found:"},
											
			                                {" b)  gymnosperms"
											," a)  transfer of pollen from anther to stigma"
											," d)  soil"
											," b)  active transport"
											," a)  Leaf and other chloroplast bearing parts"
											," c)  amino acids"
											," a)  free nitrogen"
											," c)  Secretion of hormones for calcium regulation in blood and bones"
											," b)  120 Days"
											," a)  by the union of foetal and uterine tissue"
											," b)  melanin"
											," c)  platelets"
											," b)  anaphase"
											," a)  synapse"
											," d)  all of the above"
											," a)  oviduct"
											," d)  progesterone"
											," a)  ureter"
											," c)  epidermis"
											," d)  around axons of neurons"}};
	
	//
	//  The bioAnswersArr[][] array is a 2-dimensional array, with 20 rows and 4 columns, 
	//  where 
	//                   row  0 contain the four possible multiple choice answers to question 1 (index = 0), and 
	//                   row  1 contain the four possible multiple choice answers to question 2 (index = 1), and so on, until
	//                   ....
	//                   ....
    //                   row 19 contain the four possible answers to question 20 (index = 19).
	//
	//
	//                                      column 0      column 1       column 2      column 4        
	//                                    +-------------+-------------+-------------+------------+
	//    row 0:  question 1 ---------->  | answer 1    | answer 2    |  answer 3   |  answer 4  |  
	//    row 1:  question 2 ---------->  | answer 1    | answer 2    |  answer 3   |  answer 4  |
	//          ...
	//          ...
    //    row 19: question 20 --------->  | answer 1    | answer 2    |  answer 3   |  answer 4  |
	//                                    +-------------+-------------+-------------+------------+
	//
	//
	private String bioAnswersArr[][]   = 	{{" a)  angiosperms", " b)  gymnosperms", " c)  monocotyledons", " d)  dicotyledons"}
	 										,{" a)  transfer of pollen from anther to stigma", "b)  germination of pollen grains", "c)  growth of pollen tube in ovule", "d)  visiting flowers by insects"}
	 										,{" a)  chlorophyll", "b)  atmosphere", "c)  light", "d)  soil"}
	 										,{" a)  osmosis", " b)  active transport", " c)  diffusion", " d)  passive transport"}
	 										,{" a)  Leaf and other chloroplast bearing parts", " b)  stem and leaf", " c)  Roots and chloroplast bearing parts", " d)  Bark and leaf"}
	 										,{" a)  starch", " b)  sugar", " c)  amino acids", " d)  fatty acids"}
	 										,{" a)  free nitrogen", " b)  urea", " c)  ammonia", " d)  proteins"}
	 										,{" a)  Place for muscle attachment", " b)  Protection of vital organs", " c)  Secretion of hormones for calcium regulation in blood and bones", " d)  Production of blood corpuscles"}
	 											,{" a)  10 days", " b)  120 Days", " c)  200 days", " d)  360 days"}
	 										,{" a)  by the union of foetal and uterine tissue", " b)  by foetus only", " c)  by fusion of germ layers", " d)  None of these"}
	 										,{" a)  flavoxanthin", " b)  melanin", " c)  carotene", " d)  Xanthophyll"}
	 										,{" a)  white cells", " b)  red cells", " c)  platelets", " d)  erythrocytes"}
	 										,{" a)  prophase", " b)  anaphase", " c)  telophase", " d)  extophase"}
	 										,{" a)  synapse", " b)  axon", " c)  Nissl bodies", " d)  dendrite"}
	 										,{" a)  secreted by the pancreas", " b)  a protein", " c)  involved in the metabolism of glucose", " d)  all of the above"}
	 										,{" a)  oviduct", " b)  vagina", " c)  uterus", " d)  ovary"}
	 										,{" a)  HCG", " b)  LH", " c)  FSH", " d)  progesterone"}
	 										,{" a)  ureter", " b)  urethra", " c)  vas deferens", " d)  epididymus"}
	 										,{" a)  subcutaneous tissue", "b)  dermis", "c)  epidermis", "d)  no dead cells are in the skin"}
	 										,{" a)  surrounding tendons", "b)  covering the brain", "c)  covering muscles", "d)  around axons of neurons"}
	 										};
	
	


	
	private String compSciQuestionsArr[][]   = {{"Which of the following option leads to the portability and security of Java?"
												,"Which of the following is not a Java features?"
												,"Which of the following software is used to find and fix bugs in the Java programs?"
												,"What does the expression float a = 35 / 0 return?"
												,"Which of the following for loop declaration is not valid?"
												,"Given: ArrayList list = new ArrayList(); What is the initial quantity of the ArrayList list?"
												,"Virus stands for:"
												,"ISP stands for:"
												,"Which one of the following is a logical operator?"
												,"The method which belongs to the string class is/are:"
												,"A 32-bit integer value would be declared using which of the following keywords?"
												,"Java declaration statement must end with:"
												,"Which one of the following is not a java keyword? "
												,"Illegal access to a network or computer system is called?"
												,"The central processing unit is an example of?"
												,"In a 2D array, the first sub-script stands for:"
												,"OOP stands for:"
												,"In a class data members are also called as:"
												,"Which language is used for creating Web Pages?"
												,"Which of the following converts high-level language instructions into machine language?"},
			
												{"b)  Bytecode is executed by JVM"
												,"c)  Use of pointer"
												,"d)  Java Debugger  (JDB)"
												,"c)  Infinity"
												,"a)  for ( int i = 99; i >= 0; i / 9 )"
												,"b)  10"
												,"b)  Vital Information Resource Under Seize"
												,"b)  Internet Service Provider"
												,"d)  all of the above"
												,"b)  Length ( )"
												,"b)  Int"
												,"a)  a semicolon"
												,"c)  study"
												,"b)  Hacking"
												,"c)  Hardware"
												,"a)  Row"
												,"b)  Object Oriented Programming"
												,"b)  Attributes"
												,"c)  HTML"
												,"c)  Interpreter"}};

	
private String compSciAnswersArr[][] =
	     {{"a)  The applet makes the Java code secure and portable", "b)  Bytecode is executed by JVM", "c)  Use of exception handling", "d)  Dynamic binding between objects"}
	     
		 ,{"a)  Dynamic",      "b)  Architecture Neutral",      "c)  Use of pointers",        "d)  Object-oriented"}
		 
		 ,{"a)  Java Virtual Machine  (JVM)",      "b)  Java Runtime Environment  (JRE)",      "c)  Java Development Kit  (JDK)",         "d)  Java Debugger  (JDB)"}
		 
		 ,{"a)  0", "b)  Not a Number", "c)  Infinity", "d)  Run time exception"}
		 
		 ,{"a)  for ( int i = 99; i >= 0; i / 9 )", "b)  for ( int i = 7; i <= 77; i += 7 )", "c)  for ( int i = 20; i >= 2; - -i )", "d)  for ( int i = 2; i <= 20; i = 2* i )"}
		 
		 ,{"a)  5", "b)  10", "c)  0", "d)  100"}
		 
		 ,{"a)  Very Important Resource Under Searchn", "b)  Vital Information Resource Under Seize", "c)  Verify Integrated Result Until Source", "d)  Very Important Record User Searched"}
		 
		 ,{"a)  Internet Servant Provider", "b)  Internet Service Provider", "c)  Internet Service Protection", "d)  Internet Server Provider"}
		 
		 ,{"a)  ||", "b)  &&", "c)  !", "d)  all of the above"}
		 
		 ,{"a)  Compare to ( )", "b)  Length ( )", "c)  Substring ( )", "d)  Equals ( )"}
		 
		 ,{"a)  Boolean", "b)  Int", "c)  Short", "d)  Long"}
		 
		 ,{"a)  a semicolon", "b)  full stop", "c)  comma", "d)  a colon"}
		 
		 ,{"a)  static", "b)  break", "c)  study", "d)	class"}
		 
		 ,{"a)  Security", "b)  Hacking", "c)  Virus", "d)	Piracy"}
		 
		 ,{"a)  Peripheral", "b)  Software", "c)  Hardware", "d)  An output unit"}
		 
		 ,{"a)  Row", "b)  Column", "c)  Object", "d)  Diagonal"}
		 
		 ,{"a)  Object to Object Programming", "b)  Object Oriented Programming", "c)  Online Objects Programming", "d)  Object Oriented Processes"}
		 
		 ,{"a)  Abstracts", "b)  Attributes", "c)  Properties", "d)  Dimensions"}
		 
		 ,{"a)  PASCAL", "b)	C", "c)  HTML", "d)  Java"}
		 
		 ,{"a)  Application software", "b)  System software", "c)  Interpreter", "d)  Operating environment"}
		 };



	
	private String historyQuestionsArr[][]   = {{"Who initiated the Royal Proclamation of 1763?"
												,"Who are the descendants of 17th and 18th century French settlers?"
												,"What are the descendants of 17th and 18th century French settlers known as?"
												,"Early in Canadian history, what happened when different tribes came into contact with each other?"
												,"Who were the first Europeans to land on Canadian shores?"
												,"Where did the Vikings land?"
												,"Who was the first to map Canada’s Eastern shore?"
												,"What is the origin of the name 'Canada?'"
												,"Who did King Charles II give exclusive trading rights to?"
												,"What year was the Battle of the Plains of Abraham?"
												,"Who passed the Quebec Act?"
												,"What year did the British Colonies in Quebec gain independence?"
												,"Which group moved north, away from the ongoing conflict in Quebec?"
												,"What was the name of the West African colony for freed slaves?"
												,"In which year were the first elections held in Prince Edward Island?"
												,"What was the primary focus of the 1867 British North America Act?"
												,"In 1980 and 1995 Quebec voted to secede. What was the outcome?"
												,"What is the language and religion of the Province of Quebec?"
												,"After the French and Indian War Canada was divided into \"Upper Canada\" and \"Lower Canada.\" Who lived in \"Lower Canada?\""
												,"Many people supported the Quebec Independence Movement. What is a reason for this?"},
			
												{"b)  King George IIIM"
												,"b)  The Acadians"
												,"b)  The Québécois"
												,"a)  Increase in conflict"
												,"b)  The Vikings"
												,"a)  Labrador and Newfoundland"
												,"a)  John Cabot"
												,"b)  From the Iroquoi word 'kanata'"
												,"a)  Hudson’s Bay Trading Company|"
												,"a)  1759"
												,"b)  The British government"
												,"b)  1776"
												,"b)  Black Loyalists"
												,"b)  Freedom Town"
												,"d)  1773"
												,"d)  Citizens wanted political independence from its mother country"
												,"c)  Quebec voted to stay in Canada"
												,"b)  French and Catholic"
												,"a)  French Canadians"
												,"a)  They wanted to preserve their culture and language for the future"
											   }};

	
private String historyAnswersArr[][] =
	     {{"a)  Queen Victoria", "b)  King George III", "c)  King George IV", "d)  The Government of United Kingdom"}
	     
		 ,{"a)  The Québécois",      "b)  The Acadians",      "c)  The Ontarians",        "d)  The seafarers"}
		 
		 ,{"a)  People of European descent",      "b)  The Québécois",      "c)  the Acadians",         "d)  the Ontarians"}
		 
		 ,{"a)  Increase in conflict", "b)  Growing resources", "c)  Declining resources", "d)  Growing communities"}
		 
		 ,{"a)  The Aboriginals", "b)  The Vikings", "c)  The seafarers", "d)  European Explorer"}
		 
		 ,{"a)  Labrador and Newfoundland", "b)  Greenland and Newfoundland", "c)  Labrador and Greenland", "d)  None of the above"}
		 
		 ,{"a)  John Cabot", "b)  Jacques Cartier", "c)  Both a & b", "d)  None of the above"}
		 
		 ,{"a)  From the name of the person who founded the country", "b)  From the Iroquoi word 'kanata'", "c)  From the name of the Explorer", "d)  From the name of the persons who first set foot in Canada"}
		 
		 ,{"a)  Hudson’s Bay Trading Company|", "b)  Trading companies in Montreal", "c)  Trading companies on the East coast", "d)  Trading companies owned by the English"}
		 
		 ,{"a)  1759", "b)  1750", "c)  1859", "d)  1810"}
		 
		 ,{"a)  The Canadian Government", "b)  The British government", "c)  The French government", "d)  French Catholicsg"}
		 
		 ,{"a)  1761", "b)  1776", "c)  1767", "d)  1677"}
		 
		 ,{"a)  Different tribes", "b)  Black Loyalists", "c)  New group of loyalists", "d)  Tribes who migrated from other countries"}
		 
		 ,{"a)  Freetown", "b)  Freedom Town", "c)  Freecity", "d)  Freed Town"}
		 
		 ,{"a)  1373", "b)  1377", "c)  1737", "d)  1773"}
		 
		 ,{"a)  Citizens wanted referendums over the primary language of the country", "b)  Citizens wanted to join the United States", "c)  Citizens wanted tax reforms", "d)  Citizens wanted political independence from its mother country"}
		 
		 ,{"a)  Quebec is now an independent country within Canada", "b)  Quebec is now part of the United States", "c)  Quebec voted to stay in Canada", "d)  Quebec voted to join the UK"}
		 
		 ,{"a)  English and Protestant", "b)  French and Catholic", "c)  French and Protestant", "d)  English and Catholic"}
		 
		 ,{"a)  French Canadians", "b)  Inuit", "c)  Rich Canadians", "d)  British Canadians"}
		 
		 ,{"a)  They wanted to preserve their culture and language for the future", "b)  They wanted to become part of France again", "c)  They hoped by becoming independent, they could join the United States", "d)  They wanted to be part of the UK"}
		 };


	
	private boolean bioFlag     = false;
	private boolean historyFlag = false;
	private boolean compSciFlag = false;
	
	
	 /**
 	 * 
	 *  This method named generateRandomNumber will take in two integers as parameters.
	 *  The first called min is the lower bounds of a range. And the second called max
	 *  is the upper bounds of the range. The method generates an integer number randomly
	 *  between the min and max range inclusively. 
	 *  
	 *  @param min:   This is an input parameter that provides the lower bounds of the range.
	 *  @param max:   This is an input parameter that provides the upper bounds of the range.
	 *  @return int:  The method returns an integer than is randomly generated between the
	 *                lower and upper bounds inclusively.
	 *  
 	 */
	private int generateRandomNumber(int min, int max) 
	{
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
	
	public String[][] getBioQuestionsArr() {
		return bioQuestionsArr;
	}

	public void setBioQuestionsArr(String[][] bioQuestionsArr) {
		this.bioQuestionsArr = bioQuestionsArr;
	}

	public String[][] gethistoryQuestionsArr() {
		return historyQuestionsArr;
	}

	public void sethistoryQuestionsArr(String[][] historyQuestionsArr) {
		this.historyQuestionsArr = historyQuestionsArr;
	}

	public String[][] getCompSciQuestionsArr() {
		return compSciQuestionsArr;
	}

	public void setCompSciQuestionsArr(String[][] compSciQuestionsArr) {
		this.compSciQuestionsArr = compSciQuestionsArr;
	}

	public String[][] getBioAnswersArr() {
		return bioAnswersArr;
	}

	public void setBioAnswersArr(String[][] bioAnswersArr) {
		this.bioAnswersArr = bioAnswersArr;
	}

	public String[][] gethistoryAnswersArr() {
		return historyAnswersArr;
	}

	public void sethistoryAnswersArr(String[][] historyAnswersArr) {
		this.historyAnswersArr = historyAnswersArr;
	}

	public String[][] getCompSciAnswersArr() {
		return compSciAnswersArr;
	}

	public void setCompSciAnswersArr(String[][] compSciAnswersArr) {
		this.compSciAnswersArr = compSciAnswersArr;
	}
	
	public boolean isBioFlag() {
		return bioFlag;
	}

	public void setBioFlag(boolean bioFlag) {
		this.bioFlag = bioFlag;
	}

	public boolean ishistoryFlag() {
		return historyFlag;
	}

	public void sethistoryFlag(boolean historyFlag) {
		this.historyFlag = historyFlag;
	}

	public boolean isCompSciFlag() {
		return compSciFlag;
	}

	public void setCompSciFlag(boolean compSciFlag) {
		this.compSciFlag = compSciFlag;
	}

	public ArrayList<getAnswers> getBioQAndA (ArrayList<getAnswers> obj1)
	{
		bioFlag = false;
		int index = 0; 
		
		// Used to store the five questions for a given test taken by the user
		// 
		ArrayList <String> questionsArr = new ArrayList <>(); 
		
		boolean exitFlag = false;
		
		for (int i = 0; i < 5; i++)
		{
			exitFlag = false;
			
			//  Randomly select 5 questions from a list of 20 total questions
			//
			index = generateRandomNumber(0, 19);
			
			while (!exitFlag)
			{
				//  Because we are randomly selecting these 5 questions, we must ensure 
				//  the question is never repeated. If the question has been selected
				//  and copied to the bioQuestionsArr, then just generate a new index.
				//
				if (questionsArr.contains(bioQuestionsArr[0][index]))
				{
					index = generateRandomNumber(0, 19);
				}
				else
				{
					String ansArr[]   = new String[4];
					String correctAns = "";
					
					// Get the 4 multiple choice answers to the question just selected (ie. index number)
					//
					for (int j = 0; j < ansArr.length; j++)
					{
						ansArr[j] = bioAnswersArr[index][j]; 
					}
					
					// Get the correct answers to the question just selected (ie. index number)
					//
					correctAns = bioQuestionsArr[1][index];
					
					//  Add the selected question to the questionsArr arrayList.
					//
					questionsArr.add(i, bioQuestionsArr[0][index]); 
					
					//  Create a new object of the getAnswers class 
					//
					getAnswers BA = new getAnswers(questionsArr.get(i), ansArr, correctAns);
					obj1.add(BA);
					exitFlag = true;
				}
			}
		}
		//  Return this object
		//
		bioFlag = true;
		return obj1;	
	}

	public ArrayList<getAnswers> gethistoryQAndA (ArrayList<getAnswers> obj1)
	{
		int index = 0; 
		
		ArrayList <String> questionsArr = new ArrayList <>(); 
		
		boolean exitFlag = false;
		
		for (int i = 0; i < 5; i++)
		{
			exitFlag = false;
			index = generateRandomNumber(0, 19);
			
			while (!exitFlag)
			{
				if (questionsArr.contains(historyQuestionsArr[0][index]))
				{
					index = generateRandomNumber(0, 19);
				}
				else
				{
					String ansArr[]   = new String[4];
					String correctAns = "";
					
					for (int j = 0; j < ansArr.length; j++)
					{
						ansArr[j] = historyAnswersArr[index][j]; 
					}
					
					correctAns = historyQuestionsArr[1][index];
					questionsArr.add(i, historyQuestionsArr[0][index]); 
					
					getAnswers BA = new getAnswers(questionsArr.get(i), ansArr, correctAns);
					obj1.add(BA);
					exitFlag = true;
				}
			}
		}
		return obj1;	
	}
	
	public ArrayList<getAnswers> getCompSciQAndA (ArrayList<getAnswers> obj1)
	{
		int index = 0; 
		
		ArrayList <String> questionsArr = new ArrayList <>(); 
		
		boolean exitFlag = false;
		
		for (int i = 0; i < 5; i++)
		{
			exitFlag = false;
			index = generateRandomNumber(0, 19);
			
			while (!exitFlag)
			{
				if (questionsArr.contains(compSciQuestionsArr[0][index]))
				{
					index = generateRandomNumber(0, 19);
				}
				else
				{
					String ansArr[]   = new String[4];
					String correctAns = "";
					
					for (int j = 0; j < ansArr.length; j++)
					{
						ansArr[j] = compSciAnswersArr[index][j]; 
					}
					
					correctAns = compSciQuestionsArr[1][index];
					questionsArr.add(i, compSciQuestionsArr[0][index]); 
					
					getAnswers BA = new getAnswers(questionsArr.get(i), ansArr, correctAns);
					obj1.add(BA);
					exitFlag = true;
				}
			}
		}
		return obj1;	
	}	
}