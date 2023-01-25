import java.util.*;

public class test {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner h = new Scanner(System.in);
        int X = h.nextInt();
        int Y = h.nextInt();
        int N = h.nextInt();
        h.close();
        int count = 0;
        for (int i = X; i <= Y; i++) {
            if (i % N == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("NO OUTPUT");
        }
    }
}
=======
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
>>>>>>> master
