package addingMachine;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*System.out.println("Enter two numbers: ");
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println(addingMachine.add(x, y));*/
		
		
		calculator cal = new calculator();
		while (true) {
			System.out.println("Enter a formula:  ");
			String s = input.nextLine();
			String [] temp = s.split(" ");
			if (temp.length != 3) {
				System.out.println("Wrong format.");
				System.out.println("");
				continue;
			}
			cal.calculate(temp[0], temp[1], temp[2]);
			System.out.println("");
		}
		
	}
}
