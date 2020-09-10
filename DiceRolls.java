import java.util.Scanner;

class DiceRolls{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int rollings = 1;
	char Y = '1';
	char N = '2';
	while(rollings == 1){


	System.out.print("(1) for d4\n(2) for d6\n(3) for d8\n(4) for d10\n(5) for d12\n(6) for d20\n(7) for d100: ");
	int dice = input.nextInt();


	switch (dice) {
	case 1:
		int dFour = (int)(Math.random() * 100 % 4);
		System.out.println("You rolled a four sided die, and rolled a " + (dFour + 1));
		break;
	case 2:
		int dSix = (int)(Math.random() * 100 % 6);
		System.out.println("You rolled a six sided die, and rolled a " + (dSix + 1 ));
                break;
	case 3:
	        int dEight = (int)(Math.random() * 100 % 8);
                System.out.println("You rolled an eight sided die, and rolled a " + (dEight + 1));
                break;
	case 4:
	        int dTen = (int)(Math.random() * 100 % 10);
                System.out.println("You rolled a ten sided die, and rolled a " + (dTen + 1));
                break;
	case 5:
        	int dTwelve = (int)(Math.random() * 100 % 12);
                System.out.println("You rolled a twelve sided die, and rolled a " + (dTwelve + 1));
                break;
	case 6:
        	int dTwenty = (int)(Math.random() * 100 % 20);
                System.out.println("You rolled a twenty sided die, and rolled a " + (dTwenty + 1));
                break;
	case 7:
	        int dHundred = (int)(Math.random() * 1000 % 100);
                System.out.println("You rolled a hundred sided die, and rolled a " + (dHundred + 1));
                break;
	}
	System.out.print("Do you want to roll again? (1) for yes, (2) for no: ");
	rollings = input.next();
	System.out.println("");
	}
	}
}
