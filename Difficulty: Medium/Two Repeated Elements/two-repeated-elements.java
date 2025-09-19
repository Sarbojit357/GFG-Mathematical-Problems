class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> freq = new HashMap<>();
        int[] result = new int[2];
        int idx = 0;
        for(int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        
            if(freq.get(num) == 2){
                result[idx++] = num;
      
            if(idx == 2)
                break;
            }
        }
         return result;
    }
}