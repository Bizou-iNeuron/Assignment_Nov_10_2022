public class MergeSort 
{  // Sorting by dividing the array in halves until array of 1 location then sort and merge the small arrays back together
	// use of relational operator, assignment operator, new object creation, for loop, filling sub array with original array's value, recursives method until return, while loop, nested while loops, incrementation
	public static void main(String args[])  
	{  
		System.out.println("Original array");
		
		int[] a = {32,6,1,2,54,97,2,434,3};
		print(a);
		
		splitHalves(a);
		
		System.out.println();
		System.out.println("Merge sorted array ");
		print(a);
		
	}

	private static void splitHalves(int[] a) {
		int aLength = a.length; 
		
		if (aLength < 2) return; // if the subarrays have only 1 location then stop calling the method
		
		int midIndex = aLength /2; 
		
		int [] leftArray = new int [midIndex]; // creation of sub left array 
		int [] rightArray = new int [aLength-midIndex]; // creation of sub right array 
		
		for (int i =0 ; i< midIndex;i++) 
		{
			leftArray [i] = a[i]; // filling the left array with the values of the leftSize of main array
		}
		
		for (int i= midIndex; i<aLength ; i++)
		{
			rightArray [i - midIndex] = a [i]; // filling the right array with the values of the rightSize of main array
		}
		
		//print(leftArray);
		//print (rightArray);
		
		splitHalves(leftArray); // call the splitHalves(); method recursively on all left subarrays until creation of array of 1 location
		splitHalves(rightArray); // call the splitHalves(); method recursively on all right subarrays until creation of array of 1 location
		
		merge (a, leftArray, rightArray); // start merging the subarrays from the arrays with 1 location on the left
		
	} 
	
	public static void merge (int [] a , int [] leftArray, int [] rightArray) // calling recursively the merge method to merge all the small arrays into a big sorted one
	{
		int leftSize = leftArray.length; // get the size of the sub left arrays
		int rightSize = rightArray.length; // get the size of the sub right arrays
		
		int i = 0 ; // index for the left array
		int j = 0 ; // index for the right array
		int k = 0 ; // index for the merged array
		
		while (i < leftSize && j < rightSize) // iterate as long as there is locations in the left array and right arrays to be compared
		{
			if ( leftArray[i] <= rightArray[j]) // as the sub arrays are already sorted, compare the first number of left with first of right, if smaller or equal
			{
				a[k]= leftArray[i]; // put the left number inside the first location of the final array and then second and so on
				i++;
			}
			else 
			{
				a[k]= rightArray[j]; // if not put the right location inside the final array
				j++;
			}
			k++; // keep on filling the final array's location as the while loop goes
		}
		
		while (i < leftSize) // if there is unchecked locations in the left arrays add them to the final array
		{
			a[k] = leftArray [i];
			i++;
			k++;
		}
		
		while (j < rightSize) // if there is unchecked locations in the right arrays add them to the final array
		{
			a[k] = rightArray [j];
			j++;
			k++;
		}
		
		//print (a);
	}
	
	private static void print (int [] array) // print(); method
	{
		for (int a : array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
	}
}  // By IzzyNotEZ @Bizou972