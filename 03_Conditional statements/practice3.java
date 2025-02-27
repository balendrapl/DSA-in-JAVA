import java.util.*;

public class practice3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 ==0){
                    System.out.print("Leap Year");
                } else{
                    System.out.print("not a Leap Year");
                }
            } else{
                System.out.print("Leap Year");
                
            } 
        }
        sc.close();
    }
}