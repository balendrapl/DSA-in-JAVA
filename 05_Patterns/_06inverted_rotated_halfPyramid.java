import java.util.*;

public class _06inverted_rotated_halfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int line=1; line<=n; line++){
            for(int i=1; i<=n-line; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=line; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// /*
//  output:
//         * 
//       * *
//     * * *
//   * * * *
// * * * * *

//  */
