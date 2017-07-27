package edu.berliner;

public class AIC {
	
		public static void main( String[] args )
		{
			int temp;
			int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

			// Display the original (unsorted values)
			System.out.print("before: ");
			for ( int i=0; i<arr.length; i++ )
				System.out.print( arr[i] + " " );
			System.out.println();

			// Swap the values around to put them ascending order.
			
			for (int count1=0; count1 < arr.length ;count1++ )
			{
				for (int count2=0; count2 < arr.length ; count2++ )
				{
					if (arr[count2]>arr[count1])
					{
						temp=arr[count1];
						arr[count1]=arr[count2];
						arr[count2]=temp;
						
						// swap the values in two slots
					}
				}
			}
			

			// Display the values again, now (hopefully) sorted.
			System.out.print("after : ");
			for ( int i=0; i<arr.length; i++ )
				System.out.print( arr[i] + " " );
			System.out.println();
		}

	}

