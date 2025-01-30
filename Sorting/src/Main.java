import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] Array = {3, 4, 1, 5, 9, 2, 0};

        InsertionSort insertion = new InsertionSort();
//        insertion.sort(Array);

        SelectionSort selection = new SelectionSort();
//        selection.sort(Array);

        Merge merge = new Merge();
        System.out.println("Merge Sort: "+ Arrays.toString(merge.sort(Array)));

        for(int i : Array) {
            System.out.print(i);
        }

    }
}