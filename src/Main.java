import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public Main() {
        scanner = new Scanner(System.in);
        requestStartTime();
    }

    public void requestStartTime() {
        System.out.print("What time did you start work? ");
        String startTime = scanner.nextLine();

        System.out.println("Start time is: " + startTime);
    }

    public static void main(String[] args) {
        Main startProg = new Main();
    }
}