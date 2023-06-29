package app_java_important;

import java.util.Arrays;

public class ArraySubset {

	public static boolean isSubset(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                return false;
            }
        }
        return i == arr1.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4,6,7,3,5,2};
        boolean isSubset = isSubset(arr1, arr2);
        System.out.println(Arrays.toString(arr1) + " is " + (isSubset ? "" : "not ") + "a subset of " + Arrays.toString(arr2));
    }
}
