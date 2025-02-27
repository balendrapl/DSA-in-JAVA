public class _02arrayAsArgument {

    public static void update(int marks[], int nonChangable) {
        for(int i=0; i<marks.length; i++) {
            marks[i]++;
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        nonChangable = 10;
        System.out.println("nonChangable value in update(): " + nonChangable);
        
    }
    public static void main(String[] args) {
        int marks[] = {95, 98, 93, 96};
        int nonChangable = 5;
        update(marks, nonChangable);
        
        //for checking the update in values by CALL BY REFERENCE
        for(int i=0; i<marks.length; i++ ){
            System.out.print(marks[i] + " ");
        }
        
        //for checking the update in value of nonChangable by CALL BY VALUE
        System.out.println("\nnonChangable value in main() even after changing its value: " + nonChangable);
    }
}
