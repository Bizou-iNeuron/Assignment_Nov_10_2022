
public class SelectionSort 
{// Sort by selecting the smallest number of the array and swapping it with the first value, then second ...
	// use of enhanced for loop, for loop, nested for loop, relational operators, assignment operator
	public static void main(String[] args) 
	{
		System.out.println("Original array");
		int [] a = {32,54,13,4,56,42,2,12,5, 23};
		print (a);
		System.out.println();
		
		for (int i = 0 ; i < a.length; i++) 
		{
			int minVal = a[i]; // starting the minimum value with first value of array
			int minValIndex = i; // getting the index of the minimum value
			for (int j =i+1; j< a.length; j++) // j < 6 j = i+1 = 2
			{
				if ( a[j] < minVal) // if next number is smaller than minimum value
				{
					minVal=a[j]; // set the next number as minvalue
					minValIndex= j; // get the index of the new minimum value
				}
			}
			
			// swap minVal with the value at index i
			int temp = a[i]; // get the value of i index
			a[i]=minVal; // set the minimum value for i index
			a[minValIndex] = temp; // set the value of i index for the index of old minim value
			
		}
		System.out.println();
		System.out.println("Sorted array");
		print (a);

	}
	
	private static void print (int [] array)
	{
		for (int go : array)
		{
			System.out.print(go + " ");
		}
	}

}
//By IzzyNotEZ @Bizou972