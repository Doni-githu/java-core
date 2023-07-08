import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("type your age: ");
            int age = scan.nextInt();
            switch (age) {
                case 0:
                    System.out.println("your are born");
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("you're going to school but you're go to garden");
                    break;
                case 7:
                System.out.println("you're going to school");
                break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    System.out.println("you are schoolboy");
                    break;
                case 18:
                System.out.println("you are end school");
                break;

                default:
                    break;
            }
        }
    }
}
