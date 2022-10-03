
public class Microwave {
	
	private int time=0;
	private int power=1;
	
	public void time() {
		time=time+30;
		System.out.println("Time button was pressed. Time is "+time+" seconds.");
		
		
	}
	public void power() {
		if (power==2)
		{
			power=1;
			System.out.println("Power Button was pressed. Power level is "+power);
		}
		else 
		{
			power=2;
			System.out.println("Power Button was pressed. Power level is "+power);
		}
				
	}
	
	public void reset() {
		time=0;
		power=1;
		System.out.println("Reset Button was pressed. Power level is at "+power+". Time is "+time+" seconds.");
		
	}
	public void start() {
		System.out.println("Cooking for "+time+" seconds"+" at level "+power+". ");
		
	}

	}

