package sorting;
import java.util.*;
public class set_zero_two_one {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0};
        int n = arr.length;
        int ans = 0;
        int countone = 0;
        for (int nums : arr) {
            if (nums == 1) {
                countone++;
            }
        }
        if (countone == n) {
            ans = n;
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    int l = 0;
                    int r = 0;
                    for (int j = i - 1; j >= 0; j--) {
                        if (arr[j] == 1) {
                            l++;
                        } else {
                            break;
                        }
                    }
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] == 1) {
                            r++;
                        } else {
                            break;
                        }
                    }

                    ans = Math.max(ans, l + 1 + r);
                }
            }
        }
        System.out.println("Maximum consecutive 1s after setting a zero to one: " + ans);
    }
}

