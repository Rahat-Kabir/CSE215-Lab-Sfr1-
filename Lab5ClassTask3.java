/* Create a class to print the area of a square and a rectangle. The class has two methods with the same name
   but different number of parameters . The method for printing area of rectangle has two parameter which are length and breadth
   while the other method for printing area of square has one parameter which is side of square,
 */
public class Lab5ClassTask3 {
	public static void area(int side) {
		int areaOfSquare = side * side;
		System.out.println("Area of Square : " + areaOfSquare);
	}

	public static void area(int length, int breadth) {
		int areaOfRectangle = length * breadth;
		System.out.println("Area of Rectangle :" + areaOfRectangle);
	}
	
	public static void main(String[] args) {
		area(9);
		area(7,8);
	}
}
