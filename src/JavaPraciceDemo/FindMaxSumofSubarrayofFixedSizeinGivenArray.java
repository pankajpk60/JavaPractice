package JavaPraciceDemo;

public class FindMaxSumofSubarrayofFixedSizeinGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = 0;
        int windowSum = 0;

        // Step 1: Calculate first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i] - arr[i - k];
            System.out.println(windowSum);

            maxSum = Math.max(maxSum, windowSum);
        }

       //System.out.println(maxSum);
    }
		
		
	}

