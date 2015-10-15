import javax.swing.JOptionPane;

public class Midterm {
	public static void main(String[] args) {
		int Y = 0;
		int win = 0;
		int playedGames = 0;
		int evens = 0;
		int oddNum = 0;
		float percentageWin;
		float percentageEven;
		float percentageOdd;
		
		JOptionPane
		.showMessageDialog(null,
				"You walk up to a table where a man rolls a die and you guess a number.");
		
		while (Y < 3) {
			int diceRoll = 1 + (int) (Math.random() * 6);
			/*JOptionPane                 This is a test Pane
			 .showMessageDialog(null, diceRoll);*/


			int guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want the odds or the evens boy?\n1. Odds\n2. Evens"));

			if (guess == 1) {
				JOptionPane.showMessageDialog(null, "You have guessed odds!");
			} else if (guess == 2) {
				JOptionPane.showMessageDialog(null, "You have chosen the evens!");
			}

			if ((diceRoll == 1) || (diceRoll == 3) || (diceRoll == 5) && (guess == 1)) {
				JOptionPane
						.showMessageDialog(null,
								"You have guessed correctly lad!\nI hope to never see you again!");
				win++;
				playedGames++;
				oddNum++;
				}
			else if ((diceRoll == 2) || (diceRoll == 4) || (diceRoll == 6) && (guess == 1)) {
				JOptionPane
						.showMessageDialog(null,
								"I've stolen yer earnings!\nPerhaps you'd like to try again?");
				playedGames++;
				}
			else if ((diceRoll == 2) || (diceRoll == 4) || (diceRoll == 6) && (guess == 2)) {
				JOptionPane
						.showMessageDialog(null,
								"You have guessed correctly lad!\nI hope to never see you again!");
				win++;
				playedGames++;
				evens++;
				} 
			else if ((diceRoll == 1) || (diceRoll == 3) || (diceRoll == 5) && (guess == 2)) {
				JOptionPane
						.showMessageDialog(null,
								"I've stolen yer earnings!\nPerhaps you'd like to try again?");
				playedGames++;
				oddNum++;
				evens++;
				}

			int again = Integer.parseInt(JOptionPane.showInputDialog(null, "Play again for another shilling lad?\n1. Yes\n2. No"));
			if (again == 1)
			{
				Y = 0;
			}
			
			else if (again == 2)
			{
				Y = 7;
			}
			
			JOptionPane.showMessageDialog(null, "You have played " + playedGames + " and won " + win + " games!");

			percentageWin = (float) ((win*100)/playedGames);
			percentageEven = (float) ((evens*100)/playedGames);
			percentageOdd = (float) ((oddNum*100)/playedGames);
			JOptionPane.showMessageDialog(null, "You've won the game " + percentageWin + "% of the time now!");
			JOptionPane.showMessageDialog(null, "You've guessed even " + percentageEven + "% of the time lad!");
			JOptionPane.showMessageDialog(null, "You've cursed my dice!\n They've come up odd " + percentageOdd + "% of the time!");
		}

	}
}