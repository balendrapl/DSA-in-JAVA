import java.util.*;

public class _04sum1_n {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter <= range){
            sum += counter;
            counter++;
        }
        System.out.print("Sum = " + sum);
        sc.close();
    
    }
}