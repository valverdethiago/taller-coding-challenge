import java.util.*;

public class Program {
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        if (array == null || array.length <4 ) {
            return null;
        }
        List<Integer[]> result = new ArrayList<>();
        for (int a=0; a< array.length; a++) {
            for (int b=a+1; b< array.length; b++) {
                for (int c=b+1; c< array.length; c++) {
                    for (int d=c+1; d< array.length; d++) {
                        int sum = array[a] + array[b] + array[c] + array[d];
                        if (sum == targetSum)
                            result.add(new Integer[]{array[a], array[b], array[c], array[d]});
                    }
                }
            }

        }
        return result;
    }
}
