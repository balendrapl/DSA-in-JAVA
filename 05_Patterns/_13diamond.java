public class _13diamond {
    public static void main(String[] args) {
        int n=4;
        for(int line=1; line<=n; line++){
            for(int i=1; i<=n-line; i++){
                System.out.print("  ");
            }
            for(int star=1; star<=2*line-1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int line=1; line<=n; line++){
            for(int i=1; i<=line; i++){
                System.out.print("  ");
            }
            for(int star=1; star<=2*(n-line)-1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 output:
      * 
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *
      
 */