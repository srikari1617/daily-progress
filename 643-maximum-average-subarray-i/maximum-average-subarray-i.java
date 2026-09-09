class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double maxSum = -Double.MAX_VALUE;   
        double sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);  
                sum -= nums[left];
                left++;
            }
        }
        return maxSum / k;
    }
}