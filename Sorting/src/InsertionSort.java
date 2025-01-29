public class InsertionSort {

    public InsertionSort() {}

    public void sort(int[] arr) {
        // The first element (0) is considered to be sorted. So we start from second (1).
        for(int i=1; i < arr.length; i++) {
            int current = arr[i]; // First value is current value
            int prev = i-1;

            // Loops until the previous is greater than current
            while(prev >= 0 && arr[prev] > current) {
                // Then swaps it
                arr[prev+1] = arr[prev]; // Shifting it to the right.
                prev--;
            }
            arr[prev + 1] = current; // places current element in the right spot.
        }
    }
}