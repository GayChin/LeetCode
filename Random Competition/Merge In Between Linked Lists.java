public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        //find node before a 
        ListNode curr = list1;
        for ( int i = 1 ; i < a ; i ++){
            curr = curr.next;
        }
        
        //find node after b
        ListNode ltr = list1;
        for( int i = 0 ; i <= b ; i ++){
            ltr = ltr.next;
        }
        
        curr.next = list2;
        ListNode temp = list2;
        while (temp.next!= null){
            temp = temp.next;
        }
        temp.next = ltr;
        return list1;
    }
