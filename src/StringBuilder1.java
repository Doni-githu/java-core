import java.lang.StringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        String name = " Doniyor";
        sb.append(" Mr.").append(name);
        System.out.println(sb.toString());
    }

    public static int strCount(String str, char letter) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == letter) {
                count++;
            }
        }
        return count;
    }
}
