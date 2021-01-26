class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        List<int[]> stack = new ArrayList<>(); // list of pair: [index, height]
        
        //Iterate through each height
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            
            // if latest height shorter than prev height then we calculate prev max Area
            // that means no possible max area already on the left hand side, but its start index
            // can remain because it contains the short height for example :
            // building A height = 2 , bulding B height =1 , height 2 contains height 1
            // the shortest length will remain till the end
            while (stack.size() > 0 && stack.get(stack.size() - 1)[1] > heights[i]) {
                int height = stack.get(stack.size() - 1)[1];
                int width = i - stack.get(stack.size() - 1)[0];  //essence
                System.out.println("Round " + i + " : " +height*width);
                maxArea = Math.max(maxArea, height * width);
                
                start = stack.get(stack.size() - 1)[0]; //prev width
                stack.remove(stack.size() - 1);         //remove
            }
            System.out.println("Round : " + i + " is " + start + " " + heights[i]);
            
            stack.add(new int[]{start, heights[i]});    //
        }
        
        //These heights were extended to the end of the histogram
        for (int i = 0; i < stack.size(); i++) {
            int height = stack.get(i)[1], start = stack.get(i)[0];
            int area = height * (heights.length - start);
            System.out.println("Round " + i + " : " +area);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
