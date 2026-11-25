import java.util.Scanner; // goes at the very top of the file, above public class

public class GuessingGame {
    public static void main(String[] args) {

        // inside main:
        Scanner scanner = new Scanner(System.in);
        int secret = 42;
        int guess = 0;
        while (guess != secret) {
            System.out.println("Enter Your guess number: ");
            guess = scanner.nextInt(); // pauses and waits for the user to type a number
            if (guess > secret) {
                System.out.println("Too High number");
            } else if (guess < secret) {
                System.out.println("Too low number");
            } else {
                System.out.println("correct number: " + secret);
            }
        }
        scanner.close();
    }
}
