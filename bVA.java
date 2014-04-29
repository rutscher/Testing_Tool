import java.util.*;


public class bVA {
	
	int value1, value2, value3 = 0;
	int nomValue1, nomValue2, nomValue3 = 0;
	
	//int min1, min2, min3 = 1;
			
	//int max1, max2, max3 = 5;
		
	
	
	Set<Integer> s1 = new HashSet<Integer>();
	
	Set<Integer> s2 = new HashSet<Integer>();
	
	Set<Integer> s3 = new HashSet<Integer>();
	
	
	
	public void bVAnalysis(int min1, int max1, int min2, int max2, int min3, int max3) {
		
		boolean value1Nom, value2Nom, value3Nom = true;
		
		value1 = (min1+max1)/2;
		value2 = (min2+max2)/2;
		value3 = (min3+max3)/2;
			
		}
		
		
		

	
	public void setGen(int min1, int max1, int min2, int max2, int min3, int max3) {
		
		
		
		
		s1.add(min1);
		s1.add(max1);
		s1.add(min1+1);
		s1.add(max1-1);
		s1.add(min1+max1 / 2);
		
		
		s2.add(min2);
		s2.add(max2);
		s2.add(min2+1);
		s2.add(max2-1);
		s2.add(min2+max2 / 2);
		
		
		s3.add(min3);
		s3.add(max3);
		s3.add(min3+1);
		s3.add(max3-1);
		s3.add(min3+max3 / 2);
		
		
	
		
		
		
		
	}
	
	
	
	public static void generate(int[][] sets) {
	    int solutions = 1;
	    for(int i = 0; i < sets.length; solutions *= sets[i].length, i++);
	    for(int i = 0; i < solutions; i++) {
	        int j = 1;
	        for(int[] set : sets) {
	            System.out.print(set[(i/j)%set.length] + " ");
	            j *= set.length;
	        }
	        System.out.println();
	    }
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* generate(new int[][]{
			    {min1, max1, min1+1, max1-1, (min1+max1)/2},
			    {min2, max2, min2+1, max2-1, (min2+max2)/2},
				{min3, max3, min3+1, max3-1, (min3+max3)/2}});
		
		
		**/
		
		generate(new int[][]{
			    {1, 5, 2, 6, 3},
			    {1, 5, 2, 6, 3},
			    {1, 5, 2, 6, 3}});
		
		
		
		

	}

}
