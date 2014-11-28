package demo;

import org.apache.log4j.Logger;

public class MainClass {
	
	private static Logger logger = Logger.getLogger("MainClass");

	public static void main(String[] args) {
		
		int[] a = {5,3,4,10,2,1,13,11,7,9,6,8,16,12,14,15};
		
		String index = args[0];
		
		if(index!=null){
			int k = -1;
			try {
				k = Integer.parseInt(index);
			} catch (NumberFormatException e) {
				logger.error("Input value should be integer");
				e.printStackTrace();
				System.exit(0);
			}
			if(k<0 || k>=a.length){
				System.out.println("Invalid Index");
			}
			else{
				int value = SelectionSort.select(a, k);
				System.out.println(k+"th index value of sorted array is "+value);
			}			
		}
		else{
			QuickSort.sort(a);
			
			logger.info("After quick sort");
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}		
	}

}
