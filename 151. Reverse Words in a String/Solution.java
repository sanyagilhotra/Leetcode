class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String res="";
        int p=s.lastIndexOf(" ");
        while(p!=-1)
        {
            res.trim();
            res=res+s.substring(p+1)+" ";
            s=s.substring(0,p);
            s=s.trim();
            System.out.println(s);
            p=s.lastIndexOf(" ");
        }
        res=res.trim()+" "+s;
        res=res.trim();
        return res;
    }
}