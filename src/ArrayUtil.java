import java.util.ArrayList;

public class ArrayUtil {
	/** Shifts each array element to the next higher index, discarding the 
	 *  original last element, and inserts the new number at the front. 
	 *  @param arr the array to manipulate
	 * 		Precondition: arr.length > 0
	 *  @param num the new number to insert at the front of arr
	 * 		Postcondition: The original elements of arr have been shifted to 
	 * 				 	   the next higher index, and arr[0] == num. 
	 * 				  	   The original element at the highest index has been 
	 * 	  				   discarded.
	*/
	public static void shiftArray(int[] arr, int num) 
	{ /* to be implemented in part (a) */ 
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for (int value: arr) {
			arr2.add(value);
		}
		arr2.add(0, num);
		arr2.remove(arr2.size() - 1);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr2.get(i);
		}
	}
	
	public static void main(String[] args) {
		int arr [] = null;
		arr = new int[5];
		
		arr[0] = 11;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 14;
		arr[4] = 15;
		for(int i = 0; i < arr.length; i++) {   
		    System.out.println(arr[i]);
		}  
		
		shiftArray(arr, 9);
		for(int i = 0; i < arr.length; i++) {   
		    System.out.println(arr[i]);
		} 
	}
	// There may be methods that are not shown.
}
