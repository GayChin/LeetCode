class Solution {
    public int nextGreaterElement(int n) {
        if(n<10)return -1;
        List<Integer> l=new ArrayList<>();
        
        
        while(n>0) {
            //get last number
           
        	int temp=n%10;
            // add first number or if temp bigger than last element, means no switching required
        	if(l.size()==0||l.get(l.size()-1)<=temp) {
        		l.add(temp);
        	}else {
                int j=0;
                System.out.println(l.size());
                for(j=0;j<l.size();j++) {
                    System.out.println("inside " + j);
                    //switching is required when temp is bigger than some of the element in the list
                    if(l.get(l.size()-1-j)<=temp) {                     
                        break; //break is not considered as completion.
                    }
                }
                // j = l.size if temp is not bigger than anything
                int index=l.size()-j;
                //replace the element the right side element of the smaller element
                int replace=l.remove(index);
                l.add(index,temp);
                long result=n;
                //divide by 10 and multiply by 10 to remove current temp in the n
                result=n/10*10+replace;
                while(!l.isEmpty()) {
                    result=result*10+l.remove(0);
                }
                if(result>Integer.MAX_VALUE)return -1;
                
                return (int)result;
        	}
        	
        	n/=10;
        }
        return -1;
    }
}
