import java.util.*;
public class _06sum {
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Sum of a & b = ");
        int sum = a + b;
        System.out.println(sum);

        System.out.print("Product of a & b = ");
        int product = a * b;
        System.out.println(product);
        sc.close();
    }
}
 
