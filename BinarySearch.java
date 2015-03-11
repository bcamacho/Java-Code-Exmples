import java.util.*;

class BinarySearch {
	
	// public - so people can call it
	// static - does not depend on a particular object
	// boolean - we need a yes or no response
	
	public static boolean contains(int[] a, int value)
	{
		// we need to have a sorted array to start with
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		// start search from low 0 to high -1 i.e. 9 consedering 0 counts as 1 (inclusive)
	int low = 0;
	int loopCount=0;
	int high = a.length-1;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			System.out.println("Value Low="+low+" High = "+high+" mid="+mid+" Value "+a[mid]+" Loop "+loopCount);
			loopCount=loopCount+1;
			// find the sum of low index plus high then divid by two
			if (value == a[mid])
			{
				return true;
			} 
			else if(value < a[mid])// value is lower
			{
				//critical, if we do not -1 we will get an infinet loop
				high = mid -1;
			}
		    // value is greater than mid
			else if(value > a[mid])
			{
				low = mid +1;	
			}
		}
	return false ;	
	}
	
	public static String numbersOnly(String data) {
		data = data.replaceAll("[^\\d.]", "");
		if (data.equals("")) {
			System.out.println("Only numbers,try again");
			return "403";
		} else {
			return data; 
		}
	}
	
	public static void main(String[] args) {
		int[]dataArray = {1,47,31,4,75,16,97,108,91,10};
		Scanner scan = new Scanner(System.in);
		//String userInput = scan.nextLine();
//		numbersOnly(userInput);
		/***  NOTES
		
		Binary search = Divide and conqure
		Is the collection sorted? i.e. list/array sorted
		if so, lets say im looking for a number 35
		start middle of array then split
		next split the right side and seach the index i.e. array[5], array[6]
		
		**/
		try {
			String dataTest = numbersOnly(scan.nextLine());
			while (dataTest.equals("403")) {
				 dataTest = numbersOnly(scan.nextLine());
			}
			System.out.println("Binary Search tested "+contains(dataArray, Integer.valueOf(dataTest)));
			
		} catch (Exception e) {
			//System.out.println("Numbers only, try again"); 	 
			}
		}
}