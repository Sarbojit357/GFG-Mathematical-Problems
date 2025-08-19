/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i =0; i<arr.length;i++){
            int rev = 0, num = arr[i];
            while(num>0){
                rev = rev *10 + num % 10;
                num /= 10;
            }
            if(!(arr[i] == rev)){
                return false;
            }
        }
        return true;
    }
}