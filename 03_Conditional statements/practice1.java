import java.util.*;

public class practice1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.print("Positive num.");
        } else if(a==0){                         // if a=0 it will give an error: incompatible types: int cannot be converted to boolean
            System.out.print("Its ZERO");
        } else{
            System.out.print("Negative num.");
        }
        sc.close();
    }
}