package discreteStructures;

public class PickTwoExample {

	public static void main(String[] args) {
		System.out.println("Hello example of using loops, selections, and 2d arrays.");

		boolean comedyFirst = flipForComedyFirst();

		int comedyCount = 7;
		int horrorCount = 9;
		int typesOfMovies = 2;
		int[][] movieIndex = new int [comedyCount*horrorCount][typesOfMovies];
		fillMovieIndex(movieIndex);
		//printMovieIndex(movieIndex);
		int pickAPair = (int)((Math.random()*comedyCount*horrorCount) + 1);
		printMovieSelection(comedyFirst,movieIndex,pickAPair);
	}

	private static boolean flipForComedyFirst() {
		boolean comedyFirst = true;
		double coinToss = Math.random();
		if(coinToss <= 0.5) {
			comedyFirst = true;
		} else {
			comedyFirst = false;
		}
		return comedyFirst;
	}

	private static void fillMovieIndex(int[][] movieIndex) {
		int index = 0;
		for(int HorrorIndex = 0; HorrorIndex <9; HorrorIndex++) {
			for(int ComedyIndex = 0; ComedyIndex < 7; ComedyIndex++) {
				movieIndex[index ][0] = HorrorIndex+1;
				movieIndex[index][1] = ComedyIndex+1;
				index++;
			}
		}
	}

	private static void printMovieIndex(int[][] movieIndex) {
		for(int horizontalIndex =0; horizontalIndex < movieIndex.length; horizontalIndex++) {
			for(int verticalIndex =0; verticalIndex < movieIndex[0].length; verticalIndex++) {
				System.out.print(movieIndex[horizontalIndex][verticalIndex] + ", ");
			}
			System.out.println();
		}
	}

	private static void printMovieSelection(boolean comedyFirst, int[][] movieIndex, int pickAPair) {
		//System.out.println("Comedy First is: " + comedyFirst);
		//System.out.println("Pairing Selected is: " + pickAPair);
		System.out.print("Movie pair is: ");
		if(comedyFirst) {
			printComedyTitle(movieIndex[pickAPair - 1][1]);
			System.out.print(" and ");
			printHorrorTitle(movieIndex[pickAPair - 1][0]);
		} else {
			printHorrorTitle(movieIndex[pickAPair - 1][0]);
			System.out.print(" and ");
			printComedyTitle(movieIndex[pickAPair - 1][1]);
			//System.out.println("\nHorror Index is: " + movieIndex[pickAPair - 1][0]);
			//System.out.println("Comedy Index is: " + movieIndex[pickAPair - 1][1]);
		}

	}

	private static void printComedyTitle(int comedyIndex) {
		switch(comedyIndex) {
		case 1: System.out.print("JOJO Rabbit"); break;
		case 2: System.out.print("The hangover"); break;
		case 3: System.out.print("American Werewolf in London"); break;
		case 4: System.out.print("Jumanji"); break;
		case 5: System.out.print("Deadpool 2"); break;
		case 6: System.out.print("Deadpool 1"); break;
		case 7: System.out.print("Girls Trip"); break;
		case 8: System.out.print("Pitch Perfect"); break;
		case 9: System.out.print(" Paul"); break;
		default: System.out.println("These are not the droids you are looking for.");	
		}
	}

	private static void printHorrorTitle(int horrorIndex) {
		switch(horrorIndex) {
		case 1: System.out.print("Friday the 13th"); break;
		case 2: System.out.print("The grudge"); break;
		case 3: System.out.print("Scream"); break;
		case 4: System.out.print("Annabelle"); break;
		case 5: System.out.print("Lights Out"); break;
		case 6: System.out.print("The Babadook "); break;
		case 7: System.out.print("Us"); break;
		case 8: System.out.print("A Quiet Place"); break;
		case 9: System.out.print("IT"); break;
		default: System.out.println("Always know where your towel is...");
		}
	}
}
