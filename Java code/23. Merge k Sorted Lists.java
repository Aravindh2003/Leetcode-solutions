class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         if(lists==null) return null;
        if(lists.length==1) return lists[0];
        
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>((n1,n2)->n1.val-n2.val);
        
        for(int i=0;i<lists.length;i++)
          if(lists[i]!=null)  minHeap.add(lists[i]);
        
        ListNode head = new ListNode(0),curr;
        curr=head;
        
        while(!minHeap.isEmpty()){
            ListNode temp = minHeap.poll();
            curr.next = new ListNode(temp.val);
            curr=curr.next;
            if(temp.next!=null)
                minHeap.add(temp.next);
        }
        return head.next;  
    }
}
