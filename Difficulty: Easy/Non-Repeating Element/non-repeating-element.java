// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num: arr){
            if(freq.get(num) == 1){
                return num;
            }
        }
        return 0;
    }
}
