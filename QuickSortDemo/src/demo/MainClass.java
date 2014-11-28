package demo;

import org.apache.log4j.Logger;

public class MainClass {
	
	private static Logger logger = Logger.getLogger("MainClass");

	public static void main(String[] args) {
		
		int[] a = {5,3,4,10,2,1,13,11,7,9,6,8,16,12,14,15};
		
		QuickSort.sort(a);
		
		logger.info("After quick sort");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
