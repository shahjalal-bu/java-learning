import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num;
            System.out.print("Enter integer number : ");
            num = input.nextInt();
            if (num > 5) {
                System.out.println("Condition is true " + num);
            }
        }

    }
}
