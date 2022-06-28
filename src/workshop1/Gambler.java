package workshop1;

public class Gambler {

	public static void main(String[] args) {
		//inisialise

		int stake=100;
		 int bets=1;
		 int totalamountafterbetting;
		 int stakeIncrease = 150;
		int stakeDecrease = 50;
		 
		//when the probability is less than 0.5 its returns true else false
		while(stake > stakeIncrease && stake < stakeDecrease) {
		double betting=Math.random();
		 if(betting <=0.5) {
			 System.out.println("gambler won the bets");
			 totalamountafterbetting=stake+bets;
			 System.out.println("amount is" +" "+ totalamountafterbetting);
		 }
			 else {
			System.out.println("gambler lost the bets");
			totalamountafterbetting=stake-bets;
			 System.out.println("amount is"+" "+totalamountafterbetting);
			 }
		 
		 
		 
		}
			  
		  }
		 } 
	
	}


