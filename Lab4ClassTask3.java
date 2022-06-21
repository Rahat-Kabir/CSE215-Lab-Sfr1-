/* Generate a random int between 1990 and 2020.Then print it check if it's a leap year or not.
  Generate your own method to complete the task.
  	Sample output :
  		2015:false
 */
public class Lab4ClassTask3 {

	public static void main(String[] args) {

		int min = 1990;
		int max = 2020;
		System.out.println("Random integer :");
		int year = (int) (min + Math.random() * (max - min + 1));
		System.out.println(year);
		System.out.print(LearYear(year));

	}

	public static int LearYear(int year) {
		if (year % 400 == 0) {
			System.out.println("true");
		} 
		else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("true");
		} 
		else {
			System.out.println("false");
		}
		return year;

	}

}