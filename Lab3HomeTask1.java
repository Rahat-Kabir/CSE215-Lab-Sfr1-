import java.util.Scanner;

public class Lab3HT1 {
	/* Take integer inputs from user until he/she wants to quit( Press 0 to quit).
	   Then Print average and product of all numbers.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num,sum=0;
		double average;
		int count=0;
		System.out.println("Enter a number of series (Untill enter - 0)");
		while((num = input.nextInt()) != 0) {
			sum+=num;
			count++;
		}
		
		average=sum/count;
		System.out.println("Average number : "+average);
		System.out.println("Summation of all number : "+sum);
	}

}
