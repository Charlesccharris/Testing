import java.util.Scanner;

class HighOrLow{
	public static void main(String[] args){
	int losses = 0;
	int wins = 0;
        int newNumber = (int)(Math.random() * 100 % 14);
	Scanner input = new Scanner(System.in);
	System.out.println("Numbers 0 - 13, how many can you get right?");
	while(losses < 1){
				System.out.print("The current number is " + newNumber + 
						 " is the next number going to be (H)igher or (L)ower: ");
				int guessTwo = input.next().charAt(0);
				int oldNumber = newNumber;
				newNumber = (int)(Math.random() * 100 % 14);
				if(guessTwo != 'H' && guessTwo != 'L')
					System.exit(1);
				if(oldNumber < newNumber && guessTwo == 'H'){
					System.out.println("The new number was "+ newNumber + " which was higher, so you guessed correct.\n");
					wins++;
				}
				if(oldNumber > newNumber && guessTwo == 'H'){
					System.out.println("The new number was " + newNumber + " which was lower, so you guessed wrong.\n");
					losses++;
				}
				if(oldNumber < newNumber && guessTwo == 'L'){
					System.out.println("The new number was " + newNumber + " which was higher, so you guessed wrong.\n");
					losses++;
				}
				if(oldNumber > newNumber && guessTwo == 'L'){
					System.out.println("The new number was " + newNumber + " which was lower, so you guessed correct.\n");
					wins++;
				}
				if(oldNumber == newNumber)
					System.out.println("It was the same number.\n");
	}
	System.out.println("\nYou got " + wins + " rounds in a row");
	}
}
