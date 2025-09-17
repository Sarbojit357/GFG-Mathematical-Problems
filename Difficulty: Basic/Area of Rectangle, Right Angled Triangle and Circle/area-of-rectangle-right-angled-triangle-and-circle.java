// User function Template for Java

class Solution {
    static int[] getAreas(int L, int W, int B, int H, int R) {
        // code here
        int AreaRect = L * W;
        int AreaTriangle = (int)(0.5*B*H);
        int AreaCircle = (int)(3.14 *R*R);
        return new int[] {AreaRect,AreaTriangle,AreaCircle};
    }
};