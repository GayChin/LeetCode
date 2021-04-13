/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    private Stack <NestedInteger> st;
    
    public NestedIterator(List<NestedInteger> nestedList) {
        st = new Stack <>();
        flattenList (nestedList);
    }

    @Override
    public Integer next() {
        return hasNext() ?st.pop().getInteger() : null;
    }

    @Override
    public boolean hasNext() {
        while(!st.isEmpty()){
            // if is integer return true
            if(st.peek().isInteger()) return true;
            //if is list then further flatten the list 
            flattenList(st.pop().getList());
        }
        return false;
    }
    
    private void flattenList(List <NestedInteger> list){
        for (int i = list.size()-1 ; i >=0 ; i-- ){
            //push the list from behind
            st.push(list.get(i));
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
