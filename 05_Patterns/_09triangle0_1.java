//⭐⭐⭐⭐

public class _09triangle0_1 {
    public static void main(String[] args) {
        int n=4;
        for(int line=1; line<=n; line++){
            int one=1, zero=0;
            for(int j=line; j>=1; j--){
                if(j%2==0){
                    System.out.print(zero);
                } else{
                    System.out.print(one);              
                }
            }
            System.out.println();
        }
    }
}
/*
 (case1 output) ----> for(int j=1; j<=line; j++)
 1
 10
 101
 1010
 
 ⭐⭐(case2 output) ----> for(int j=line; j>=1; j--)
1
01
101
0101

 */
