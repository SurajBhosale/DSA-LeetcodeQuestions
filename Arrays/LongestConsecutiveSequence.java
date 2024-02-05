package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    // Brute Force - O(N^2))
    // public static boolean linearSearch(int[] arr, int num) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] == num) {
    // return true;
    // }
    // }
    // return false;
    // }

    // public static int longestConsecutive(int[] nums) {
    // int n = nums.length;
    // int longest = 1;
    // for (int i = 0; i < n; i++) {
    // int count = 1;
    // int curr = nums[i];
    // while (linearSearch(nums, curr + 1)) {
    // curr = curr + 1;
    // count += 1;
    // }
    // longest = Math.max(longest, count);
    // }
    // return longest;
    // }

    ----------------------------------------------------------------------------------------------

    // Better Approach - O(nlongn)
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;
        int cnt = 0;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastSmaller) {
                cnt += 1;
                lastSmaller = nums[i];
            } else if (lastSmaller != nums[i]) {
                cnt = 1;
                lastSmaller = nums[i];
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    ----------------------------------------------------------------------------------------------------

    // Optimal Solution - O(2n)
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int longest = 1;

        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        for(int it : set){
            if(!set.contains(it-1)){
                int x = it;
                int cnt = 1;

                while(set.contains(x+1)){
                    x = x+1;
                    cnt+=1;
                }

                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
}
