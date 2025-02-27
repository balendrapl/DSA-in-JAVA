public class _11solidRhombus {
    public static void main(String[] args) {
        int n=4;
        for(int line=1; line<=n; line++){
            for(int star=1; star<=n-line; star++){
                System.out.print("  ");
            }
            for(int star=1; star<=n; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 output:
      * * * * 
    * * * *
  * * * *
* * * *

 */