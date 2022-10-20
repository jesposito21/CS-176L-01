import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class DonationsTester {

	public static void main(String[] args)throws FileNotFoundException  {
		File inputFile = new File("Donations.txt");
		String category = "";
		Scanner theFile=new Scanner(inputFile);
		Donations giveToMe = new Donations();
		Scanner in = new Scanner(System.in);
		System.out.print("Would you like to process donations now? (enter 'Yes' to continue):");
		String userInput = in.next();
		
		if (userInput.equals("yes")) {
			while (theFile.hasNextLine())
			{
				Double value = in.nextDouble();
				Process anything;
			
			}
			System.out.println(giveToMe.processDonation(category));
			System.out.print(giveToMe.getStatistics());
			
			
		}
		else {
			System.out.println("Ending now without processing donations.");
			
		}
		
		

	}

}
