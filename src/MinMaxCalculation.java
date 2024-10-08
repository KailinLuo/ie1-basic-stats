import java.util.*;

public class MinMaxCalculation{
    static int findMin(int[] intArr){
        int sorted[] = intArr;
        Arrays.sort(sorted);
        return sorted[0];
    }

    static int findMax(int[] intArr){
        int sorted[] = intArr;
        Arrays.sort(sorted);
        return sorted[sorted.length-1];
    }
}