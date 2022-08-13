package week1.day2;
import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] Array= {22,67,98,1,34,58,99};
		Arrays.sort(Array);
		//for(int i=0;i < Array.length ;i++)
		//{
			//System.out.println(Array[i]);
		//}
		
		System.out.println("The Second Largest no is" + Array[Array.length-2]);
		
		
	}
	
}
