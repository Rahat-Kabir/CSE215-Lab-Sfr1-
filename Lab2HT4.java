import java.util.Scanner;

public class Task4 {
	
/*Take three student name id,Section,CGPA,gender from user input
	i)Print students id,section if gender is female and name length is 4
	ii)Print students name,CGPA if gender is male and start with S*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name1;
		String gender1;
		int id1;
		int section1;
		double CGPA1;

		String name2;
		String gender2;
		int id2;
		int section2;
		double CGPA2;

		String name3;
		String gender3;
		int id3;
		int section3;
		double CGPA3;

		System.out.println("---Enter first Student information ---\n");
		System.out.println("Enter first Student Name : ");
		name1 = input.nextLine();
		System.out.println("Enter first Student ID : ");
		id1 = input.nextInt();
		input.nextLine();
		System.out.println("Enter first Student Section : ");
		section1 = input.nextInt();
		input.nextLine();
		System.out.println("Enter first Student CGPA : ");
		CGPA1 = input.nextDouble();
		input.nextLine();
		System.out.println("Enter first Student Gender : ");
		gender1 = input.next();

		System.out.println("\n---Student1 information Display---\n");
		if (gender1.equals("female") && name1.length() == 4) {
			System.out.println("Student1 ID : " + id1);
			System.out.println("Student1 Section :" + section1);
		}

		else if (gender1.equals("male") && name1.charAt(0) == 'S') {

			System.out.println("Student1 Name : " + name1);
			System.out.println("Student1 CGPA : " + CGPA1);

		}

		System.out.println("\n---Enter Second Student information ---\n");

		System.out.println("Enter Second Student Name : ");
		name2 = input.nextLine();
		input.nextLine();
		System.out.println("Enter Second Student ID : ");
		id2 = input.nextInt();
		input.nextLine();
		System.out.println("Enter Second Student Section : ");
		section2 = input.nextInt();
		input.nextLine();
		System.out.println("Enter Second Student CGPA : ");
		CGPA2 = input.nextDouble();
		input.nextLine();
		System.out.println("Enter Second Student Gender : ");
		gender2 = input.nextLine();

		
		if (gender2.equals("female") && name2.length() == 4) {
			System.out.println("\n---Student2 information Display---\n");
			System.out.println("Student2 ID : " + id2);
			System.out.println("Student2 Section :" + section2);
		}

		else if (gender2.equals("male") && name2.charAt(0) == 'S') {

			System.out.println("Student2 Name : " + name2);
			System.out.println("Student2 CGPA : " + CGPA2);

		}

		System.out.println("\n---Enter third Student information ---\n");
		System.out.println("Enter third Student Name : ");
		name3 = input.nextLine();
		input.nextLine();
		System.out.println("Enter third Student ID : ");
		id3 = input.nextInt();
		input.nextLine();
		System.out.println("Enter third Student Section : ");
		section3 = input.nextInt();
		input.nextLine();
		System.out.println("Enter third Student CGPA : ");
		CGPA3 = input.nextDouble();
		input.nextLine();
		System.out.println("Enter third Student Gender : ");
		gender3 = input.nextLine();

		System.out.println("\n\n---Student3 information Display---\n");
		if (gender3.equals("female") && name3.length() == 4) {
			System.out.println("Student3 ID : " + id3);
			System.out.println("Student3 Section :" + section3);
		}

		else if (gender3.equals("male") && name3.charAt(0) == 'S') {

			System.out.println("Student1 Name : " + name3);
			System.out.println("Student1 CGPA : " + CGPA3);

		}

	}

}
