import java.util.*;

public class _07area_of_circle {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        System.out.print("Area of circle: ");
        double area = (3.14 * r * r);    // float area = (3.14*r*r);  -> its throwing error
        System.out.println(area);

/* reason of error in float case -> Actually java automatically consider every decimal value to double datatype
                               so to define a datatype as float then we have to add f after that decimal number. */
        System.out.print("area of circle: ");
        float area2 = (3.14f * r * r);   // use r = 3 to see difference
        System.out.print(area2);
        sc.close();
    }
}