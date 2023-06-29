package app_java_important;

import java.util.ArrayList;
import java.util.List;

public class ArraySubsets {
	public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = findSubsets(nums);
        System.out.println(subsets);
    }
     public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generateSubsets(int[] nums, int index, 
    		List<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current)); // Add the current subset to the result

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]); // Include the current element in the subset
            generateSubsets(nums, i + 1, current, subsets); // Recursively generate subsets for the remaining elements
            current.remove(current.size() - 1); // Backtrack and remove the current element from the subset
        }
	}	
}
