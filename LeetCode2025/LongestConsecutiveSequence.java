import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Insert all numbers into a HashSet
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) { 
            numSet.add(num);
        }
        int longest = 0;
        // Iterate through each number in the set
        for (int num : numSet) {
            // Check if it's the start of a new sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                // Count the length of the consecutive sequence starting from num
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                // Update the longest streak if needed
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
    	LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + solution.longestConsecutive(nums1));
        
    }
}

    