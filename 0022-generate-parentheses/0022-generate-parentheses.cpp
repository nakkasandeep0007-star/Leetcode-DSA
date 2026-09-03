class Solution {
public:
vector<string>v;
    vector<string> generateParenthesis(int n) {
        int open=0,close=0;
        string s="";
        solve(s,n,open,close);
        return v;
    }
    void solve(string s,int n,int o,int c){
        if(o+c==2*n){
            v.push_back(s);
        }
        if(o<n) solve(s+'(',n,o+1,c);
        if(c<o) solve(s+')',n,o,c+1);
    }
};