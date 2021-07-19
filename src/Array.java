//import java.util.Arrays;
import java.util.Random;

/**
* This class creates the arrays based on user decided size
*
*/
public class Array {
	
	private int size;
	private int[] intArray;
	
	/**
	* This method creates random numbers
	* returns: random number
	*/
	public int fillArray() {
		
		int ub = size;
		return (new Random()).nextInt(ub); // Created a random number with an upper bound as large as the array we are trying to fill
		
	}
	/**
	* This method creates the Ascending array
	* Paramaters: user defined size
	* returns: the sorted array
	*/
	public int[] arrayAsc(int size) {
		this.size = size;
		intArray = new int[size];
		for (int i = 0; i< intArray.length;i++) {
			
			intArray[i] = i + 1; // fill the array by looping through and assigning a random number to each index of the array
		}
		return intArray;
	}
	/**
	* This method creates the Descending array
	* Paramaters: user defined size
	* returns: the sorted array
	*/
	public int[] arrayDes(int size) {
		this.size = size;
		intArray = new int[size];
		for (int i = 0; i< intArray.length;i++) {
			
			intArray[i] = intArray.length - i; // fill the array by looping through and assigning a random number to each index of the array
		}
		return intArray;
	}
	/**
	* This method creates the randomly sorted array
	* Paramaters: user defined size
	* returns: the sorted array
	*/
	public int[] arrayRan(int size) {
		this.size = size;
		intArray = new int[size];
		for (int i = 0; i< intArray.length;i++) {
			
			intArray[i] = fillArray(); // fill the array by looping through and assigning a random number to each index of the array
		}
		return intArray;
	}
	/**
	* Getter for the intArray
	*
	* returns: the sorted array
	*/
	public int[] getIntArray() {
		
		return intArray;
	}


}
