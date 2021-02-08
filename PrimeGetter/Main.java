import java.util.Scanner;
import java.math.*;

public class Main{
        public static void main(String[] args){
                /*(Large prime numbers)
                Write a program that finds five prime numbers
                larger than Long.MAX_VALUE.*/
                Scanner input = new Scanner(System.in);

                boolean isPrime = true;
                BigInteger ourNumber = new BigInteger("9871284");
                int totalNumbers = 5;
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

