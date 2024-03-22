class Solution {
    public boolean isPalindrome(ListNode head) {
     if(head==null || head.next==null){
          return true;
      }
      List<Integer> li=new ArrayList<>();
      while(head!=null){
          li.add(head.val);
          head=head.next;
      }
      int first=0,last=li.size()-1;
      while(first<last){
        if(li.get(first)!=li.get(last)){
            return false;
        }
             first++;
             last--;
      }
      return true;
    }
}
