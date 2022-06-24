/* Create two methods having the same name but will differ in the data type of parameters. The first method sub()
   will receive two integers arguments and second method sub() will receive two double arguments.
 */
public class Lab5ClassTask2 {
	public static void sub(int num1, int num2) {
		int subI = num1 - num2;
		System.out.println("Subtraction of integers number : " + subI);
	}

	public static void sub(double num1, double num2) {
		double subD = num1 - num2;
		System.out.println("Subtraction of double number :" + subD);
	}

	public static void main(String[] args) {
		sub(9, 3);
		sub(12.5, 5.5);
	}
}
