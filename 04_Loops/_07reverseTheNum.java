// ⭐⭐ 
public class _07reverseTheNum {
    public static void main(String args[]){
        int n = 10899;
        int reverse = 0;
        while(n>0){
            int lastDig = n%10;
            reverse = (reverse*10) + lastDig;
            n /= 10;
        }
        System.out.print(reverse);
    }
}