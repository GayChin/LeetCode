class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int previousIndex = i - 1 >= 0 ? i - 1 : 0; //prevent out of bound
                int nextIndex = i + 1 < flowerbed.length ? i + 1 : flowerbed.length - 1; // prevent out of bound
                if (flowerbed[previousIndex] == 0 && flowerbed[nextIndex] == 0) {
                    n--;
                    if (n == 0) {
                        return true;
                    }
                    flowerbed[i] = 1;
                }
            }
        }
        return n <= 0; //or return false;
    }
    
}
