public class Main {
    // Selection Sort
    public static void selectionSort(int[] array) {
        // Iterating over the array
        for(int i=0; i < array.length-1; i++) {
            // First element to be the min
            int min = i;
            // Iterating after first element
            for(int j = i+1; j < array.length-1; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {
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

    public static void main(String[] args) {

        int[] selectionSortArray = {3, 4, 1, 5, 9, 2, 0};

        insertionSort(selectionSortArray);

        for(int i : selectionSortArray) {
            System.out.print(i);
        }

    }
}