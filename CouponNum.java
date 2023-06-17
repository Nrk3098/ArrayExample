package ArrayExample;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class CouponNum {
    public static int[] generateDistinctCouponNumbers(int n) {
            int[] couponNumbers = new int[n];
            boolean[] isGenerated = new boolean[n];
            int count = 0;
            Random random = new Random();

            while (count < n) {
                int randomNumber = random.nextInt(n);

                if (!isGenerated[randomNumber]) {
                    couponNumbers[count] = randomNumber + 1;
                    isGenerated[randomNumber] = true;
                    count++;
                }
            }

            return couponNumbers;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of distinct coupon numbers: ");
            int totalCouponNumbers = scanner.nextInt();
            scanner.close();

            int[] couponNumbers = generateDistinctCouponNumbers(totalCouponNumbers);

            System.out.println("Distinct coupon numbers:");
            for (int number : couponNumbers) {
                System.out.print(number + " ");
            }
        }
    }






