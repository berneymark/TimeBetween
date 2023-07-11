import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What time did you start work? ");
        String startTime = scanner.nextLine();

        System.out.println("Start time is: " + startTime);
    }
}