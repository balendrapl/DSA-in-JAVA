public class _15numPyramid {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        for(int line=1; line<=n; line++){
            for(int sp=1; sp<=n-line; sp++){
                System.out.print(" ");
            }
            for(int num=1; num<=line; num++){
                System.out.print(number + " ");
            }
            System.out.println();
            number++;
        }
    }
}

/*
NOTE: this code gives desired output for only upto 9, as for 10 or above, the tens place distrubs the spacing
      Also, this pattern works only if we have given single spaces (as in line 7 & 10). For more spaces, the pattern distorts.

 output: 
         1 
        2 2
       3 3 3
      4 4 4 4
     5 5 5 5 5
 */


// slightly diff. method (better, as here is no need of taking extra variable as "number" that we have taken in above method)
/*
for(int line=1; line<=n; line++){
            for(int num=1; num<=n-line; num++){
               System.out.print(" ");
            }
            for(int num=1; num<=line; num++){
               System.out.print(line + " ");
            }
            System.out.println();
        }
 */