import java.util.Random;

public class RollDice {

	
	public static void main(String args[]){
		int d1, d2, jail = 1;
		Random rnd = new Random();
		
		do{
			d1 = 1 + rnd.nextInt(6);
			d2 = 1 + rnd.nextInt(6);
			System.out.println("User rolls "+ d1 + " & " + d2);
			if( d1 == d2){
				System.out.println("DOUBLES!");
				jail++;
				if(jail <= 3){
					System.out.println("Move " + (d1+d2) + " Spaces and roll again getting... ");
				}
			}else{
				System.out.println("Move " + (d1+d2) + " Spaces and stop");
			}
			
		}while(d1 == d2 && jail <= 3);
		
		if(jail > 3){
			System.out.println("GO TO JAIL --->");
			
		}
	}
}
