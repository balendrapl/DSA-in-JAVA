public class _03linearSearch {

    public static int linearSearch(int num[], int n) {
        for(int i=0; i<num.length; i++){
            if(num[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch(String menu[], String n) {
        for(int i=0; i<menu.length; i++){
            if(menu[i] == n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {4, 5, 19, 2, 10, 8, 1};
        int key = 10;
        String menu[] = { "Dosa", "Ras Malai", "Kaajo Katli", "Pav Bhaji"};
        String item = "Kaajo Katli";

        int index = linearSearch(num, key);
        int itemNum = linearSearch(menu, item);

        if(index == -1){
            System.out.println("key is not present");
        } else{
            System.out.println("key is present at index:" + index);
        }
        if(itemNum == -1){
            System.out.println("item is not present");
        } else{
            System.out.println("item is present at item no.:" + itemNum);
        }
    }
}
