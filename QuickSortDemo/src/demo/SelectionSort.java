package demo;

import org.apache.log4j.Logger;

public class SelectionSort {

	private static Logger logger = Logger.getLogger("SelectionSort");
	
	public static int select(int[] a,int k){

		Shuffle.shuffleArray(a);		
		int lo = 0, hi = a.length-1;
		
		while(hi>lo){
			int j = QuickSort.partition(a, lo, hi);
			logger.trace("Partition Index for Selection Sort: "+j);
			if(j<k)
				lo = j + 1;
			else if(j>k)
				hi = j - 1;
			else
				return a[k];
		}
		
		return a[k];
	}
	
}
