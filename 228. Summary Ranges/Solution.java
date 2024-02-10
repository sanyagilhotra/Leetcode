class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> out=new ArrayList<String>();
        if(nums.length==0)
        return out;
        int min=nums[0];
        int max=nums[0];
        int cur=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(cur+1==nums[i])
            {
                cur=nums[i];
                max=nums[i];
            }
            else
            {
                if(max==min)
                out.add(Integer.toString(max));
                else
                out.add(Integer.toString(min)+"->"+Integer.toString(max));
                max=nums[i];
                min=nums[i];
                cur=nums[i];
            }
        }
        if(max==min)
        out.add(Integer.toString(max));
        else
        out.add(Integer.toString(min)+"->"+Integer.toString(max));
        return out;
    }
}