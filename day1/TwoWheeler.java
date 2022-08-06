package week1.day1;

public class TwoWheeler {
	int NoOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 234595677l;
	boolean isPunctured = true;
	String bikeName = "Honda Dio";
	double runningKM = 3000.45 ;
	
	
	public static void main(String[] args) {
		
		TwoWheeler obj = new TwoWheeler();
		
		System.out.println("Two Wheeler Details");
		System.out.println("Wheels:" +obj.NoOfWheels + "\n" + "Mirror:" +obj.noOfMirrors + "\n" + "ChasisNo:" +obj.chassisNumber + "\n" +  "Punctured:" +obj.isPunctured + "\n" + "BikeName:" +obj.bikeName + "\n" + "KM:" +obj.runningKM);
			
	}

}
