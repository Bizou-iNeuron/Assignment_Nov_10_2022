import java.util.*;

public class BubbleSorting 
{ 	// sorting by swapping numbers after comparison
	// Use of : for loop, temporary variable, relational operators, assignment operator, enhanced for loop, nested for loops, nested enhanced for loops, pre-incrementation
	public static void main(String[] args) 
	{
		// sort a 1D array
		System.out.println("SORT 1D ARRAY");
		int[] a = {24, 1, 6, 3, 34, 67, 87, 2, 3, 46, 96 };
		System.out.print("Original: ");
		print1Darray (a);
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i + 1; j < a.length; j++) { // or for (int j=1; j<a.length-i ; j++)if(a[j]<a[j-1]) swap a[j] * a[j-1]
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Sorted:   ");
		print1Darray (a);
		
		
		// -------------------- sort a 2D jagged array
		
		System.out.println();
		System.out.println();
		
		System.out.println("SORT 2D JAGGED ARRAY");
		int[][] aa = { {24, 1, 6, 3, 34},{ 67, 87, 2, 3, 46, 96} };
		System.out.print("Original: ");
		print2Darray(aa);
		
		for (int i=0;i<aa.length;i++)
		{
			for (int j=0;j<aa[i].length;j++)
			{
				for (int k=j+1;k<aa[i].length;k++)
				{
					if (aa[i][j]>aa[i][k])
					{
						int aatemp = aa[i][j];
						aa[i][j] = aa[i][k];
						aa[i][k] = aatemp;
					}
				}
			}
		}
		System.out.print("Sorted:   ");
		print2Darray(aa);
		
		
		System.out.println();
		
		// sort a 3D jagged array
		System.out.println("SORT 3D JAGGED ARRAY");
		int[][][] aaa = { {{3,2},{2,0,1}},{{4,5},{7,2,1},{4,3,1,2}} };
		System.out.print("Original: ");
		print3Darray(aaa);
		
		for (int i=0; i<aaa.length;i++)
		{
			for (int j=0;j<aaa[i].length;j++)
			{
				for (int k=0;k<aaa[i][j].length;k++)
				{
					for (int l=k+1;l<aaa[i][j].length;l++)
					{
						if (aaa[i][j][k]>aaa[i][j][l])
						{
							int aaatemp = aaa[i][j][k];
							aaa[i][j][k] = aaa[i][j][l];
							aaa[i][j][l] = aaatemp;
						}
					}
				}
			}
		}
		System.out.print("Sorted:   ");
		print3Darray(aaa);
	}
	
	private static void print1Darray (int [] a)
	{
		for (int m : a)
		{
			System.out.print(m + " ");
		}
		System.out.println();
	}
	
	private static void print2Darray (int [][] a)
	{
		int i =0; // counter for a
		for (int [] m : a)
		{
			
			for (int f : m)
			{
				System.out.print(f + " ");
			}
			if(++i <= a.length-1){ // put a " - " after each subarray except for last one
				System.out.print(" -  ");
		    }
			
		}
		System.out.println();
	}
	
	private static void print3Darray (int [][][] a)
	{
		int i = 0; // counter for a
		for (int [][] m : a)
		{
			int j=0; // counter for m
			for (int [] f : m)
			{
				for (int g : f)
				{
					System.out.print(g + " ");
				}
				if(++j <= m.length-1){ // put a " - " after each 3D subarray except for last one
					System.out.print(" -  ");
			    }				
			}
			if(++i <= a.length-1){ // put a " / " after each 2D subarray except for last one
				System.out.print(" /  ");
		    }
		}
		System.out.println();
	}
}
// By IzzyNotEZ @Bizou972