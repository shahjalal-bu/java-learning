import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            System.out.println("Enter a number:");
            number = input.nextInt();
            System.out.println("Number is = " + number);
        }
    }
}
