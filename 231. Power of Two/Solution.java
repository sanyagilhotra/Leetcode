class Solution {
    public boolean isPowerOfTwo(int n) {
        String s=Integer.toBinaryString(n);
        if(s.indexOf("1")==s.lastIndexOf("1")&&n>0)
        return true;
        return false;       
    }
}