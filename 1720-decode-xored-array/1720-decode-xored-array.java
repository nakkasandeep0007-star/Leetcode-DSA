class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int ar[]=new int[n+1];
        ar[0]=first;
        for(int i=1;i<=n;i++){
           ar[i]=ar[i-1] ^ encoded[i-1];
        }
        return ar;
    }
}