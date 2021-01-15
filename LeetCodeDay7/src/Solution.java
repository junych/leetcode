public class Solution {

	public static void main(String[] args) {
		String[] input  = {"ab", "a"};
		
		System.out.println(longestCommonPrefix(input));
	}
	
    public static String longestCommonPrefix(String[] strs) {
    	
    	int strNums = strs.length;
    	if(strNums < 1) return "";
    	if(strNums == 1) return strs[0].toString();
    	
    	int strLength = strs[0].length();
    	for(int i = 0 ; i < strNums ; i ++) {
    		strLength = Math.min(strLength, strs[i].length());
    	}
    	
    	int lineIdx = 0;
    	int charIdx = 0;

    	StringBuilder sb = new StringBuilder("");
    	char temp = ' ';
    	
    	while(lineIdx < strNums && charIdx < strLength) {
    		
    		if(lineIdx == 0) {
    			temp = strs[lineIdx].charAt(charIdx);
    			lineIdx ++;
    		} else {
    			
    			if(temp == strs[lineIdx].charAt(charIdx)) {
    				
    				if(lineIdx == strNums-1) {
    					sb.append(temp);
    					lineIdx = 0 ;
    					charIdx++;
    				} else {
    					lineIdx ++;
    				}
    				
    			} else {
    				return sb.toString();
    			}
    		}
    	}
    	
    	return sb.toString();
    	
    }

}
