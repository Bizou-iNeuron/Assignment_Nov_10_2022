public class DuplicatePresentInArray 
{ // find if array has duplicate values
	// use of : Array, array.length, while, for, switch case default, break, == operator, increment, decrement, independent variable, 3 loops nested
	public static void main(String[] args) {
		int[] a = { 2, 2, 4, 3, 0, 0, 3, 8, 2, 5, 2, 0 };
		System.out.println("array: ");
		for (int x : a)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println();
		
		
		for (int i = 0; i < a.length; i++) // index of number checked
		{
			switch (i) {
			case 0: // if index 0, compare to the next numbers right away
				int count0 = 1; // because all numbers appear at least one time
				for (int j = i + 1; j < a.length; j++) // getting the numbers post checked number
				{
					if (a[i] == a[j]) // if the number checked equals another number in the array then increment the
										// count
					{
						count0++;
					}
				}
				if (count0 > 1) // if count is at least 2, then the checked number has duplicates
				{
					System.out.print(a[i] + " has duplicates, ");
				}
				System.out.println(a[i] + " has been found " + count0 + " times"); // return how many times all the
																					// checked numbers have been found
				System.out.println();
				break;
			default: // if the checked number is not the first index
				int count = 1;
				for (int k = i - 1; k >= 0; k--) // first verify if the checked number hasn't been already checked by
													// comparing with previous numbers
				{
					if (a[i] == a[k]) // if already checked, then come out of the k loop and increment i to check the
										// next number
					{
						// System.out.println(a[i]+" already checked");
						break;
					} else if (k == 0) // else continue comparing the checked number to all previous numbers until the
										// first one
					{
						// System.out.println("number "+a[i]+" at index "+i+" hasn't been checked yet");
						for (int j = i + 1; j < a.length; j++) // if checked number hasn't been checked yet, compare it
																// to all numbers after it
						{
							if (a[i] == a[j]) // if the number checked equals another number in the array then increment
												// the count
							{
								count++;
							}
						}
						if (count > 1) // if count is at least 2, then the checked number has duplicates
						{
							System.out.print(a[i] + " has duplicates, ");
						}
						System.out.println(a[i] + " has been found " + count + " times");
						System.out.println();
					}
				}
			}
		}
	}
}
// By IzzyNotEZ @Bizou972