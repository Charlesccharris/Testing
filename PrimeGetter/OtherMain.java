import java.util.Scanner;
import java.util.*;

class OtherMain{
        public static void main(String[] args){

                int[] prime = new int[100];
                Scanner input = new Scanner(System.in);
                StackOfIntegers listOfPrimes = new StackOfIntegers();
                int number = 1;
                int newNumber = 0;
                int size = 1;

                System.out.print("Please input your whole number: ");
                number = input.nextInt();
		prime = getPrimes(number, prime);

                while(number != 1){
                        newNumber = number;
// 			System.out.println(number);
                        for(int index = 0; index < prime.length; index++){
				if(prime[index] == 0){
					break;
				}
                                if((number % prime[index]) == 0){
                                        listOfPrimes.push(prime[index]);
                                        number /= prime[index];
                                        index = 0;
                                }
                        }
			if(number == 1){
				break;
			}
                        if(newNumber == number){
                                System.out.println("Sorry, the next prime for your number can't be found, try a different one number.");
                                System.exit(1);
                        }
                }

                size = listOfPrimes.getSize();
                int[] numbers = new int[size];

                while(!listOfPrimes.empty()){
                        for(int i = 0; i < size; i++){
                                numbers[i] = listOfPrimes.pop();
                        }
                }
                Arrays.sort(numbers);

                System.out.print("We found the following prime numbers: ");
                for(int i = size - 1; i > -1; i--){
                        System.out.print(numbers[i] + " ");
                }
                System.out.println();
        }

        public static int[] getPrimes(int maxNumber, int[] prime){

		int counter = 0;
		boolean isPrime = true;
		int currentNumber = 2;
		int i = 2;
		boolean exists = false;
		int j = 0;

		while(currentNumber < maxNumber){
			isPrime = true;
			i = 2;
			j = 0;
			exists = false;
			for(i = 2; i < currentNumber; i++){
				if(currentNumber % i == 0){
//					System.out.println("Not Prime: " + currentNumber);
					isPrime = false;
					break;
				}
			}
			if(isPrime){
//				System.out.println("Is Prime: " + currentNumber);
				if(counter == 100){
//					System.out.println("Found MAx");
					currentNumber = maxNumber;
					break;
				}
				for(j = 0; j <= counter; j ++){
					if(prime[j] == currentNumber){
//						System.out.println("In array");
						exists = true;
//						System.out.println("It's " + exists);
						break;
					}
				}
//				System.out.println("Out " + exists);
				if(!exists){
//					System.out.println("added to array");
					prime[counter] = i;
					counter++;
				}
			}
			currentNumber++;
		}
		return prime;
        }
}
