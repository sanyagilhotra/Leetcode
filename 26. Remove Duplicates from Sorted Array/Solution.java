class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int a[]=new int[nums.length];
        a[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(a[k]==nums[i])
            continue;
            else
            a[k+1]=nums[i];
            k++;
        }
        for(int i=0;i<=k;i++)
        {
            nums[i]=a[i];
        }
        return k+1;
    }
}
