import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner shit = new Scanner(System.in);
        int N = shit.nextInt();
        shit.close();
        for (int i = 1; i < N / 2; i++) {
            if (i * i * i == N) {
                System.out.println("Perfect Cube");
                return;
            }
        }
        System.out.println("Not Perfect Cube");
    }
}