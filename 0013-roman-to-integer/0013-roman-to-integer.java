class Solution {
    public int romanToInt(String s) {
        int len=s.length();
        int sum=0;
        HashMap<Character, Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        for(int i=0;i<len-1;i++){
            if(hm.get(s.charAt(i))>=hm.get(s.charAt(i+1))){
                sum+=hm.get(s.charAt(i));
            }
            else{
                sum-=hm.get(s.charAt(i));
            }
        }
        sum+=hm.get(s.charAt(len-1));
        return sum;
    }
}