//Ex04_GRA_DelaCruzJM <3

package ex04_gra_delacruzjm;
import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                
		
	System.out.print("""
                           Welcome to Rock, Paper, Scissors. Please choose an option:
                           1. Start game
                           2. Change number of rounds
                           3. Exit application
                           >    """);
        
        
        Scanner response_intro123 = new Scanner(System.in);
        int intro123 = response_intro123.nextInt();
        
        int roundCounter = 0;
        int inputCounter = 2;
        
        if (intro123 == 1) {
            System.out.println("Enjoy! :> ");
        } 
        
        if (intro123 == 2) {
            System.out.print("How many wins are needed to win a match?\n> ");
            Scanner change2 = new Scanner(System.in);
            inputCounter = change2.nextInt();
            System.out.println("Noted!!\n");
        }
        
        if (intro123 == 3) {
            System.out.println("Bye bye! <3");
            System.exit(0);
        }
        
        int uCount = 0;
        int cCount = 0;
        
        while ((uCount != inputCounter) || (cCount != inputCounter)){                 
                System.out.println("\n\nThis match will be first to " + inputCounter + " wins.");
                System.out.print("""
                                  The computer has selected its move. Select your move:
                                   1. Rock
                                   2. Paper
                                   3. Scissors
                                   >  """);

                Scanner response_play123 = new Scanner(System.in);
                int u_input123 = response_play123.nextInt();


                Move u_play123 = null;

                switch (u_input123) {
                    case 1:
                        u_play123 = rock ;
                        break;
                    case 2:
                        u_play123 = paper ;
                        break;
                    case 3:
                        u_play123 = scissors ;
                        break;
                }

                Move c_play123 = null;

                int c_input123 = ((int) Math.floor(Math.random()*3) + 1);

                switch (c_input123) {
                    case 1:
                        c_play123 = rock ;
                        break;
                    case 2:
                        c_play123 = paper ;
                        break;
                    case 3:
                        c_play123 = scissors ;
                        break;
                }



                int winner123 = Move.compareMoves(u_play123, c_play123);
                String outWin123 = "";

                

                switch (winner123) {
                    case 0:
                        outWin123 = "Player wins round!" ;
                        uCount ++;
                        break;
                    case 1:
                        outWin123 = "Computer wins round!";
                        cCount ++;
                        break;
                    case 2:
                        outWin123 = "Round is tied!" ;
                        uCount ++;
                        cCount ++;
                        break;
                }

                
                System.out.print("\nPlayer chose " + u_play123.getName() + ". Computer chose " + c_play123.getName() + ". " );
                System.out.println(outWin123);
                System.out.println("Player - " + uCount + ". Computer - " + cCount + ".");
                
                
                if ((uCount == inputCounter) || (cCount == inputCounter)) {
                    System.out.println("\n\n\n\nCONGRATSS!!");
                    System.out.println("Thank you for playing~\n\n\n");
                    break;
                }

        }
        
      
        
        
        
	}
}



/*if (u_play123.equals(c_play123)) {
                    winner123 = "Round is a tie!";
                }
                else if (u_play123.equals("Scissors") && c_play123.equals("Rock")) {
                    winner123 = "Computer wins round!";
                }
                else if (u_play123.equals("Scissors") && c_play123.equals("Paper")) {
                    winner123 = "Player wins round!";
                }
                else if (u_play123.equals("Rock") && c_play123.equals("Scissors")) {
                    winner123 = "Player wins round!";
                }
                else if (u_play123.equals("Rock") && c_play123.equals("Paper")) {
                    winner123 = "Computer wins round!";
                }
                else if (u_play123.equals("Paper") && c_play123.equals("Scissors")) {
                    winner123 = "Computer wins round!";
                }
                else if (u_play123.equals("Paper") && c_play123.equals("Rock")) {
                    winner123 = "Player wins round!";
                }
                else {
                    System.out.print("error");
                } **/ 