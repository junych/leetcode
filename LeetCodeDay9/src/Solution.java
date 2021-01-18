
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
    	ListNode result;
    	ListNode curr = new ListNode(0);
    	
    	result = curr;
    	
    	while(l1 != null || l2 != null) {
    		
    		ListNode temp = new ListNode();
    		
    		int l1Val = l1 != null ? l1.val : 999;
    		int l2Val = l2 != null ? l2.val : 999;
    		
    		if(l1Val > l2Val) {
    			temp.val = l2Val;
    			curr.next = temp;
    			curr = curr.next;
    			l2 = l2.next;
    			
    		} else {
    			temp.val = l1Val;
    			curr.next = temp;
    			curr = curr.next;
    			l1 = l1.next;
    		}
    	}
    	
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
