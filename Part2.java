/* Name: Part2.java
 * Description: Program will take in basic student information and their grades.
 *
 * 
 * Author: Larry Gaitan-Rodriguez
 * Creation: 10/22/18
 */
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Part2 {
  public static void main(String[] args) 
  { 
    //String variables to store basic user information is created.  
    String student_fName, student_lName;
    //Byte Variables to store academic information is created below. 
    byte student_hw1, student_hw2, student_quiz1, student_quiz2, student_exam1, student_exam2;
    
    //Scanner object will be used to take in text only.
    Scanner textScan = new Scanner(System.in);
    //Scanner object will be used to take in numbers only.
    Scanner numScan = new Scanner(System.in);
    
    //Prompts user for input that will be used to create Student1.
    System.out.println("Hello, please input the student's first name.");
    student_fName = textScan.nextLine();
    System.out.println("Please input the student's last name.");
    student_lName = textScan.nextLine();
    //Prompts for the student's grade information. 
    System.out.println("Please input the first homework grade.");
    student_hw1 = numScan.nextByte();
    System.out.println("Please input the second homework grade.");
    student_hw2 = numScan.nextByte();
    System.out.println("Please input the first quiz grade.");
    student_quiz1 = numScan.nextByte();
    System.out.println("Please input the second quiz grade.");
    student_quiz2 = numScan.nextByte();
    System.out.println("Please input the first exam grade.");
    student_exam1 = numScan.nextByte();
    System.out.println("Please input the second exam grade.");
    student_exam2 = numScan.nextByte();
    //Creates Student 1 Object
    UNGStudent student1 = new UNGStudent(student_fName, student_lName, student_hw1, student_hw2, student_quiz1, student_quiz2, student_exam1, student_exam2);

    //The second iteration of the prompts will occour to collect information for student2
    System.out.println("Now please input the second student's first name.");
    student_fName = textScan.nextLine();
    System.out.println("Please input the second student's last name.");
    student_lName = textScan.nextLine();
    //Prompts for the student's grade information. 
    System.out.println("Please input the first homework grade.");
    student_hw1 = numScan.nextByte();
    System.out.println("Please input the second homework grade.");
    student_hw2 = numScan.nextByte();
    System.out.println("Please input the first quiz grade.");
    student_quiz1 = numScan.nextByte();
    System.out.println("Please input the second quiz grade.");
    student_quiz2 = numScan.nextByte();
    System.out.println("Please input the first exam grade.");
    student_exam1 = numScan.nextByte();
    System.out.println("Please input the second exam grade.");
    student_exam2 = numScan.nextByte();
    //Creates Student 2 Object
    UNGStudent student2 = new UNGStudent(student_fName, student_lName, student_hw1, student_hw2, student_quiz1, student_quiz2, student_exam1, student_exam2);
    
    //Resets Student2's grades with new ones.
    student2.setGrades(97,78,84,91,55,72);
    //Creates new variables to store averages for student assignemtns
    float homework_avg, quiz_avg, exam_avg;
    //Uses calc methods from student1 object and assigns them to the newly created variables.
    homework_avg = student1.calcHW();
    quiz_avg = student1.calcQuiz();
    exam_avg = student1.calcExam();
    //The total of the three averages will be stored in the following new variable.
    float student1_avg = homework_avg + quiz_avg + exam_avg;
    //The Second iteration will do the same to calculate student2's average.
    homework_avg = student2.calcHW();
    quiz_avg = student2.calcQuiz();
    exam_avg = student2.calcExam();
    float student2_avg = homework_avg + quiz_avg + exam_avg;
    
    //Outputs student1's final average.
    System.out.println(student1.getFullName()+" - Final Average: "+student1_avg);
    //Outputs student2's final average.
    System.out.println(student2.getFullName()+" - Final Average: "+student2_avg);
}
