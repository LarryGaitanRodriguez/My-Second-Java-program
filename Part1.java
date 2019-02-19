/* Name: Part1.java
 * Description: Program asks user to input their grade from four classes.
 * The program will then calculae their GPA thru their input.
 *
 * Author: Larry Gaitan-Rodriguez
 * Creation: 9/21/18
 */
import java.util.Scanner;
import java.text.DecimalFormat;
  
public class Part1
{
  public static void main(String[] args)
  {
    //Creates the basic user information.
    String first_name, last_name, student_major;
    //First Scanner Object will be for TEXT only.
    Scanner textScan = new Scanner(System.in);
    //Second Scanner Object will be for NUMBERS only.
    Scanner numScan = new Scanner(System.in);
    //The beginning of the user prompts
    System.out.println("Hello, welcome to the UNG GPA Calculator");
    System.out.println("Please enter your first name");
    first_name = textScan.nextLine();
    System.out.println("Thank you "+first_name+". Please enter your last name");
    last_name = textScan.nextLine();
    System.out.println("Thank you "+first_name+" "+last_name+". Please enter your major.");
    student_major = textScan.nextLine();
    //Variables for course number one are created 
    //Variables will be before the prompts of each class. 
    String course1_number;
    byte course1_credits;
    String course1_qps;
    float convert_course1_qps;
    System.out.println(student_major+" is a interesting field. Please enter the course number of your first class");
    course1_number = textScan.nextLine();
    System.out.println("Alright, please enter the amount of credit hours the class is worth");
    course1_credits = numScan.nextByte();
    //A quality point chart will print for the user's convenience. 
    System.out.println("| QP Chart| A 4.00 | A- 3.67 |");
    System.out.println("| B+ 3.33 | B 3.00 | B- 2.67 |");
    System.out.println("| C+ 2.33 | C 2.00 | C- 1.67 |");
    System.out.println("| D+ 1.33 | D 1.00 | F  0.00 |");
    System.out.println("Thank you. Please use the above chart to enter the quality points (The number) for your course.");
    course1_qps = textScan.nextLine();
    convert_course1_qps = Float.parseFloat(course1_qps);
    /*The end of the first course prompts.
     *The prompts will be repeated for the second course.
     */
    String course2_number;
    byte course2_credits;
    String course2_qps;
    float convert_course2_qps;
    System.out.println("Please enter the course number of your second class");
    course2_number = textScan.nextLine();
    System.out.println("Alright, please enter the amount of credit hours the class is worth");
    course2_credits = numScan.nextByte();
    //A quality point chart will print for the user's convenience. 
    System.out.println("| QP Chart| A 4.00 | A- 3.67 |");
    System.out.println("| B+ 3.33 | B 3.00 | B- 2.67 |");
    System.out.println("| C+ 2.33 | C 2.00 | C- 1.67 |");
    System.out.println("| D+ 1.33 | D 1.00 | F  0.00 |");
    System.out.println("Thank you. Please use the above chart to enter the quality points (The number) for your course.");
    course2_qps = textScan.nextLine();
    convert_course2_qps = Float.parseFloat(course2_qps);
     /*The end of the second course prompts.
     *The prompts will be repeated for the third course.
     */
    String course3_number;
    byte course3_credits;
    String course3_qps;
    float convert_course3_qps;
    System.out.println("Please enter the course number of your third class");
    course3_number = textScan.nextLine();
    System.out.println("Alright, please enter the amount of credit hours the class is worth");
    course3_credits = numScan.nextByte();
    //A quality point chart will print for the user's convenience. 
    System.out.println("| QP Chart| A 4.00 | A- 3.67 |");
    System.out.println("| B+ 3.33 | B 3.00 | B- 2.67 |");
    System.out.println("| C+ 2.33 | C 2.00 | C- 1.67 |");
    System.out.println("| D+ 1.33 | D 1.00 | F  0.00 |");
    System.out.println("Thank you. Please use the above chart to enter the quality points (The number) for your course.");
    course3_qps = textScan.nextLine();
    convert_course3_qps = Float.parseFloat(course3_qps);
     /*The end of the Third course prompts.
     *The prompts will be repeated for the final course, course number four.
     */
    String course4_number;
    byte course4_credits;
    String course4_qps;
    float convert_course4_qps;
    System.out.println(first_name+", we are almost done. Please enter the course number of your fourth class");
    course4_number = textScan.nextLine();
    System.out.println("Alright, please enter the amount of credit hours the class is worth");
    course4_credits = numScan.nextByte();
    //A quality point chart will print for the user's convenience. 
    System.out.println("| QP Chart| A 4.00 | A- 3.67 |");
    System.out.println("| B+ 3.33 | B 3.00 | B- 2.67 |");
    System.out.println("| C+ 2.33 | C 2.00 | C- 1.67 |");
    System.out.println("| D+ 1.33 | D 1.00 | F  0.00 |");
    System.out.println("Thank you. Please use the above chart to enter the quality points (The number) for your course.");
    course4_qps = textScan.nextLine();
    convert_course4_qps = Float.parseFloat(course4_qps);
    //All user prompts have been completed. The following will consist of mathematical computations.
    //The following variables are used to store the total quality points for each class. Will also store credit hours.
    float total_qp1, total_qp2, total_qp3, total_qp4, final_qps, total_credit_hours;
    total_qp1 = course1_credits*convert_course1_qps;
    total_qp2 = course2_credits*convert_course2_qps;
    total_qp3 = course3_credits*convert_course3_qps;
    total_qp4 = course4_credits*convert_course4_qps;
    //adds up the total quality points.
    final_qps = total_qp1 + total_qp2 + total_qp3 + total_qp4;
    //adds up the total credit hours
    total_credit_hours = course1_credits + course2_credits + course3_credits + course4_credits;
    //The final GPA calculation.
    float gpa = final_qps/total_credit_hours;
    
    DecimalFormat fmt = new DecimalFormat("#.##");
    System.out.println("Your GPA is a "+fmt.format(gpa)+". Thank you "+first_name+" for using this program.");
  }
}
                         