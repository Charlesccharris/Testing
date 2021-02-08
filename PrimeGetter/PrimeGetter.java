mport java.util.Scanner;
import java.math.*;

public class PrimeGetter{

        private BigInteger ourNumber;
        private int totalNumbers;

        public PrimeGetter(Scanner input){
                System.out.print("Enter the number that you would like to start at: ");
                this.ourNumber = new BigInteger(input.next());
                System.out.print("Enter how many prime numbers you want to find: ");
                this.totalNumbers = input.nextInt();
        }

        public void findPrimes(){
                boolean isPrime = true;
                int foundNumbers = 0;

                while(foundNumbers < totalNumbers){
                        isPrime = true;
                        for(BigInteger primeChecker = BigInteger.valueOf(2); primeChecker.compareTo(ourNumber) < 0;
                        primeChecker = primeChecker.add(BigInteger.ONE)){
                                if(BigInteger.ZERO.equals(ourNumber.mod(primeChecker))){
                                        isPrime = false;
                                        break;
                                }
                        }
                        if(isPrime){
                                System.out.println(ourNumber + " is prime");
                                foundNumbers++;
                                System.out.println("Found " + foundNumbers);
                        }
                        ourNumber = ourNumber.nextProbablePrime();
		}
	}
}
