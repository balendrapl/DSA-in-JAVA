import java.util.*;

public class _01arraysCC {
    public static void main(String args[]) {
        int marks[] = new int[50];

        System.out.println("Length of array: " + marks.length);
        
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Maths marks: " + marks[0]);
        System.out.println("Physics marks: " + marks[1]);
        System.out.println("Chemistry marks: " + marks[2]);
        
        marks[2] = marks[2] + 1;
        System.out.println("Chemistry marks: " + marks[2]);
        sc.close();
    }
}