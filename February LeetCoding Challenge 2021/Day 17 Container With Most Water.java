//two pointer solution
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1; 
    
        int max = 0; 
        
        while(right > left){
            
            max = Math.max(max , (right - left)* Math.min(height[left], height [right]));
            
            // Move the pointer that currently has less height to obtain bigger area
            
            if(height[left] > height [right]){
                right--;
            }else {
                
                   left++;   
            }
            
        }
        return max;
    }
}
