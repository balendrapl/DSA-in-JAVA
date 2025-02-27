public class _05binarySearch {

    public static int binarySearch(int num[], int n) {
        int st = 0;
        int ed = num.length-1;
        //int mid = (ed + st)/2;      //big blunder if we keep this line outside the loop
        while(st<=ed){
            int mid = (ed + st)/2;      
            if(n == num[mid]){
                return mid;
            } else if(num[mid] < n){
                st = mid+1;
            } else{
                ed = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int num[] = {2, 5, 9, 62, 75, 88};
        int key = 88;


        System.out.println(binarySearch(num, key));

        // int index = binarySearch(num, key);
        // if(index == -1){
        //     System.out.println("key is not present");
        // } else{
        //     System.out.println("key is present at index:" + index);
        // }
    }
}
