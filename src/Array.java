import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Type Number: ");
            int len = scan.nextInt();
            int[] name = new int[len];

            for (int i = 0; i < name.length; i++) {
                name[i] = i + 1;
                System.out.println(name[i]);
            }
            int sum = 0;

            for (int num : name) {
                sum += num;
            }

            System.out.println("It's sum of your typed number :" + sum);
        }
    }
}
