package week1.day2;

public class PrintOddNumbers {
	
	

	public static void main(String[] args) {
		int number =77;
		System.out.print("List of odd numbers from 51 to "+number+": ");  
		for(int i=51;i<=77;i++ )
		{
			if (i%2!=0)
			{
				System.out.println(i + " ");
			}
		}
	}

	
}
