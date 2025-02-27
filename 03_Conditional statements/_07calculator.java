import java.util.*;

public class _07calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = sc.nextInt();
        System.out.print("Enter the operator: ");
        char op = sc.next().charAt(0);
        System.out.print("Enter 2nd num: ");
        int b = sc.nextInt();

        switch(op){
            case '+' : System.out.print(a + " + " + b + " = " + (a+b));
                    break;
            case '-' : System.out.print(a + " - " + b + " = " + (a-b));
                    break;
            case '*' : System.out.print(a + " * " + b + " = " + (a*b));
                    break;
            case '/' : System.out.print(a + " / " + b + " = " + (a/b));
                    break;
            case '%' : System.out.print(a + " % " + b + " = " + (a%b));
                    break;
            default : System.out.print("Its not a valid operator.");
        }
        sc.close();
    }
}
