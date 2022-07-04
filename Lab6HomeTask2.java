/* Take an array of 10 element. Split it into middle and store the elements in
 two different arrays. 
 Example..
 Initial Arrays : 5,8,9,12,13,14,15,18,19,20
 After splitting
 Array 1: [5,8,9,12,13]
 Array 2: [14,15,18,19,20]
 */

import java.util.Arrays;
import java.util.Scanner;

public class Lab6HomeTask2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter 10 elements :");
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextInt();
		}
		
		int n = arr.length;

		int[] a = new int[(n + 1) / 2];
		int[] b = new int[n - a.length];

		for (int i = 0; i < n; i++) {
			if (i < a.length) {
				a[i] = arr[i];
			} 
			else {
				b[i - a.length] = arr[i];
			}
		}
		System.out.print("Array 1: ");
		System.out.println(Arrays.toString(a));
		System.out.print("Array 2: ");
		System.out.println(Arrays.toString(b));
	}

}
