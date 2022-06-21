/* Write a java program which will ask the user to enter the marks.Define a method that will
 * display grades according to the marks entered as below :
 	91-100 ---- A
 	81-90  ---- B+
 	71-80  ---- B
 	61-70  ---- C
 	51-60  ---- D
 	<=40   ---- Fail
 */
import java.util.Scanner;

public class Lab4HomeTask2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your mark : ");
		int mark = input.nextInt();
		
		ShowGrade(mark);
			
	}
	
	static void ShowGrade(int mark) {
		
		if(mark>=91 && mark <=100) {
			System.out.println("Grade : A");
		}
		
		else if(mark>=81 && mark<=90) {
			System.out.println("Grade is : B+");
		}
		
		else if(mark>=71 && mark<=80) {
			System.out.println("Grade is : B");
		}
		else if(mark>=61 && mark<=70) {
			System.out.println("Grade is : C");
		}
		
		else if(mark>=51 && mark<=60) {
			System.out.println("Grade is : D");
		}
		
		else if(mark<=40) {
			System.out.println("Grade is : Fail");
		}
		else {
			System.out.println("Input a valid Marks !");
		}
	}
}