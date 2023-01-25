import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner hehe = new Scanner(System.in).useLocale(Locale.US);
        ;
        long x = hehe.nextInt();
        String acc = hehe.nextLine();
        char k = hehe.next().charAt(0);
        Integer w = hehe.nextInt();
        String gender = "";
        hehe.close();
        if (k == 'M' || k == 'm') {
            gender = "Mr";
        } else if (k == 'F' || k == 'f') {
            gender = "Ms";
        }
        System.out.printf("Hi %s . %s !", gender, acc);
        if (w > 20000) {
            System.out.println("Insufficient Funds ! You can not withdraw " + w);
        } else {
            System.out.println("Your Account Balance after withdrawl is " + (20000 - w));
        }
    }
}