
public class robustBVA {

	int valueA, valueB, valueC;

	int aMinPlus, bMinPlus, cMinPlus;

	int aMaxMinus, bMaxMinus, cMaxMinus;
	
	int aMinMinus, bMinMinus, cMinMinus;

	int aMaxPlus, bMaxPlus, cMaxPlus;
	
	int sol;
	
	int[][] sets;
	
	int array[];
	
	public void inputRBVA(int minA, int maxA, int minB, int maxB, int minC,
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

		aMaxPlus = maxA + 1;
		bMaxPlus = maxB + 1;
		cMaxPlus = maxC + 1;

		aMinMinus = minA - 1;
		bMinMinus = minB - 1;
		cMinMinus = minC - 1;
		
		
		int[][] settemp = {
				{ minA, maxA, aMinPlus, aMaxMinus, valueA, aMinMinus, aMaxPlus },
				{ minB, maxB, bMinPlus, bMaxMinus, valueB, bMinMinus, aMaxPlus },
				{ minC, maxC, cMinPlus, cMaxMinus, valueC, cMinMinus, aMaxPlus } };
		
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
	        
	       // System.out.println();
	    }
	}
	
}

	
	




