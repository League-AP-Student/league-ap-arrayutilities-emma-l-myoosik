
public class NumberMatrix {
	private int[][] matrix;
	
	/** Constructs a number matrix. */ 
	public NumberMatrix(int[][] m) 
	{ matrix = m; }
	
	/**Shifts each matrix element to the next position in row-major order 
	 * and inserts the new number at the front. The last element in the last 
	 * row is discarded.
	 * @param num the new number to insert at the front of matrix
	 * Postcondition:The original elements of matrix have been shifted to 
	 * 				 the next higher position in row-major order, and
	 * 				 matrix[0][0] == num.
	 * 				 The original last element in the last row is discarded.
	 */	
	public void shiftMatrix(int num)
	{ /* to be implemented in part (b) */ 
		for (int row = 0; row < matrix.length; row++) {
			// not quite sure how this works
			int finalNum = matrix[row][matrix[0].length - 1];
			ArrayUtil.shiftArray(matrix[row], num);
			num = finalNum;
		}
		
	}
	
	public static void main(String[] args) {
		int arr [][] = null;
		arr = new int[2][2];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		for(int i = 0; i < arr.length; i++) {   
			for(int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		} 
		
		NumberMatrix tester = new NumberMatrix(arr);
		tester.rotateMatrix();
		
		for(int i = 0; i < arr.length; i++) {   
			for(int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
	/**Rotates each matrix element to the next higher position in row-major 
	 * order.
	 * Postcondition: The original elements of matrix have been shifted
	 * 				  to the next higher position in row-major order, and 
	 * 				  matrix[0][0] == the original last element.
	 */
	public void rotateMatrix()
	{ /* to be implemented in part (c) */ 
		shiftMatrix(matrix[matrix.length - 1][matrix[0].length - 1]);
	}
	
	// There may be instance variables, constructors, and methods that are not
	// shown.
	
	public int[][] getMatrix(){
		return matrix;
	}
}
