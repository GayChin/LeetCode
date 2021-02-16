// DFS
class Solution {
    public boolean isBipartite(int[][] graph) {
      int n = graph.length;
      // store the color of each node
      int colors[] = new int [n];
      // check each node 
      for (int i = 0; i < n ; i++ ) {
        if( colors[i] == 0 && !validColor(graph, colors, 1 , i)){
            return false;
          
        }
      }
      return true;
    }
    
    public boolean validColor(int[][] graph, int[] colors, int color, int node) {
      // check if colour of current node same as the desired color or not.
      // if not return false;
      if (colors[node]!= 0){
        return colors[node] == color;
      }
      // assign color to uncoloured node
      colors[node] = color;
      // check the connection of the current node and assign an opposite colour to them.
        for (int next : graph[node] ) {
          if(!validColor(graph, colors, -color , next)){
            return false;
          }
        }
        return true;
}
}

//BFS
class Solution {
    public boolean isBipartite(int[][] graph) {
        int len = graph.length;
        int[] colors = new int[len];
        
        for (int i = 0; i < len; i++) {
            if (colors[i] != 0) continue;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            colors[i] = 1;   // Blue: 1; Red: -1.
            
            while (!queue.isEmpty()) {
                int cur = queue.poll();
                for (int next : graph[cur]) {
                    if (colors[next] == 0) {          // If this node hasn't been colored;
                        colors[next] = -colors[cur];  // Color it with a different color;
                        queue.offer(next);
                    } else if (colors[next] != -colors[cur]) {   // If it is colored and its color is different, return false;
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}
