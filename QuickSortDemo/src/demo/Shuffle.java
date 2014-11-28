package demo;

import java.util.Random;

import org.apache.log4j.Logger;

public class Shuffle {
	
	private static Logger logger = Logger.getLogger("Shuffle");

	public static void shuffleArray(int[] a){
		
		for(int i=1;i<a.length;i++){
			Random random = new Random();
			int randomIndex = random.nextInt(i);
			int swap = a[i];
			a[i] = a[randomIndex];
			a[randomIndex] = swap;
		}
		
		logger.info("Shuffled Array");
		for(int i=0;i<a.length;i++){
			logger.info(a[i]);
		}
	}
}
