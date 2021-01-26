class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        HashMap<Integer, List<Integer>> indicesOfValue = new HashMap<>();
        for (int i = 0; i < n; i++){
            indicesOfValue.computeIfAbsent(arr[i], x -> new LinkedList<>()).add(i); // to repeating value with different index on the same linkedlist
        }
        boolean[] visited = new boolean[n]; visited[0] = true;        
        Queue<Integer> q = new LinkedList<>(); q.offer(0); //start from index 0 
        int step = 0; 
        while (!q.isEmpty()) {
            for (int size = q.size(); size > 0; --size) {
                int i = q.poll(); 
                if (i == n - 1) return step; // Reached to last index so = answer
                List<Integer> next = indicesOfValue.get(arr[i]); // get the linkedlist by referring to the key
                next.add(i - 1); next.add(i + 1);       // to check if the last index is nearer before or after the current index
                for (int j : next) {          
                    if (j >= 0 && j < n && !visited[j]) {
                        visited[j] = true;
                        q.offer(j);                     // next round will be the +1,or -1 or different index of the same value.
                    }
                }
                next.clear(); // avoid later lookup indicesOfValue arr[i]
            }
            step++;
        }
        return 0;
    }
}
