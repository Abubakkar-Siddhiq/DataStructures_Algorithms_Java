import java.util.Arrays;

public class Merge {
    public Merge(){}

    public int[] sort(int[] arr) {
        if(arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
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
}
