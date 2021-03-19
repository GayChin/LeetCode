class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean [] seen = new boolean [rooms.size()];
        seen[0] = true;
        Stack <Integer> stack = new Stack();
        stack.push(0); // enter room 1
        
        while(!stack.isEmpty()){
            int key = stack.pop(); // get all the keys from room
            for(int nextRoom : rooms.get(key)){
                if(!seen[nextRoom]){ // if havent entered the room
                    seen[nextRoom] = true;
                    stack.push(nextRoom); //go to the room
                }
            }
        }
        for(boolean ans : seen){
            if(!ans) return false;
        }
         return true;
    }
}
