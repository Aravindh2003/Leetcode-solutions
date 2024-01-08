class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(head.next == null){
            return head;
        }
        int size =0;
        ListNode temp = head;
        ListNode leftNode  = null;
        ListNode rightNode  = null;
        List<Integer> arr = new ArrayList<>();
        while(temp != null ){
            size++;
            if(size == left){
                leftNode = temp;
            }
            if(size >= left && size <= right){
                arr.add(temp.val);
            }
            if(size == right){
                rightNode= temp;
            }
            temp = temp.next;
        }
        int sizes = left;
        int arrSize = arr.size()-1;
        while(sizes <= right){
            leftNode.val = arr.get(arrSize--);
            leftNode = leftNode.next;
            sizes++;
        }
        return head;       
    }
}
