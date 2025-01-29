public class SelectionSort {

    public SelectionSort(){}

    public void sort(int[] array) {
        // Iterating over the array
        for(int i=0; i < array.length-1; i++) {
            // First element to be the min
            int min = i;
            // Iterating after first element
            for(int j = i+1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }
}
