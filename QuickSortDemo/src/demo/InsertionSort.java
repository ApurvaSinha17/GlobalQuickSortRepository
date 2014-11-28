package demo;

import org.apache.log4j.Logger;

public class InsertionSort {
	
	private static Logger logger = Logger.getLogger("InsertionSort");

	public static void sort(int[] a,int lo,int hi){
		
		logger.trace("In insertion sort");
		for(int i=lo;i<=hi;i++){
			for(int j=i;j>lo && (a[j] < a[j-1]);j--){
				int swap = a[j-1];
				a[j-1] = a[j];
				a[j] = swap;
			}
		}
		
		logger.trace("Sorted sub-array");
		for(int i=lo;i<=hi;i++){
			logger.info(a[i]);
		}
	}
}
