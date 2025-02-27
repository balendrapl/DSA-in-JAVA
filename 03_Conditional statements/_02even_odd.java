import java.util.*;

public class _02even_odd {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.print("no. is even");
        }else{
            System.out.print("no. is odd");
        }
        sc.close();
    }
}