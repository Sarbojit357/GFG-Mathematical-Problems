class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> seen = new HashSet<Integer>();
        HashSet<Integer> duplicates = new HashSet<Integer>();
        
        for(int i =0; i<arr.length; i++){
            int num = arr[i];
            if(seen.contains(num)){
                duplicates.add(num);
            }
            else{
                seen.add(num);
            }
        }
        
        return new ArrayList<>(duplicates);
    }
}