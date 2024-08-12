
import java.util.*;

public class lowerBound {

    public static int lower(int []arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,8,10,11,12,19};
        int n = 7, x = 5;
        int ind = lower(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
} 
