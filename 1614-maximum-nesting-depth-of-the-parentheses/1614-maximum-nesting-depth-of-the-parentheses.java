class Solution {
    public int maxDepth(String s) {
        char ch[]=s.toCharArray();
        int len=s.length();
        int cnt=0;
        int max=0;
        for(int i=0;i<len;i++){
            if(ch[i]=='(') {
                cnt++;
                max=Math.max(cnt,max);
            }
            if(ch[i]==')') cnt--;
        }
        return max;
    }
}