
public class Solution {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(""));
	}
	
    public static int lengthOfLongestSubstring(String s) {
        
    	StringBuilder subStr;
    	int maxLength = 0;
    	
    	for(int i = 0 ; i < s.length() ; i ++) {
    		
    		subStr = new StringBuilder();
    		
    		for(int j = i ; j < s.length() ; j++) {
    			
    			if(subStr.indexOf(s.charAt(j)+"") > -1) {
    				break;
    			} else {
    				subStr.append(s.charAt(j));
    				maxLength = subStr.length() > maxLength ? subStr.length() : maxLength;
    			}
    		}
    	}
    	
    	return maxLength;
    	
    }

}
