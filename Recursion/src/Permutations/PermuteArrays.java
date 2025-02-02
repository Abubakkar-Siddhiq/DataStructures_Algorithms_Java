package Permutations;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PermuteArrays {
    public PermuteArrays() {}

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }

    private void backtrack(int[] nums, int level, List<List<Integer>> result) {
        if(level == nums.length-1) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }

        for(int i=level; i<nums.length; i++) {
            swap(nums, level, i);
            backtrack(nums, level+1, result);
            swap(nums, level, i);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args) {
        PermuteArrays perm = new PermuteArrays();
        System.out.println(perm.permute(new int[]{1, 2, 3}));
    }
}
