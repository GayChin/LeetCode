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
