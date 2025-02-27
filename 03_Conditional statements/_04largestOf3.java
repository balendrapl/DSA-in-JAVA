import java.util.*;

public class _04largestOf3{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int a = sc.nextInt();
        System.out.print("Enter a no.: ");
        int b = sc.nextInt();
        System.out.print("Enter another no.: ");
        int c = sc.nextInt();
        
        // method 1
        
        // if(a>b){
        //     if(a>c){
        //         System.out.print("1st is largest");
        //     }else{
        //         System.out.print("3rd is greatest");
        //     }
        // }else{
        //     if(b>c){
        //         System.out.print("2nd is greatest");
        //     }else{
        //         System.out.print("3rd is greatest");
        //     }
        // }

        // method 2 -(wrong)
        
        // if((a>=b) && (a>=c)){
        //     System.out.print("1st is greatest");
        // } else if(b>=a) {                         //this is not enough as if b>a then without checking b>c or b<c, this condition will print its statement & exit
        //     System.out.print("2nd is greatest");
        // }else{
        //     System.out.print("3rd is greatest");
        // }

        // method 3 (correct & optimized)
        
        if((a>=b) && (a>=c)){
            System.out.print("1st is greatest");
        } else if(b>=c) {                        // here we used this bcoz we know that a is not largest, then either b or c is largest
            System.out.print("2nd is greatest");
        }else{
            System.out.print("3rd is greatest");
        }
        sc.close();
    }
}