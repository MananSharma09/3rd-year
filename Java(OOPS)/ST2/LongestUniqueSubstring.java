import java.util.Scanner;

public class LongestUniqueSubstring {
    private static int longestUnique(String s) {
        int n = s.length();
        int res = 0;

        for (int i = 0; i < n; i++) 
        {
            boolean[] visited = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)]) 
                {
                    break;
                } 
                else 
                {
                    res = Math.max(res, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
        }
        return res;
    }

    //Do not edit this part of code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(longestUnique(s));
        scanner.close();
    }
}