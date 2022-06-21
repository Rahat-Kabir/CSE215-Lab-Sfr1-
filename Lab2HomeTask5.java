import java.util.Scanner;

public class Lab2HomeTask5 {

	/* A person went to a City bank ATM Booth and entered his card to withdraw N amount of money.Now Consider the below cases;
	   i)The withdraw amount must be greater than or equal to 500.Print "INVALID AMOUNT" if the condition does't match.
	   ii)Amount must be multiple of 500.Print "IVALID VALUE" if the conditon does't satisfy.
	   iii)The maximum amount must be less than or equal to 20,000.Print "EXCEEDED AMOUNT" in this case.
	   iv)If the requested amount passes all above conditions, print "TRANSACTION SUCCESSFUL".
	   v)Else print "Error Occured".
	   
	   note : Use Nested Switch-case to solve it
	*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amountOfMoney;

		System.out.println("Enter 1 for withdrawn ");
		
		int choice = input.nextInt();

		switch (choice) {
			case 1:
			System.out.println("1.If you have enough balance then enter 1 ");
			System.out.println("2.Enter 0 for exit   ");
			int ch1 = input.nextInt();

			
			
			switch (ch1) {
			
			case 1:
			System.out.println("Enter amount of money to be withdrawn :");
			amountOfMoney = input.nextInt();

			if (amountOfMoney < 500) {
				System.out.println("INVALID AMOUNT");
			} else if (amountOfMoney % 500 != 0) {
				System.out.println("INVALID VALUE");
			} else if (amountOfMoney > 20000) {
				System.out.println("EXCEED AMOUNT");
			}

			else if (amountOfMoney >= 500 && amountOfMoney <= 20000 && amountOfMoney % 500 == 0) {
				System.out.println("TRANSACTION SUCESSFUL ");
			} else {
				System.out.println("Error Occured");
			}
			
			
			break;

		case 0:
			System.exit(0);
			
			
			
		}
			break;
		}

	}

}
