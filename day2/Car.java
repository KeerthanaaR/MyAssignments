package week1.day2;

public class Car {
	public void printCarName()
	{
		System.out.println("BMW");
	}
	
	public String getCarColour()
	{
		return "Black";
	}

	public String getEngineNumber()
	{
		return "2345666";
		
	}
	public int MathFunction(int a, int b)
	{
		int c= a - b;
		System.out.println("Sub:" + c);
		
		int d= a * b;
		System.out.println("Multi:" + d);
		int e=a/b;
		return e;

	}
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.printCarName();
		String result=obj.getCarColour();
		System.out.println(result);
		String Enginenumber=obj.getEngineNumber();
		System.out.println(Enginenumber);
		int Math =obj.MathFunction(20, 10);
		System.out.println(Math);
		// String carColour = obj.getCarColour();
	
	}
}
