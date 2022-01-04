package addingMachine;

public class calculator {
	
	public void calculate(String s1, String sign, String s2) {
		
		//try catch block here
		double num1 = Double.parseDouble(s1), num2 = Double.parseDouble(s2) ;
		
		switch(sign) {
		case "+": 
			System.out.println(adder(num1, num2));
			break;
		case "-":
			System.out.println(subtracter(num1, num2));
			break;
		case "*":
			System.out.println(multiplier(num1, num2));
			break;
		case "/":
			System.out.println(division(num1, num2));
			break;
		default:
			System.out.println("Wrong input.");
		}
	}
	
	public double adder(double x, double y) {
		return x + y;
	}
	
	public double subtracter(double x, double y) {
		return x - y;
	}
	
	public double multiplier(double x, double y) {
		return x * y;
	}
	
	public double division(double x, double y) {
		return x / y;
	}
}
