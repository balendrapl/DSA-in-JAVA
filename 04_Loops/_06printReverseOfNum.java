public class _06printReverseOfNum {
    public static void main(String arg[]){
        int n = 10899;
        System.out.print("Reverse of num.: ");
        while(n>0){
            int lastDig = n%10;
            System.out.print(lastDig);
            n /= 10;
        }
    }
}
