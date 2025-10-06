import java.util.HashSet;
class Solution {
    static int removeDuplicates(int[] nums) {
       HashSet<Integer> set =new HashSet<> ();
       for(int i=0;i< nums.length;i++)
       {
        set.add(nums[i]);
       }
       int k=set.size();
       int j=0;
       for(int num:set)
       {
        nums[j++]=num;
       }

        return k;
    }
    public static void main(String args[])
    {
        int nums[]={1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}