package com.xworkz.aptitudeTest;

public class MajorityElement {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,3,3,3,3};
		MajorityElement.majority(nums);
		
		
	}
	public static int majority(int[] nums) {
        int mc = nums.length/2;

        
        for (int num : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }
           

            if (count > mc) {
            	System.out.println(num);
                return num;
            }

        }

        return 0;    
    }
     
	
	
}
