import java.util.Scanner;


class InputOutput{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	var answerOne = "Hello";

	System.out.print("Type Bob : ");
	String user = input.nextLine();

	System.out.println("You Wrote " + user + " You should have written " +answerOne);
		if(user == answerOne){

		System.out.println("Good job");
		}

		else{
		System.out.println("Really");
		}

	}
}
