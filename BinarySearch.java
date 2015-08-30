/**
 * Created by lisy on 2015/3/24.
 */
public class BinarySearch {
	public static void main(String[] args){
		BinarySearch lc = new BinarySearch();
		int[] arr = {1,1,1,3,3,3,3,3};
		int x = 4;
		int r = lc.Solution(arr, x);
		System.out.println(r);
	}

	public int Solution(int[] arr, int value) {
		int left = 0;
		int right = arr.length - 1;

		int mid = 0;
		while (left <= right) {
			mid = left + ((right - left) >> 1);
			if (arr[mid] > value) {

				right = mid - 1;
			}
			else if (arr[mid] < value) {
				left = mid + 1;
			}
			else {
				right = mid;
			}

			if (arr[left] == arr[right]) {
				if (arr[left] == value) {
					return left;
				}
				else {
					return -1;
				}
			}
		}
		return -1;

	}

}