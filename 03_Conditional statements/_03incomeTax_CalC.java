import java.util.*;

public class _03incomeTax_CalC {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        long income = sc.nextInt();
        int tax;
        if(income<500000){
            tax = 0;
        } else if (income >= 500000 && income < 1000000){
            tax = (int)(income*0.2);
        } else {
            tax = (int)(income*0.3);
        }
        System.out.print("your tax: " + tax);
        sc.close();
    }
}