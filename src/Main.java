//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().countOfPairs(new int[]{2,3,2}));
    }
    public int countOfPairs(int[] nums) {
        return  helper(nums, 0, 0, 50);
    }
    private int helper(int[] ar, int i, int last1, int last2){
        if(i>=ar.length){
            return 1;
        }
        int curNum = ar[i];
        int ways=0;
        if(last1>curNum)return 0;
        for (int k=last1;k<=50 && k<=curNum;k++){
            for (int l=last2;l>=0;l--){
                if((k+l)==curNum){
                    ways+=helper(ar, i+1, k, l);
                }
            }
        }
        return ways;

    }
}