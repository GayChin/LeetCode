class Solution {
	List<List<String>> list = new ArrayList<>();
	
	
	public List<List<String>> partition(String s){
		dfs( s, 0, new ArrayList<>());
		return list;
	}
	
	public void dfs (String s, int start,List<String> subAL){
		// first set basecase
		int n = s.length();
		if( start>= n) list.add(new ArrayList<> (subAL));
		// how to go thru every element? we always wanna add everyelement in the first round so end = start,then run recursively
		for( int end = start; end < n ; end++){
			//check palindrome or not
			if( isPalindrome(s,start,end)) {
				subAL.add(s.substring(start,end+1)); // if palindrome then add 
				dfs(s,end+1,subAL);		//end +1 so we can check the unchecked element 
				subAL.remove(subAL.size()-1); // to clear the element from the prev arraylist 
				
			}
			
		}
		
	}
	

	
	public boolean isPalindrome (String s , int start , int end){
		while( start <= end ){
		if(s.charAt(start) != s.charAt(end)) return false;
			start++;
			end--;
		}	
		return true;
	}
		
}
