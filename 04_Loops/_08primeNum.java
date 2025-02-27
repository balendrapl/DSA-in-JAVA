//m1 (optimised)
import java.util.*; 

public class _08primeNum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();

        //NOTE- n=1 is the CORNER CASE, as it is neither a prime nor a composite no.

        // actually there is no need of above if condition for checking 2, if we r using
        // 'i<=Math.sqrt(n)' in the below loop. Reason- in next chapter (Functions)
 
        if(n == 2){
            System.out.print("num is prime");
        } else{
            boolean isPrime = true;  // here we have considered isPrime is true i.e it is a prime no.
            for(int i=2; i<=Math.sqrt(n); i++){   // i<n --> this is not optimised [for optimisation use i<=Math.sqrt(n)]
                if(n%i == 0){
                    isPrime = false;
                }
            } 
            if(isPrime){
                System.out.print("num is prime");
            } else{
                System.out.print("num is not prime");
            }
        }
        sc.close();
    }
}



//m2 (not optimised)

/*import java.util.*;
public class _08primeNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num: ");
        int n = sc.nextInt();
        boolean isPrime = false;

        // here is the need of 'if condition' (as in above method) for checking the corner case of n=2

        for(int i=2; i<n; i++){
            if(n%i==0){
                isPrime = true;
            }
        }
        if(isPrime == true){  // 
            System.out.print("Its not a Prime num.");
        } else{
            System.out.print("Its a Prime num.");
        }
        sc.close();
    }
}
/*  note- if we initially assign true to isPrime, then we must have to take opposite case in both if conditions i.e false
          if we initially assign false to isPrime, then we must have to take opposite case in both if conditions i.e true
          But can't take all true or all false cases, as it will throw error.
*/
 