class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}    