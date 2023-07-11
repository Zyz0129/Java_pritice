package DataStructre.SortTest;

import DataStructre.Sort.Quick;

import java.util.Arrays;

public class QuickTest {
    public static void main(String[] args) {
        Integer []arr={9,3,5,7,1,2,4,6,8,0};
        Quick.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
