/* Create two methods,the first method sum() will perform  addition of two numbers and second method 
 * sum() will perform addition of three numbers using overloading concept.
 */
public class Lab5ClassTask1 {

	public static void sum(int num1,int num2) {
		int sum2=num1+num2;
		System.out.println("Summation of two numbers : "+sum2); 
	}
	
	public static void sum(int num1,int num2,int num3) {
		int sum3=num1+num2+num3;
		System.out.println("Summation of three number : "+sum3);
	}
	
	public static void main(String[] args) {
		sum(4,6);
		sum(6,7,2);
	}
}
