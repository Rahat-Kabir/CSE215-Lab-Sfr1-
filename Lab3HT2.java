/* Write a java program to find the greatest common divisior (GCD) and highest common factor (HCF) of two numbers.
   */
import java.util.Scanner;

public class Lab3HT2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=input.nextInt();
		System.out.println("Enter second number : ");
		int num2=input.nextInt();
		int rem;
		while(num2!=0) {
			rem=num1%num2;
			num1=num2;
			num2=rem;
		}
		System.out.println("GCD "+num1);
		
	   int HCF = ((num1*num2)/num1);
	   System.out.println("HCF "+HCF);
	}

}
