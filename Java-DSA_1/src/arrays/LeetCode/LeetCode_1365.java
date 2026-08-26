package arrays.LeetCode;

public class LeetCode_1365 {

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        LeetCode_1365 obj = new LeetCode_1365();

        int[] result = obj.smallerNumbersThanCurrent(nums);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = new int[101];
        int n = nums.length;

        for (int num : nums) {
            count[num]++;
        }

        int[] smallerCount = new int[101];
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            smallerCount[i] = sum;
            sum += count[i];
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = smallerCount[nums[i]];
        }

        return result;
    }
}