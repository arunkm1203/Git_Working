package programPractice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class JavaProgramPractice {
	//to square the input array values and added them to the output array in assending order
	@Test
	public static void squareValues(){
		int[] arr1= {-8,-3,-2,1,4,6};
		int[] arr2= new int[arr1.length];
		int left=0,right=arr1.length-1;
		for (int i=arr1.length-1;i>=0;i--) {
			int abs=Math.abs(arr1[left]);
			if(abs>arr1[right]) {
				arr2[i]=arr1[left]*arr1[left];
				left++;
			}
			else {
				arr2[i]=arr1[right]*arr1[right];
				right--;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}

