package Searching;

public class MaximumWaterBetweenTwoBuildings {
	public static int maxWater(int height[], int n) 
	{ 
		int max = 0; 

		//using two pointers that point at first and last building respectively.
		int i = 0, j = n - 1; 

		while (i < j) 
		{ 
		    //if height at index i is less than height at index j, updating 
    		//maximum water stored so far and incrementing i.
			if (height[i] < height[j]) 
			{ 
				max = Math.max(max, (j - i - 1) * height[i]); 
				i++; 
			} 
			//else if height at index i is more than height at index j,  
    		//updating maximum water stored so far and decrementing j.
			else if (height[j] > height[i]) 
			{ 
				max = Math.max(max, (j - i - 1) * height[j]); 
				j--; 
			} 
			//else updating maximum water stored so far and both pointers.
			else
			{ 
				max = Math.max(max, (j - i - 1) * height[i]); 
				i++; 
				j--; 
			} 
		} 
        //returning the result.
		return max; 
	} 
	public static int maxWater2(int height[], int n) 
    { 
        int leftHeight = 0, rightHeight = n-1, max = 0;
        while (leftHeight < rightHeight) 
        {
        	int minheight=Math.min(height[leftHeight], height[rightHeight]);
        int total =minheight * (rightHeight-leftHeight-1); //r-l-1 is the distance between both the height 
        max = Math.max(max, total);
        if (height[leftHeight] <= height[rightHeight]) 
        	{
        	leftHeight++;
        	}
        else 
        {
        	rightHeight--;
        }
        }
            return max;
    } 

}
