//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
public class MinimumSizeSubarraySum {
    public int minimumSizeSubarraySum (int[]nums,int target) {
        int minlenWindow =Integer.MAX_VALUE;
        int currentSum=0;
        int low=0;//
        int high=0;
        while(high<nums.length) {
            currentSum=currentSum+nums[high];
            high++;
            while (currentSum >= target) {
                int currentWindowSize = high - low;
                minlenWindow = Math.min(minlenWindow, currentWindowSize);
                currentSum = currentSum - nums[low];
                low++;
            }
        }
        return minlenWindow == Integer.MAX_VALUE ? 0 : minlenWindow;
    }
        public static void main(String[] args) {
            int nums[]= {2,3,1,2,4,3};
            int target=7;
            MinimumSizeSubarraySum size=new MinimumSizeSubarraySum();
            int result=size.minimumSizeSubarraySum(nums,target);
            System.out.print(result);
    
        }
    
    }
    