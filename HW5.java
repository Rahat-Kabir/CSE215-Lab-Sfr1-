import java.util.Scanner;

public class HW5 {

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
