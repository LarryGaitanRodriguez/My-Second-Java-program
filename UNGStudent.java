/*Name: Larry Gaitan-Rodriguez
 * 
 * Description: The support class will create the specific attributes required for
 * each UNG Student.
 * 
 * Date: 10/22/18
 */
public class UNGStudent 
{
  //Basic User information variables are created.
  private String first_name, last_name;
  //Academic user infromation variables are created.
  private float homework1, homework2, quiz1, quiz2, exam1, exam2;
  //Constants weights for the assignments are created.
  private final float HW_WEIGHT = 0.25f;
  private final float QUIZ_WEIGHT = 0.35f;
  private final float EXAM_WEIGHT = 0.4f;
  private final byte TOTAL_ASSIGNMENTS = 2;
  //This constructor takes in all the user information at once. 
  public UNGStudent(String fName, String lName, byte hw1, byte hw2, byte qz1, byte qz2, byte test1, byte test2)
  {
    first_name = fName;
    last_name = lName;
    homework1 = hw1;
    homework2 = hw2;
    quiz1 = qz1;
    quiz2 = qz2;
    exam1 = test1;
    exam2 = test2;
  }
  //Retrives the full name of the student.
  public String getFullName()
  {
    return first_name+" "+last_name;
  }
  //"Resets" all of the six grades of the student.
  public void setGrades(int hw1, int hw2, int qz1, int qz2, int test1, int test2)
  {
    homework1 = hw1;
    homework2 = hw2;
    quiz1 = qz1;
    quiz2 = qz2;
    exam1 = test1;
    exam2 = test2;
  }
 
  /* Calculations are done with two constants that represent the amount of assignemts, two, and
   * the weight. The weight is dependent on the type.
   * I.E calcExam(): 100+100 = 200/2 = 100*.4 = 40. 
   */
  
  //Calculates the homework average
  public float calcHW()
  {
    return ((homework1+homework2)/TOTAL_ASSIGNMENTS)*HW_WEIGHT;
  }
  //Calculates the quiz average
  public float calcQuiz()
  {
    return ((quiz1+quiz2)/TOTAL_ASSIGNMENTS)*QUIZ_WEIGHT;
  }
  //calculates the exam average
  public float calcExam()
  {
    return ((exam1+exam2)/TOTAL_ASSIGNMENTS)*EXAM_WEIGHT;
  }
  //The toString will display a list of the grades.
  public String toString()
  {
    return "Homework 1:"+homework1+" Homework 2:"+homework2+" Quiz 1:"+quiz1+" Quiz 2:"+quiz2+" Exam 1:"+exam1+" Exam 2:"+exam2;
  }
}
