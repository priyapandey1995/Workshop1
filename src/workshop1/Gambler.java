package workshop1;

public class Gambler {

	public static void main(String[] args) {
		//inisialise

		int stake=100;
		 int bets=1;
		
		 
		//when the probability is less than 0.5 its returns true else false
		 
		    int stakeIncrease = 150;
			int stakeDecrease = 50;
			int win=0;
			System.out.println("welcome to gambling world");
			System.out.println("stake is"+stake);
			System.out.println("bets is"+bets);
			for(int day=1;day<=20;day++) {
			while(stake > stakeIncrease && stake < stakeDecrease) {
				double betting=Math.random();
				if(betting <=0.5) {
			 System.out.println("gambler won the bets");
			 stake=stake+bets;
			win=win+50;
			break;}
			 else {
			System.out.println("gambler lost the bets");
			stake=stake-bets;
			 win=win-50;
			 break;
			 }
		 
		 }
			System.out.println("winning amount is"+win);
			  
		  }
		
		 } 
	
	
}


