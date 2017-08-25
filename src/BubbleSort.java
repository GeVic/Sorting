

/**
 * @author veeki
 *
 */
public class BubbleSort {

	/**	
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr_sort = {5,7,1,3,4};
		int[] sorted_array = Bubble_sort(arr_sort);
		for(int i = 0; i < sorted_array.length; i++) {
			System.out.println(sorted_array[i]);
		}

	}
	
	// Bubble sorting function 
	static int[] Bubble_sort(int arr[]) {
		int len = arr.length;
		int temp = 0 ;
		for(int i = 0 ; i < len ; i++) {
			for(int j = 0 ; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1]; 
					arr[j+1] = temp;
				}
				
			}
			
		}
		return arr;
	}

}
