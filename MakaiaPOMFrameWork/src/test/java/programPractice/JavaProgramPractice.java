package programPractice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class JavaProgramPractice {
	//to square the input array values and added them to the output array in assending order
	@Test
	public static void squareValues(){
		int[] arr1= {-6,-3,-2,1,4,5};
		int[] arr2= new int[arr1.length];
		int left=0,right=arr1.length-1;

		for (int i=arr1.length-1;i>=0;i--) {
			int abs=Math.abs(arr1[left]);
			if(abs>arr1[right]) {
				arr2[i]=arr1[left]*arr1[left];
				left++;
				//printing the squares 
				System.out.println(arr2[i]);
			}
			else {
				arr2[i]=arr1[right]*arr1[right];
				right--;
				//print the square
				System.out.println(arr2[i]);
			}
		}
		//printing the squares
		System.out.println(Arrays.toString(arr2));
	}
}

