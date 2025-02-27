import java.util.*;

public class practice2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

// Question 3

        System.out.print("Enter number: ");
        int dayNum = sc.nextInt();

        switch(dayNum){
            case 1 : System.out.print("Monday");
                        break;
            case 2 : System.out.print("Tuesday");
                        break;
            case 3 : System.out.print("Wednesday");
                        break;
            case 4 : System.out.print("Thursday");
                        break;
            case 5 : System.out.print("Friday");
                        break;
            case 6 : System.out.print("Saturday");
                        break;
            case 7 : System.out.print("Sunday");
                        break;
            default : System.out.print("Invalid number");
        } 


// Question 2

        // double temp = 103.5;
        // if(temp>100){
        //     System.out.print("You have fever.");
        // } else{
        //     System.out.print("You don't have fever.");

        // }
        sc.close();
    }
}