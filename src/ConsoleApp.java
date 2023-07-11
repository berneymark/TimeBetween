import java.util.Scanner;

public class ConsoleApp {
    private static Scanner scanner;

    private int startTime;
    private int endTime;
    private int timeBetween;

    private ConsoleApp() {
        scanner = new Scanner(System.in);

        System.out.println("Please use 24H Time! E.G: 18:15");
        requestStartTime();
        requestEndTime();

        timeBetween = calcTimeBetween(startTime, endTime);
        System.out.println(timeBetween);
    }

    private void requestStartTime() {
        System.out.print("What time did you start work? ");
        String stTime = scanner.nextLine();
        startTime = Integer.parseInt(stTime);
    }

    private void requestEndTime() {
        System.out.print("What time did you end work? ");
        String edTime = scanner.nextLine();
        endTime = Integer.parseInt(edTime);
    }

    private int calcTimeBetween(int start, int end) {
        return end - start;
    }

    public static void main(String[] args) {
        new ConsoleApp();
    }
}