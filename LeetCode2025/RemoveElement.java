//3,2,2,3,5
public class RemoveElement{
    public int removeElement(int []nums,int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }//adde
        }
        return count;
    }
    public static void main(String []args){
        RemoveElement remove=new RemoveElement();
        int nums[]={2,3,3,2};
        int val=3;
        int result=remove.removeElement(nums, val);
        for(int i=0;i<result;i++){
            System.out.print(nums[i]);
        }
    }
}