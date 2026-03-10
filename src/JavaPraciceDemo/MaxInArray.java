package JavaPraciceDemo;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];
		arr[0] = 34;
		arr[1] = 40;
		arr[2] = 3;
		arr[3] = 45;
		arr[4] = 100;

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];
		}

		System.out.println(max);

	}

}
