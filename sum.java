import java.util.Scanner;

public class sum {
    public static void main(String... h) {
        Scanner hehe = new Scanner(System.in);
        System.out.println("enter two integers to find the sum");
        Integer a = hehe.nextInt();
        Integer b = hehe.nextInt();
        Integer c = a + b;
        System.out.println("the sum of the two numbers is : " + c);

    }
}
