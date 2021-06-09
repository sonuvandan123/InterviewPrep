package logicprograms;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		// fibonacci series program   - 0 1 1 2 3 5 8 13 21 ....
	    int first=0;
	    int second=1;
	    int n=10;
	    int series;
	    System.out.print(first + " "+second);
	    for(int i=0;i<n-2;i++)
	    {
	    	series=first+second;
	    	first=second;
	    	second=series;
	    	System.out.print(" "+series);
	    }
	    
		
	}

}
