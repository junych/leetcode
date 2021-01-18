public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(input));
		
		for (int i = 0; i < input.length; i++) {
		    System.out.println(input[i]);
		}
		
	}

    public static int removeDuplicates(int[] nums) {
        
    	int size = 1;
    	int curr = 0;
    	while(curr < nums.length-1) {
    		if(nums[curr] == nums[curr+1] 
    				&& nums[curr] != nums[nums.length-1]) {
    			
    			for(int i = 0 ; i < nums.length - curr - 1 ; i ++) {
    				nums[curr+i] = nums[curr+i+1];
    			}
    		} else if (nums[curr] != nums[nums.length-1]){
    			size++;
    			curr++;
    		} else {
    			curr++;
    		}
    		
    	}
    	
    	return size;
    }
}
