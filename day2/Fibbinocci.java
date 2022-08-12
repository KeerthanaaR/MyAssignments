package week1.day2;

public class Fibbinocci {
//private static final String Sum = null;

public static void main(String[] args) {
	int i=1, n=11; int Firstnum = 0; 
	int Secondnum=1;
System.out.println("Fibonocci series till " + n + " numbers");
while (i<=n)
{
	System.out.println(Firstnum);
	
int sum = Firstnum + Secondnum;
Firstnum = Secondnum;
Secondnum = sum;

i++;

}
	
}
}
