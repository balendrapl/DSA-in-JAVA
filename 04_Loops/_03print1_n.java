import java.util.*;

public class _03print1_n {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = sc.nextInt();
        int counter = 1;
        while(counter<=range){
            System.out.print(counter + " ");
            counter++;
        }
        sc.close();
    }
}