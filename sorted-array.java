import java.util.ArrayList;
import java.util.List;

public class CommonElementsFinder {

    public List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        List<Integer> common = new ArrayList<>();

        int i = 0, j = 0;
        Integer lastAdded = null;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (lastAdded == null || arr1[i] != lastAdded) {
                    common.add(arr1[i]);
                    lastAdded = arr1[i];
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return common;
    }

    public static void main(String[] args) {
        CommonElementsFinder finder = new CommonElementsFinder();
        
        int[] array1 = {1, 2, 2, 3, 4, 5, 6};
        int[] array2 = {2, 2, 3, 5, 7};

        List<Integer> result = finder.findCommonElements(array1, array2);

        System.out.println("Common elements without duplicates: " + result);
    }
}

