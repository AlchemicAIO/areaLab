package areaLab;

import java.util.Scanner;

public class area1{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String keepGoing = "";
		int d = 0;
		
		
		System.out.println("");
		
		do {
			System.out.print("Type the length: ");
			double length = in.nextDouble();
			System.out.println("");
			System.out.print("Type the Width: ");
			double width = in.nextDouble();

			area2 returnArea = new area2(length, width);
			returnArea.print();

			d++;
			//System.out.println(count);
			System.out.println("Would you like to Keep going: Yes or No");
			keepGoing = in.next();
		} while (keepGoing.equalsIgnoreCase("Yes"));

		if (keepGoing.equalsIgnoreCase("No")) {
			System.out.println("Thank you for creating "+ d +" Areas with our program");

		}
	}

}










