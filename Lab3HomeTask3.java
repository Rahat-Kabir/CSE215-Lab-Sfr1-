import java.util.Scanner;

public class Lab3HomeTask3 {
	
	/* Find the Sum of digit of a Number
	 EX. Sum of digits of 432 is 4+2+3 = 9 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Enter a integer number : ");
		num=input.nextInt();
		int sum = 0;
		while(num>0) {
			int reminder = num%10;
			sum+=reminder;
			num=num/10;
			
		}
		System.out.println("Sum of digits is : "+sum);
	}

}
