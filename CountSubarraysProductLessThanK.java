public class CountSubarraysProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int product = 1;
        int result = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];

            while (product >= k && start <= end) {
                product /= nums[start];
                start++;
            }

            result += (end - start + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 5, 2, 6};
        int k1 = 100;
        System.out.println("Output: " + numSubarrayProductLessThanK(nums1, k1)); // Output: 8

        int[] nums2 = {1, 2, 3};
        int k2 = 0;
        System.out.println("Output: " + numSubarrayProductLessThanK(nums2, k2)); // Output: 0
    }
}
