package DataStructre.SortTest;

import DataStructre.Sort.Merge;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Integer []arr={1,3,5,7,9,2,4,6,8,0};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
