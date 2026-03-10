package JavaPraciceDemo;

public class reverseArrayusing2Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[10];
		arr[0] = 25;
		arr[1] = 32;
		arr[2] = 3;
		arr[3] = 45;
		arr[4] = 100;
		arr[5] = 10;
		arr[6] = 90;
		arr[7] = 75;
		arr[8] = 96;
		arr[9] = 300;
		int i;
        
		
		System.out.println("Orignal Array is :");
		for (i = 0; i < arr.length - 1; i++) {

			System.out.print(arr[i] + " ");
		}

		int left = 0;
		int right = arr.length - 1;
		int temp;

		while (left < right) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;

		}
		
		System.out.println();
		System.out.println("Reversed Array is :");

		for (i = 0; i < arr.length - 1; i++) {

			System.out.print(arr[i] + " ");
		}

	}

}
