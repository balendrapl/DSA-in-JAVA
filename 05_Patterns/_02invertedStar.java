import java.util.*;

public class _02invertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // method 1

        // for(int i=4; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // method 2
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

