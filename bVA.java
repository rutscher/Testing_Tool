import java.util.*;


public class bVA {
	
	
	int valueA, valueB, valueC;

	int aMinPlus, bMinPlus, cMinPlus;

	int aMaxMinus, bMaxMinus, cMaxMinus;
	
	int sol;
	
	int[][] sets;
	
	int array[];
	
	public void inputBVA(int minA, int maxA, int minB, int maxB, int minC,
			int maxC) {

		valueA = (minA + maxA) / 2;
		valueB = (minB + maxB) / 2;
		valueC = (minC + maxC) / 2;

		aMinPlus = minA + 1;
		bMinPlus = minB + 1;
		cMinPlus = minC + 1;

		aMaxMinus = maxA - 1;
		bMaxMinus = maxB - 1;
		cMaxMinus = maxC - 1;

		
		
		int[][] settemp = {
				{ minA, maxA, aMinPlus, aMaxMinus, valueA },
				{ minB, maxB, bMinPlus, bMaxMinus, valueB },
				{ minC, maxC, cMinPlus, cMaxMinus, valueC } };
		
		sets = settemp; 
		
	}
	

	
	
	public void generate(int[][] sets) {
		  int solutions = 1;
		    
          int h = 0;
		  
		    int i = 0;
		    while (i < sets.length) {
		    	
		    	solutions = solutions*sets[i].length;
		    	
		    	i++;
		    }

		int[] inputArray = new int[solutions*3];     
		
		array = inputArray;
		
		sol = solutions;
	    
	    for(i = 0; i < solutions; i++) {
	   	
	        int j = 1;
	        
	        
	        
	        
	        for(int[] set : sets) {
	        	
	        	
	        	
	           //System.out.print(set[(i/j)%set.length] + " ");
	           
	     
	           
	           
	           
	            
	            inputArray[h] = set[(i/j)%set.length];
	            	h++;
	     
	            
	            j = j*set.length;
	        }
	        
	       
	    }
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* generate(new int[][]{
			    {min1, max1, min1+1, max1-1, (min1+max1)/2},
			    {min2, max2, min2+1, max2-1, (min2+max2)/2},
				{min3, max3, min3+1, max3-1, (min3+max3)/2}});
		
		
		**/
		//Worst Case
		/*(generate(new int[][]{
			    {1, 5, 2, 4, 3},
			    {1, 5, 2, 4, 3},
			    {1, 5, 2, 4, 3}});
		
		**/
		//Robust Worst Case
		/*generate(new int[][]{
		    {1, 5, 2, 4, 3, 0, 6},
			    {1, 5, 2, 4, 3, 0, 6},
			    {1, 5, 2, 4, 3, 0, 6}});
		
		**/
		
		bVA test = new bVA();
		test.inputBVA(1, 5, 1, 5, 1, 5);
		//test.generate(sets);
		
		

	}

}
