package leetCode;

import java.util.Arrays;

public class leetCodeTest {
	public static int threeSumClosest(int[] nums, int target) {
		int closestResult = nums[0] + nums[1] + nums[2];
		int i = 0, leftIndex = 0, rightIndex = 0;// i 循环次数 ，j 左边数字下标 ，k 右边数字下标
		int sum = nums[0] + nums[1] + nums[2];
		int difference = Math.abs(sum - target);
		int newDifference = difference;
		if (nums.length == 3 || closestResult == target)
			return closestResult;
		Arrays.sort(nums);
		for (; i < nums.length - 2; i++) {
			leftIndex = i + 1;
			rightIndex = nums.length - 1;
			while (leftIndex < rightIndex) {
				sum = nums[i] + nums[leftIndex] + nums[rightIndex];
				newDifference = Math.abs(sum - target);
				if (newDifference < difference) {
					difference = newDifference;
					closestResult = sum;
				}
				if (sum > target)
					rightIndex--;
				else
					leftIndex++;
				if (sum == target) {
					closestResult = sum;
					return closestResult;
				}
			}
		}
		return closestResult;
	}

	 public static int hammingDistance(int x, int y) {
	        int XOR=x^y;
	        int times=0,temp=0;
	        while(XOR!=0)
	        {
	        	temp=XOR%2;
	        	if(temp==1)
	        		times++;
	            XOR=XOR/2;  
	    }
	        return times;
	    }
	
	public static void main(String[] args) {
		System.out.println(hammingDistance(1,6));
	}
}
