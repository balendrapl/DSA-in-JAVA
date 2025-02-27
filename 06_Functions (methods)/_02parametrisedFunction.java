import java.util.*;

public class _02parametrisedFunction {

    public static void calculateSum(int num1, int num2) {   //parameters (formal parameters) --> these are the para. which we write in the definition of function
        int sum = num1 + num2;
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a,b);    //arguments (actual paramters) --> these are the para.(i.e the value that we pass to function) which we write at the time of function calling 
        sc.close();
    }

    //m2
    // public static int calculateSum(int num1, int num2) {  
    //     int sum = num1 + num2;
    //     return sum;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int SUM = calculateSum(a, b); 
    //     System.out.println(SUM);
    //     // System.out.print(calculateSum(a, b));     // or use this single line in place of above 2 lines

    //     sc.close();
    // }
} 