// import java.util.*;           -- //Dont know why this line isn't used

public class _04largestInArray {
    
    // (m1) finding largest num 
    public static int largest(int num[]) {
        int largest = num[0];               // here we considered 0th index num is the largest, then compared it with other
        for(int i=0; i<num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        return largest;
    }
    
    // (m2) finding largest num 
    public static int largest2(int num[]) {
        int largest = Integer.MIN_VALUE;     //here we considered largest = -infinity, which is the least possible value to be compared
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
            if(num[i] < smallest){
                smallest = num[i];
            }
        }
        System.out.println("smallest num: " + smallest);
        return largest;
        
    }

    //finding index of largest num
    public static int linearSearch(int num[], int n) {
        for(int i=0; i<num.length; i++){
            if(num[i] == largest(num)){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int num[] = {-945, 53, 2, 5, -99, 32, 99, 12};
        
        System.out.println("largest num: " + largest(num));
        System.out.println("largest num (by m2): " + largest2(num));
        System.out.println("and its index: " + linearSearch(num, largest(num)));
    }
}



/*  the "util" is actually a java utility package in which 
    such values like Integer.MAX_VALUE , MIN_VALUE etc are present.
    where MAX_VALUE = + infinity
    AND MIN_VALUE = - infinity
*/