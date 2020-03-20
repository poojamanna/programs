package org;

public class Calculator {
	public static int findMax(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	public static int cube(int n) {
		return n*n*n;
	}
	public static int square(int p) 
	{
		return p*p;
	}

}
