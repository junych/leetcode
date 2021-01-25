public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("mississippi","issip"));
	}

    public static int strStr(String haystack, String needle) {
        
    	int baseLength = haystack.length();
    	int subLength = needle.length();
    	int result = -1;
    	
    	for(int i = 0 ; i < baseLength - subLength + 1 ; i ++) {
    		for(int j = 0 ; j < subLength ; j ++) {
    			if(haystack.charAt(i+j) != needle.charAt(j)) {
    				result = -1;
    				break;
    			} else {
    				if(result == -1) result = i+j; 
    			}
    		}
    		if(result != -1) return result;
    	}
    	return subLength > 0 ? result : 0;
    }
    
//    public static int strStr(String haystack, String needle) {
//        
//    	int length = needle.length();
//    	String temp = "";
//    	
//    	for(int i = 0 ; i < haystack.length()-length+1 ; i ++) {
//    		temp = haystack.substring(i,i+length);
//    		if(temp.equals(needle)) return i;
//    	}
//    	return needle.length() > 0 ? -1 : 0;
//    }
}
