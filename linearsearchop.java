import java.util.*;
public class linearsearchop {
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 4;
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("Element is not present in the array.");
        } else {
            System.out.println("Element is at the index " + index);
        }
    }
}