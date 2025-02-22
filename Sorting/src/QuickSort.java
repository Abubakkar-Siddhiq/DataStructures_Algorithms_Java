public class QuickSort {

    public QuickSort() {}

    public void sort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);
        sort(arr, start, pivot-1);
        sort(arr, pivot+1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;

        for(int j=i+1; j <= end-1; j++) {
            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, end);

        return i;
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
