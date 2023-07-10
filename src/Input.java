import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        try (Scanner any = new Scanner(System.in)) {
            System.out.print("type in number: ");
            int out = any.nextInt();
            System.out.println(out);
        }   
    }
}
