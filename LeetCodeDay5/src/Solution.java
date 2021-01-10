public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {

		int cur = x;
		int pop = 0;
		int reverse = 0;
		
		while(cur>0) {
			pop = cur%10;
			reverse = reverse*10+pop;
			cur = cur/10;
		}
		System.out.println(reverse);
		return x == reverse ? true : false;
    }
}
