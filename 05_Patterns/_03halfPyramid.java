import java.util.*;

public class _03halfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for(int line=1; line<=n; line++){
            for(int num=1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
        sc.close();
    }
}
