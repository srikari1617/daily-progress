class Solution {
    public int countCommas(int n) {
        int result =0;
        for(int a=1;a<=n;++a){
            if(a>999){
                result+=1;
            }
        }
        return result;
    }
}