import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public Main() {
        scanner = new Scanner(System.in);
        requestStartTime();
        requestEndTime();
    }

    public void requestStartTime() {
        System.out.print("What time did you start work? ");
        String startTime = scanner.nextLine();

        System.out.println("Start time is: " + startTime);
    }

    public void requestEndTime() {
        System.out.print("What time did you end work? ");
        String endTime = scanner.nextLine();

        System.out.println("Start time is: " + endTime);
    }

    public static void main(String[] args) {
        Main startProg = new Main();
    }
}