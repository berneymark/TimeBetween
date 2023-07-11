import java.util.Scanner;

public class ConsoleApp {
    public static Scanner scanner;

    public Boolean is24;

    public ConsoleApp() {
        scanner = new Scanner(System.in);
        requestClockType();
        requestStartTime();
        requestEndTime();
    }

    public void requestClockType() {
        System.out.print("Do you want 12H or 24H? ");
        String clockType = scanner.nextLine();

        is24 = is24H(clockType);
    }

    public boolean is24H(String input) {
        if (input.equals("12H"))
            return false;
        else return input.equals("24H");
    }

    public void requestStartTime() {
        System.out.print("What time did you start work? ");
        String startTime = scanner.nextLine();

        System.out.println("Start time is: " + startTime);
    }

    public void requestEndTime() {
        System.out.print("What time did you end work? ");
        String endTime = scanner.nextLine();

        System.out.println("End time is: " + endTime);
    }

    public static void main(String[] args) {
        new ConsoleApp();
    }
}