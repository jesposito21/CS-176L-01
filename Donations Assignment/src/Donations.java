
public class Donations {

	private int numIndividual;
	private double amtIndividual;
	private int numBusiness;
	private double amtBusiness;
	private int numOther;
	private double amtOther;
		
	public Donations() {
		numIndividual=0;
		amtIndividual=0;
		numBusiness=0;
		amtBusiness=0;
		numOther=0;
		amtOther=0;
	}
	public void processDonation(String cat, double donation) {
		
		if(cat.equals("individual donation")) {
			if(donation>0) {
				numIndividual++;
				amtIndividual=amtIndividual+donation;
			}
			else {
				numIndividual--;
				amtIndividual=amtIndividual+donation;
			}
		
		}
		else if(cat.equals("business donation")){
			if(donation>0) {
				numBusiness++;
				amtBusiness=amtBusiness+numBusiness;
			}
			else {
				numBusiness--;
				amtBusiness=amtBusiness-numBusiness;
			}
		}
		else if(cat.equals("other donation")) {
			if (donation>0) {
				numOther++;
				amtOther=amtOther+numOther;
			}
			else {
				numOther--;
				amtOther=amtOther+numOther;
			}
		}
	}
	public void getStatistics() {
		System.out.println("Individual: #:"+numIndividual+" $"+amtIndividual);
		System.out.println("Business: #:"+numBusiness+ " $"+amtBusiness);
		System.out.println("Other: #:"+numOther+" $"+amtOther);
		
	}
	}
		


