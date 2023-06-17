package ArrayExample;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int reversedNumber = 0;
            for (int tempNumber = number; tempNumber != 0; tempNumber /= 10) {
                int digit = tempNumber % 10;
                reversedNumber = reversedNumber * 10 + digit;
            }

            System.out.println("Reversed number: " + reversedNumber);
        }
    }


