
public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4 };
		int len = arr.length;
		int i, j;
		System.out.print("The given array is: ");
		for (i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("Array after removing duplicate elements: ");
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = arr[len - 1];
					len--;
					j--;
				}
			}
		}
		for (i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}