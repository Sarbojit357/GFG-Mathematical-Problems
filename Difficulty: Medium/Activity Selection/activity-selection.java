class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        List<int[]> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new int[]{i, start[i], finish[i]});
        }
        
        activities.sort(Comparator.comparingInt(a -> a[2]));
        int count = 1;
        int lastFinishTime = activities.get(0)[2];

        for (int i = 1; i < n; i++) {
            if (activities.get(i)[1] > lastFinishTime) {
                count++;
                lastFinishTime = activities.get(i)[2];
            }
        }
        return count;
    }
}
