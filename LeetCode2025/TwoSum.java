/*import java.util.*;
public class TwoSum {
  public static int[] twoSum(int []nums,int target) {
	  Arrays.sort(nums);
	  int start=0;
	  int end=nums.length-1;
	  while(start<end){
          int sum=nums[start]+nums[end];
          if(sum==target){
              return new int[]{start,end};
          }
         else if(sum<target){
              start++;
          }
          else{
              end--;
          }
      }
    return new int[]{};
  }
  public static void main(String args[]) {
	  int nums[]= {2,7,11,15};
	  int target=8;
	  int []result =twoSum(nums,target);
	  System.out.println(Arrays.toString(result));
  }
}*/
import java.util.Arrays;
public class TwoSum{
    public static int []twoSum(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        Arrays.sort(nums);
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==target){
                return new int[]{start,end};
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int nums[]={11,7,8,19};
        int target=18;
        int result[]=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
        
    }
}