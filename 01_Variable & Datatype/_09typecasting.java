import java.util.*;

public class _09typecasting {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        float a= 23.9999f;
        int b = (int)a;
        System.out.println(b);

        char ch = 'a';
        char ch2 = 'b';
        int num1 = ch;
        int num2 = ch2;
        System.out.println(num1);
        System.out.print(num2);
        sc.close();
    }
}
//note- typecasting is also called explicit conversion as it is done manually
//note- typecasting is also called narrowing conversion