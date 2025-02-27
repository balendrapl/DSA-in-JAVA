public class _14palindromicPattern {
    public static void main(String[] args) {
        int n=8;
        for(int line=1; line<=n; line++){
            for(int sp=1; sp<=n-line; sp++){
                System.out.print("  ");
            }
            for(int num=line; num>=2; num--){
                System.out.print(num + " ");
            }
            for(int num=1; num<=line; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
/* output:
              1 
            2 1 2
          3 2 1 2 3
        4 3 2 1 2 3 4
      5 4 3 2 1 2 3 4 5 
    6 5 4 3 2 1 2 3 4 5 6
  7 6 5 4 3 2 1 2 3 4 5 6 7
8 7 6 5 4 3 2 1 2 3 4 5 6 7 8
 */


//slightly diff method
/*
for(int line=1; line<=n; line++){
            for(int num=1; num<=n-line; num++){
               System.out.print("  ");
            }
            for(int num=line; num>=1; num--){
               System.out.print(num + " ");
            }
            //if(line>1){  ⭐here actually there is no need of if condition, if we start with num=2 instead of 1
                for(int num=2; num<=line; num++){
                   System.out.print(num + " ");
                }
            //}
            System.out.println();
        }
 */