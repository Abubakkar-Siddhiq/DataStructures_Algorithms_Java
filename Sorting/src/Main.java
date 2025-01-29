import java.util.Arrays;

public class Main {
    // Merge Sort
    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int l=0, r=0, m=0;

        while(l < left.length && r < right.length) {
            if(left[l] > right[r]) {
                mix[m++] = right[r++];
            } else {
                mix[m++] = left[l++];
            }
        }

        // What if left arr len is 5 and right is 2? 3 elements left behind? 😨
        while(l < left.length) {
            mix[m++] = left[l++];
        }

        while(r < right.length) {
            mix[m++] = right[r++];
        }

        return mix;
    }


    public static void main(String[] args) {

        int[] Array = {3, 4, 1, 5, 9, 2, 0};

        InsertionSort insertion = new InsertionSort();
        insertion.sort(Array);

        SelectionSort selection = new SelectionSort();
        selection.sort(Array);

        for(int i : Array) {
            System.out.print(i);
        }

    }
}