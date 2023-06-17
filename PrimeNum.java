package ArrayExample;
import java.util.Scanner;

public class PrimeNum {
    public static void isPrime(int number) {
            if (number <= 1) {
                System.out.println(number + " is not a prime number.");

            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number.");

                }
            }

            System.out.println(number + " is a prime number.");
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            isPrime(num);
        }
    }





