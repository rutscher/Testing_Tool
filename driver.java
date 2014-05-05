public class driver {

	int v0 = 0;
	int v1 = 1;
	int v2 = 2;
	
	
	public void inputBVA(int minA, int maxA, int minB, int maxB, int minC,
			int maxC) {

		bVA test = new bVA();
		test.inputBVA(minA, maxA, minB, maxB, minC, maxC);
		test.generate(test.sets);

		//phaseOneTriangle tri = new phaseOneTriangle();
		//phaseTwoNextDate nextDate = new phaseTwoNextDate();
		phaseThreeCommission com = new phaseThreeCommission();

		for (int z = 0; z < test.sol; z++) {

			if ((test.array[v0] == minA || test.array[v0] == maxA || test.array[v0] == test.aMaxMinus || test.array[v0] == test.aMinPlus) && (test.array[v1] == test.valueB) && (test.array[v2] == test.valueC)) {

			
				
				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				//tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				//nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				com.commission(test.array[v0], test.array[v1], test.array[v2]);
				
		
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

			else if ((test.array[v0] == test.valueA) && (test.array[v1] == minB || test.array[v1] == maxB || test.array[v1] == test.bMaxMinus || test.array[v1] == test.bMinPlus) && (test.array[v2] == test.valueC)) {

				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				//tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				//nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				com.commission(test.array[v0], test.array[v1], test.array[v2]);
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

			else if ((test.array[v0] == test.valueA) && (test.array[v1] == test.valueB) && (test.array[v2] == minC || test.array[v2] == maxC || test.array[v2] == test.cMaxMinus || test.array[v2] == test.cMinPlus)) {

				
				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				//tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				//nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				com.commission(test.array[v0], test.array[v1], test.array[v2]);
			
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

			else if ((test.array[v0] == test.valueA) && (test.array[v1] == test.valueB) && (test.array[v2] == test.valueC)) {

				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				//tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				//nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				com.commission(test.array[v0], test.array[v1], test.array[v2]);
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

			else {
				
				//System.out.println("Invalid Test Case:");
				//System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

		}
		
	}
	
	
	public void inputRBVA(int minA, int maxA, int minB, int maxB, int minC,
			int maxC) {

		robustBVA test = new robustBVA();
		test.inputRBVA(minA, maxA, minB, maxB, minC, maxC);
		test.generate(test.sets);

		//phaseOneTriangle tri = new phaseOneTriangle();
		phaseTwoNextDate nextDate = new phaseTwoNextDate();
		//phaseThreeCommission com = new phaseThreeCommission();

		for (int z = 0; z < test.sol; z++) {

			if ((test.array[v0] == minA || test.array[v0] == maxA || test.array[v0] == test.aMaxMinus || test.array[v0] == test.aMinPlus || test.array[v0] == test.aMinMinus || test.array[v0] == test.aMaxPlus) && (test.array[v1] == test.valueB) && (test.array[v2] == test.valueC)) {

			
				
				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				//tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				//com.commission(test.array[v0], test.array[v1], test.array[v2]);
				
		
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

			else if ((test.array[v0] == test.valueA) && (test.array[v1] == minB || test.array[v1] == maxB || test.array[v1] == test.bMaxMinus || test.array[v1] == test.bMinPlus || test.array[v1] == test.bMinMinus || test.array[v1] == test.bMaxPlus) && (test.array[v2] == test.valueC)) {

				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				//tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				//com.commission(test.array[v0], test.array[v1], test.array[v2]);
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

			else if ((test.array[v0] == test.valueA) && (test.array[v1] == test.valueB) && (test.array[v2] == minC || test.array[v2] == maxC || test.array[v2] == test.cMaxMinus || test.array[v2] == test.cMinPlus || test.array[v2] == test.cMinMinus || test.array[v2] == test.cMaxPlus)) {

				
				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				//tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				//com.commission(test.array[v0], test.array[v1], test.array[v2]);
			
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

			else if ((test.array[v0] == test.valueA) && (test.array[v1] == test.valueB) && (test.array[v2] == test.valueC)) {

				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				//tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				//com.commission(test.array[v0], test.array[v1], test.array[v2]);
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

			else {
				
				//System.out.println("Invalid Test Case:");
				//System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			}

		}
		
	}
	
	public void inputWC(int minA, int maxA, int minB, int maxB, int minC,
			int maxC) {

		worstCase test = new worstCase();
		test.inputWC(minA, maxA, minB, maxB, minC, maxC);
		test.generate(test.sets);

		//phaseOneTriangle tri = new phaseOneTriangle();
		//phaseTwoNextDate nextDate = new phaseTwoNextDate();
		phaseThreeCommission com = new phaseThreeCommission();

		for (int z = 0; z < test.sol; z++) {

			
				
				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				//tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				//nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				com.commission(test.array[v0], test.array[v1], test.array[v2]);
				
		
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			

		}
		
	}
	
	public void inputRWC(int minA, int maxA, int minB, int maxB, int minC,
			int maxC) {

		robustWorstCase test = new robustWorstCase();
		test.inputRWC(minA, maxA, minB, maxB, minC, maxC);
		test.generate(test.sets);

		phaseOneTriangle tri = new phaseOneTriangle();
		//phaseTwoNextDate nextDate = new phaseTwoNextDate();
		//phaseThreeCommission com = new phaseThreeCommission();

		for (int z = 0; z < test.sol; z++) {

			
				
				System.out.println("Input:");
				System.out.println(test.array[v0]+" "+test.array[v1]+" "+test.array[v2]);
				
				System.out.println("Output:");
				tri.triangle(test.array[v0], test.array[v1], test.array[v2]);
				//nextDate.nextDate(test.array[v0], test.array[v1], test.array[v2]);
				//com.commission(test.array[v0], test.array[v1], test.array[v2]);
				
		
				
				v0 += 3;
				v1 += 3;
				v2 += 3;

			

		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver test = new driver();
		//test.inputBVA(1, 12, 1, 31, 1812, 2012); //nextDate 
		//test.inputBVA(1, 77, 1, 88, 1, 99); //Commission
		//test.inputRBVA(1, 12, 1, 31, 1812, 2012); //nextDate 
		//test.inputRBVA(5, 205, 5, 205, 5, 205); //Triangle
		//test.inputRBVA(1, 77, 1, 88, 1, 99); //Commission
		//test.inputWC(1, 77, 1, 88, 1, 99); // Commission
		test.inputRWC(5, 205, 5, 205, 5, 205); //Triangle

	}

}
