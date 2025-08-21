// class Solution {
//     int missingNum(int arr[]) {
//         // code here
//         int n = arr.length+1;
//         int totalSum = n*(n+1)/2;
//         int arraySum = 0;
//         for(int i =0; i<arr.length; i++){
//             arraySum = arraySum + arr[i];
//         }
//         return totalSum - arraySum;
//     }
// }
// class Solution {
//     int missingNum(int arr[]) {
//         int n = arr.length + 1;  // because one number is missing
//         int totalSum = n * (n + 1) / 2;
//         int arraySum = 0;
        
//         for(int i = 0; i < arr.length; i++) {
//             arraySum += arr[i];
//         }
        
//         return totalSum - arraySum;
//     }
// }
class Solution {
    int missingNum(int[] arr) {
        long n = arr.length + 1L;          // full range is 1..n
        long total = n * (n + 1) / 2;      // compute in long
        long sum = 0;
        for (int v : arr) sum += v;        // accumulate in long
        return (int)(total - sum);
    }
}

