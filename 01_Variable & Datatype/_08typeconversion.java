import java.util.*;

public class _08typeconversion {
    public static void main(String arg[]) {
        int a = 5;
        long b = a;
        System.out.println(b);

/* this below code will give error bcoz of incompatible datatype lossy conversion from long to int
as long is a big datatype as compare to int */
        // long c = 6;
        // int d = c;
        // System.out.print(d);

// Similarly for below commented code 
        Scanner sc = new Scanner(System.in);
        // int number = sc.nextFloat();       // here Float num can't be stored in int datatype
        // System.out.print(number);

        float number = sc.nextInt();     //  int num can be stored in float datatype
        System.out.print(number);
        sc.close();
    }
}