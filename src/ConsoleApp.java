import java.util.Scanner;

public class ConsoleApp {
    private static Scanner scanner;

    private Boolean is24;
    private int startTime;
    private int endTime;
    private int timeBetween;

    private ConsoleApp() {
        scanner = new Scanner(System.in);
        requestClockType();
        requestStartTime();
        requestEndTime();

        timeBetween = calcTimeBetween(startTime, endTime);
        System.out.println(timeBetween);
    }

    private void requestClockType() {
        System.out.print("Do you want 12H or 24H? ");
        String clockType = scanner.nextLine();

        is24 = is24H(clockType);
    }

    private boolean is24H(String input) {
        if (input.equals("12H"))
            return false;
        else return input.equals("24H");
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