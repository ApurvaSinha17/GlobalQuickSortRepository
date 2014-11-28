package demo;

import org.apache.log4j.Logger;

public class MainClass {
	
	private static Logger logger = Logger.getLogger("MainClass");

	public static void main(String[] args) {
		
		//All distinct numbers
		//int[] a = {5,3,4,10,2,1,13,11,7,9,6,8,16,12,14,15};
		
		//Some equal numbers
		int[] a = {5,4,4,11,2,11,13,11,8,9,8,8,16,12,4,5};
		
		String choice = args[0];
		
		if(choice==null){
			logger.error("Choice not entered");
			System.exit(0);
		}
		
		if(choice.equalsIgnoreCase("SelectionSort")){
			String index = args[1];
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
					logger.error("Invalid Index");
					System.exit(0);
				}
				else{
					int value = SelectionSort.select(a, k);
					logger.info(k+"th index value of sorted array is "+value);
					System.out.println(k+"th index value of sorted array is "+value);
				}			
			}
			else{
				logger.error("Index not entered");
				System.exit(0);
			}
		}
		else if(choice.equalsIgnoreCase("QuickSort")){
			
			QuickSort.sort(a);
			
			logger.info("After quick sort");
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}			
		}
		else if(choice.equalsIgnoreCase("3WayQuickSort")){
			
			ThreeWayQuickSort.sort(a);
			
			logger.info("After 3-way quick sort");
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}
		else{
			logger.error("Invalid Input choice");
			System.exit(0);
		}
		
	}

}
