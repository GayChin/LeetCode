class Solution {
    public boolean validMountainArray(int[] arr) {
       
        int n = arr.length;
        if(n < 3) return false;
        int front = 1; int back = n-2;
        while(front < n-1 && arr[front]> arr[front-1] ) front++;
        while( back >=0 && arr[back] > arr[back +1]) back--;
        
        back++;front--;
        if(front ==0 || back == n-1) return false;
        return front == back;
    }
}
