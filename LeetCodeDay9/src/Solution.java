
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
    	ListNode result;
    	ListNode curr = new ListNode(0);
    	
    	result = curr;
    	
    	do {
    		ListNode temp = new ListNode();
    		
    		if(l1.val > l2.val) {
    			temp.val = l2.val;
    			curr.next = temp;
    			curr = curr.next;
    			l2 = l2.next;
    			
    		} else {
    			temp.val = l1.val;
    			curr.next = temp;
    			curr = curr.next;
    			l1 = l1.next;
    		}
    	} while(l1.next != null || l2.next != null);
    	
    	return result.next;
    }
    
    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
