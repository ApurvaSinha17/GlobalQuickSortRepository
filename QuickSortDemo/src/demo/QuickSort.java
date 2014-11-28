package demo;

import org.apache.log4j.Logger;

public class QuickSort {
	
	private static Logger logger = Logger.getLogger("QuickSort");

	private static final int CUTOFF = 7;
	
	public static void sort(int[] a){
		
		//Optimisation-1
		Shuffle.shuffleArray(a);
		
		sort(a,0,a.length-1);
	}
	
	private static void sort(int[] a,int lo,int hi){
		
		//Optimisation-2
		if((hi-lo) < CUTOFF){
			logger.info("Insertion Sort between indices "+lo+" and "+hi);
			InsertionSort.sort(a, lo, hi);
			return;
		}
		
		int k = partition(a, lo, hi);
		
		sort(a,lo,k-1);
		sort(a,k+1,hi);
	}
	
	static int partition(int[] a,int lo,int hi){
		
		int i = lo, j = hi+1;
		
		while(true){
			
			while(a[++i] < a[lo]){
				if(i == hi)
					break;
			}
			
			while(a[--j] > a[lo]){
				if(j == lo)
					break;
			}
			
			if(i >= j)
				break;
			
			int swap = a[i];
			a[i] = a[j];
			a[j] = swap;
		}
		
		int temp = a[lo];
		a[lo] = a[j];
		a[j] = temp;
		
		logger.trace("Partition index is "+j);
		return j;
	}
}
