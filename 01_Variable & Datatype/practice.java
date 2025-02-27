//Q.3
import java.util.*;

public class practice {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float pl = sc.nextFloat();
        float pen = sc.nextFloat();
        float er = sc.nextFloat();
        float total = (pl+pen+er);
        /* System.out.print("Total cost= ");
           System.out.println(total);
            ---> for above 2 lines we can use the following single line of code*/
        System.out.println("Total cost = " + total);

        System.out.print("Total cost with 18% GST= ");
        float withGST = total + total*0.18f;
        System.out.print(withGST);
        sc.close();
    }
}

/*Q.5- Will the following statement give any error in Java?
        int $ = 24;
Ans.- No, the statement will not give any error.
Names of variables are called identifiers in Java.
Identifier rule says,identifiers can start with any 
alphabet or underscore (“_”) or dollar (“$”).
According to the rule the given variable name is a valid identifier.
*/