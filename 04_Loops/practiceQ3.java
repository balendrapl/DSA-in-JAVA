import java.util.*;

public class practiceQ3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
        sc.close();
    }
}
