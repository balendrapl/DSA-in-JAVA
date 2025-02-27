// method 1 (optimised & short code)(only for n>=2)
public class _08checkPrimeNum {

    public static boolean isPrimeNum(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0){
                return false;  // this false will be returned only if 'n%i==0'
            }
        }
        return true;  // this will be returned if the above 'if condition' fails  
    }
    public static void main(String[] args) {
        System.out.print(isPrimeNum(1));
    }
}



// method 2 (optimised but little bit long code)(only for n>=2)

// public class _08checkPrimeNum {

//     public static boolean isPrimeNum(int n) {
//         boolean isPrime =true;  // here we assume that our no. is already a prime no.
//         if(n==2){
//             isPrime = true;
//         }

/* actually there is no need of above if condition for checking 2, if we r using 'i<=Math.sqrt(n)'
 in the below loop. As sqrt(2)= 1.414 & sqrt(3)= 1.732 and loop start from i=2. So for n=2,3 the
 loop won't run. And by final return statement they will be defined as prime no.

 NOTE- n=1 is the CORNER CASE, as it is neither a prime nor a composite no. So we won't check for that.

 */

//         else{
//             for(int i=2; i<=Math.sqrt(n); i++) {
//                 if(n%i==0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         return isPrime;    
//     }
//     public static void main(String[] args) {
//         System.out.print(isPrimeNum(61));
//     }
// }
