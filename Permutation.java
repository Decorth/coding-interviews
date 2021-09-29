import java.util.Arrays;

public class Permutation {
    public boolean isPerm(String s, String w){
        char [] arr1 = s.toCharArray();
        char [] arr2 = w.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
