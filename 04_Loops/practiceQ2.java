import java.util.*;
public class practiceQ2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();
        int fact=1;
        for(int i=n-1; i>=0; i--){
            fact *= n-i;
            System.out.print("(" + n + "-" + i + ")*");

        }
        System.out.print(" = " + fact);
        sc.close();
    }
}
