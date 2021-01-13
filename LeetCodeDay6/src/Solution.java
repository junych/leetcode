
public class Solution {
	public static void main(String[] args) {
		
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		
		int result = 0;
		for(int i = 0 ; i < s.length() ; i ++) {
			if(s.charAt(i) == 'I') result += 1;
				
			if(s.charAt(i) == 'V') {
				if(i > 0 && s.charAt(i-1) == 'I') {
					result += 3;
				} else {
					result += 5;
				}
			}
			
			if(s.charAt(i) == 'X') {
				if(i > 0 && s.charAt(i-1) == 'I') {
					result += 8;
				} else {
					result += 10;
				}
			}
			
			if(s.charAt(i) == 'L') {
				if(i > 0 && s.charAt(i-1) == 'X') {
					result += 30;
				} else {
					result += 50;
				}
			}
			
			if(s.charAt(i) == 'C') {
				if(i > 0 && s.charAt(i-1) == 'X') {
					result += 80;
				} else {
					result += 100;
				}
			}
			
			if(s.charAt(i) == 'D') {
				if(i > 0 && s.charAt(i-1) == 'C') {
					result += 300;
				} else {
					result += 500;
				}
			}
			
			if(s.charAt(i) == 'M') {
				if(i > 0 && s.charAt(i-1) == 'C') {
					result += 800;
				} else {
					result += 1000;
				}
			}
		}
		
		return result;
    }
}
