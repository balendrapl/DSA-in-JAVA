public class _09prime_in_range {

    //m1

    public static void primeNum(int a, int b) {
        for(int i=a; i<=b; i++){                     //if we want only end range, then set 'i=2'
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++ ){
                if(i%j==0){
                    isPrime = false;
                } 
            }
            if(isPrime == true){
                System.out.print(i + ", ");
            }   
        }
    }

    //m2 (better)

    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeNum(int a, int b) {
        for(int i=a; i<=b; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int start = 50;  //NOTE: start >= 2
        int end = 100;
        primeNum(start,end);   //m1
        System.out.println();
        PrimeNum(start, end);  //m2
    }
}



//m1 (possible error) Slight errors leading to gr8 changes...

// public class _09prime_in_range {
//     public static void numOfprime(int n) {
//         boolean isPrime = true;               

/* this above line is creating error. As with the help of 'Sysopt(isPrime)', we find that
 on stricking the 1st composite no. 'isPrime = false' & for next iteration of inner loop 
 its if-condition fails but as isPrime is already false, so the 2nd if-condition statement
 also fails. Therefore, we have to update isPrime to TRUE after every iteration of inner loop.
 Hence, we should initialize isPrime inside the outer loop.
*/

//         for(int i=2; i<=n; i++){
//             for(int j=2; j<=Math.sqrt(i); j++ ){
//                 if(i%j==0){
//                     isPrime = false;
//                 } 
//             }
//             System.out.println(isPrime);
//             if(isPrime == true){
//                 System.out.println(i + ", ");
//             }   
//         }
//     }
//     public static void main(String[] args) {
//         numOfprime(16);
//     }
// }
