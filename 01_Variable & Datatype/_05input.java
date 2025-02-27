import java.util.*;
// here we r importing a package in Java named as "util" in which so many predefined classes (e.g. Scanner) each with different type of codes, are present 

public class _05input {
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();      // for only 1st word of the string
        System.out.println(input);

// uper wale input me jitna string ignore ho jaega vo next wala input function already capture karlega isliye yaha input dene ki jarorat ni paregi
        String input2 = sc.nextLine(); // for whole string
        System.out.println(input2); 

        int number = sc.nextInt();
        System.out.println(number);

        float price = sc.nextFloat();
        System.out.println(price);
        sc.close();
    }
}