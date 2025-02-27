import java.util.*;

public class _01largestOf2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int a = sc.nextInt();
        System.out.print("Enter another no.: ");
        int b = sc.nextInt();
        if(a==b){
            System.out.print("both are equal");
        } else if(a>b){
            System.out.print("1st no. is larger");
        } else{
            System.out.print("2nd no. is greater");
        }
        sc.close();
    }
}