
public class SubArrayPresent {
// search of existing continuous arrays within another array
	// use of enhanced for loop, temporary boolean, for loop, short circuit operator, break, relational operators, assignment operator
	public static void main(String[] args) {
		System.out.println("array a");
		int [] a = {32,54,13,4,56,42,2,12,5, 23};
		print (a);	
		
		System.out.println("array b");
		int [] b = {13,4,56,42};
		print (b);
		 
		int m = 0; // index of array b
		boolean found = false;
		
		for (int n =0; n< a.length ; n++) // index of array a
		{
			if(b[m] == a[n] && m < b.length ) // check for all locations of b
			{
				if (m== b.length-1) // when all locations of b have been checked and are equal in a recursive manner to locations of a
				{
					System.out.println("b IS a sub array of a");
					found = true;
					break;
				}
				m++;
			}
		}
		if (found == false)
			System.out.println("b IS NOT a sub array of a");
	}
	
	private static void print (int [] array)
	{
		for (int go : array)
		{
			System.out.print(go + " ");
		}
		System.out.println();
		System.out.println();
	}

}
//By IzzyNotEZ @Bizou972