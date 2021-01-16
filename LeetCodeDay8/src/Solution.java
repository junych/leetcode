
public class Solution {

	public static void main(String[] args) {
		System.out.println(isValid("(){}}{"));
	}

    public static boolean isValid(String s) {
    	
    	int length = s.length();
    	String stack = "";
    	
    	for(int i =0 ; i < length ; i ++) {
    		
    		if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
    			System.out.println("push :: "+ s.charAt(i));
    			stack = s.charAt(i) + stack;
    			
    		} else {
    			
    			if(stack.length() == 0) {
    				return false;
    			}
    			
    			System.out.println("pop :: "+ stack.charAt(stack.length()-1));
    			char pop = stack.charAt(0);
    			stack = stack.substring(1);
    			
    			if(pop == '(' && s.charAt(i) == ')') {
    				continue;
    			} else if(pop == '{' && s.charAt(i) == '}') {
    				continue;
    			} else if(pop == '[' && s.charAt(i) == ']') {
    				continue;
    			} else {
    				return false;
    			}
    			
    		}
    	}
    	
    	return stack.length() == 0 ? true : false;
    }
}
