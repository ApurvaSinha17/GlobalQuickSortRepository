package demo;

public class ThreeWayQuickSort {

	public static void sort(int[] a){
		
		Shuffle.shuffleArray(a);
		int lo = 0, hi = a.length-1;
		sort(a,lo,hi);
	}
	
	private static void sort(int[] a,int lo, int hi){
		
		if(hi <= lo)
			return;
		
		//Low and high indices for equal numbers
		int lt = lo, gt = hi;
		
		//Partition value
		int v = a[lo];
		
		//Counter start index
		int i = lo;
		
		int temp;
		
		while(i <= gt){
			
			if(a[i] < v)
				exch(a,lt++,i++);
			else if(a[i] > v)
				exch(a,i,gt--);
			else
				i++;
		}
		
		sort(a,lo,lt-1);
		sort(a,gt+1,hi);
	}
	
	private static void exch(int[] a,int i,int j){
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
