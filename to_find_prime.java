import java.util.*;

class to_find_prime {
    public static void main(String[] args) {
        Scanner haha = new Scanner(System.in);
        int x = haha.nextInt();
        haha.close();
        if (x > 1) {
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    System.out.println("Not Prime Number");
                    return;
                }
            }
        }
        System.out.println("Prime Number");

    }
}
