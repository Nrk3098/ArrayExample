package ArrayExample;
import java.util.Scanner;
public class StopWatch {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press any key to start the stopwatch...");
            scanner.nextLine();
        .setVisibility(android.view.View.GONE);
            long startTime = System.currentTimeMillis();
            System.out.println("Stopwatch started.");

            System.out.println("Press any key to stop the stopwatch...");
            scanner.nextLine();

            long endTime = System.currentTimeMillis();
            System.out.println("Stopwatch stopped.");

            long elapsedTime = endTime - startTime;
            System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");

            scanner.close();

        }
    }


