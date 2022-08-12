package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator Calc = new Calculator();
		System.out.println("My Calculator Values");
		System.out.println("The sum is:" + Calc.add(23,34,45));
		System.out.println("The Difference is:" + Calc.sub(78, 34));
		System.out.println("The Multilied Value is:" + Calc.mul(33, 45));
		System.out.println("The Divided Value is:" + Calc.divide(88, 3));
	}
}
