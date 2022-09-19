import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//get all inputs
		
	System.out.print("Enter the painter's cost per square foot: ");
	double painterCost = sc.nextDouble();
	
	System.out.print("Enter the length of the house: ");
	double houseLength = sc.nextDouble(); 
	
	System.out.print("Enter the width of the house: ");
	double houseWidth = sc.nextDouble();
	
	System.out.print("Enter the height of the house: ");
	double houseHeight = sc.nextDouble();
	
	System.out.print("Enter the number of windows: ");
	double windowNum = sc.nextDouble();
	
	System.out.print("Enter the length of the windows: ");
	double windowLength = sc.nextDouble();
	
	System.out.print("Enter the width of the windows: ");
	double windowWidth = sc.nextDouble();
	
	System.out.print("Enter the number of doors: ");
	double doorNum = sc.nextDouble();
	
	System.out.print("Enter the length of the doors: ");
	double doorLength = sc.nextDouble();
	
	System.out.print("Enter the width of the doors: ");
	double doorWidth = sc.nextDouble();
	

	
	//Calculations
	
	double peakSide = houseLength*houseWidth+0.50*(houseLength*(houseHeight-houseWidth));
	double normalSide = houseLength*houseWidth;
	double doorFT = (doorLength*doorWidth)*doorNum;
	double windowFT=(windowLength*windowWidth)*windowNum;
	double sideSum=(peakSide*2)+(normalSide*2);
	double totalArea = (sideSum-(windowFT+doorFT));
	double estimateCost = (painterCost*totalArea);
	
	//Show calculations
	
	String output1 = String.format("Your total paintable surface area is %.0f square feet.",totalArea);
	String output2 = String.format("Your total estimate is %.0f dollars.",estimateCost);
	System.out.println(output1);
	System.out.println(output2);
	
	
		

	}

}
