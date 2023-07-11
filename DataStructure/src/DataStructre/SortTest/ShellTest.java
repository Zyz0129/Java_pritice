package DataStructre.SortTest;

import DataStructre.Sort.Shell;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        String []arr={"jsdbj","ksjvkjv","ksdvb","rtjrj","umyum","mnbm","wewe","hgngh","svsd","fgngn"};
        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
