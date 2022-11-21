
public class QuickSort 
{
// Divide the array with a pivot, sort smaller number to left and bigger number to right of pivot
	// use of method overloading, while loop,  relational operators, assignment operator, recursive method calling, short circuit operator, incrementation, decrementation, temporary variable
	public static void main(String[] args) 
	{
		
		System.out.println("-----------------\nQuickSort with while loop");
		
		int [] array = {32,54,13,4,56,42,2,12,5, 23}; // 5,12,13,4,2,23,56,54,32,42
		
		printarray(array);// call printarray(); to print original array
		
		quickSortWhile(array); // call quickSortWhile(); with 1 argument: the array
		
		System.out.println("Sorted array:");
		printarray(array);// call printarray(); to print sorted array
		
	}
	
	
	private static void quickSortWhile(int [] array)
	{
		quickSortWhile(array, 0, array.length-1); // call quickSortWhile(); with 3 arguments: the array, the low index, the high index
	}
	
	private static void quickSortWhile (int [] array, int lowIndex , int highIndex) // method overaloading 
	{
		if (lowIndex >= highIndex) return; // if the subarrays are of 1 value then stop calling the method 
		
		int pivotHigh = array[highIndex]; // array[9] =23 the last number of array 
		
		int hc = subArrays(array, lowIndex, highIndex, pivotHigh);
		
		quickSortWhile (array, lowIndex , hc-1);// call quickSortWhile(); for the right subarray with 3 arguments, the array, the low index 0 and the index before the last high cursor
		quickSortWhile (array, hc+1, highIndex);// call quickSortWhile(); for the left subarray with 3 arguments, the array, the low index 0 and the index before the last high cursor
		
	}

	private static int subArrays(int[] array, int lowIndex, int highIndex, int pivotHigh) {
		int lc = lowIndex; // 0,1,2,3,5
		int hc = highIndex;// 9,8,7,6,5
		
		while (lc < hc) // 4<6
		{
			while (array[lc] <= pivotHigh && lc < hc) // array[5]=42 <= array[9]=23 && 4<6
			{
				lc++;
			}
			
			while (array[hc] >= pivotHigh && lc < hc) // array[5]=42 >= array[9]=23  && 5<5
			{
				hc--;
			}
			
			swapIndexValues(array, lc,hc);// call swapIndexValues(); with 3 arguments: the array, the lowcursor, the highcursor
		}
		
		swapIndexValues (array, hc, highIndex );// call swapIndexValues(); with 3 arguments: the array, the highcursor's new value, and the pivot
		return hc;
	}


	private static void swapIndexValues (int [] array, int ri, int li)
	{
		int temp = array[ri]; // store the value of right index value in a temporary variable 
		array[ri] = array[li]; // put li's value in place of ri's value
		array[li]= temp; // put temp in place of li's value
	}

	private static void printarray (int [] array)
	{
		for (int ori : array)
		{
			System.out.print(ori+" ");
		}
		System.out.println();
		System.out.println();
	}
}
//By IzzyNotEZ @Bizou972