import java.util.Scanner;
interface Student 
{
void setAcademicScore(int score);
void displayAcademicScore();
}

interface Sports 
{
void setSportsScore(int score);
void displaySportsScore();
}
public class Result implements Student, Sports 
{
private int academicScore;
private int sportsScore;
public void setAcademicScore(int score)
{
academicScore = score;
}
public void displayAcademicScore() 
{
System.out.println("Academic Score: " + academicScore);
}
public void setSportsScore(int score) 
{
sportsScore = score;
}
public void displaySportsScore() 
{
System.out.println("Sports Score: " + sportsScore);
}
public void displayResult() 
{
displayAcademicScore();
displaySportsScore();
}
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
Result student = new Result();
System.out.print("Enter Academic Score: ");
int academic = scanner.nextInt();
student.setAcademicScore(academic);
System.out.print("Enter Sports Score: ");
int sports = scanner.nextInt();
student.setSportsScore(sports);
System.out.println("\n--- Student Result ---");
student.displayResult();
scanner.close();
}
}

