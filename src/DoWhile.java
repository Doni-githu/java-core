import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        try (Scanner some = new Scanner(System.in)) {
            int value;
            do {
                System.out.print("type 5: ");
                value = some.nextInt();
            } while (value != 5);
        }
        System.out.print("Success, You are typed 5");
    }
}
