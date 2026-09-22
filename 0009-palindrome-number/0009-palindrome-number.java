class Solution {
    public boolean isPalindrome(int x) {
        int ar[]=new int[18];
        int i=0;
        boolean flag=false;
        if(x<0) return flag;
        if(x==0) return true;
        else{
            // if(x>0 && x<10) return true;
            while(x>0){
                int temp=x%10;
                ar[i]=temp;
                x/=10;
                i++;
            }
            int j=0;
            while(j<i){
                if(ar[j]==ar[i-1]){
                    flag=true;
                }
                else{
                    flag=false;
                    return flag;
                }
                j++;
                i--;
            }
        }
        return flag;
    }
}