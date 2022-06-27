package workshop1;

public class Gambler {

	public static void main(String[] args) {
		//inisialise

		int stake=100;
		 int bets=1;
		 int totalamountafterbetting;
		 
		//when the probability is less than 0.5 its returns true else false
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


