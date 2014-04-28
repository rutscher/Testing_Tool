

public class phaseTwoNextDate {

	boolean validInput = true;
	
	int tomorrowDay, tomorrowMonth, tomorrowYear = 0;
	
	public void validDate(int month, int day, int year) {

		

			if (month < 1 || month > 12) {
				validInput = false;
			}
			if (day < 1 || day > 31) {
				validInput = false;
			}
			if (year < 1801 || year > 2021) {
				validInput = false; 
			}

		}
	
	public void nextDate(int month, int day, int year) {
		
		tomorrowDay = day;
		tomorrowMonth = month;
		tomorrowYear = year;
		
		// make a switch variable so as not to change the original value
		int switchVariable = 0;

		//combine range 1-99 to single case in switch
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) { // 31 Day Month
			
		    switchVariable = 1;
		
		}
		
		else if (month == 4 || month == 6 || month == 9 || month == 11) { //30 Day Month
			
			switchVariable = 2;
			
		}
	
		else if (month == 12) {
			
			switchVariable = 3;
		}
		else {
			
		switchVariable = 4;	
			
		}
			
		
		switch (switchVariable) 
		{ 
			case 0: // Invalid
				break;
		    case 1: //31 Day
		    	if (day < 31) {
		    		
		    		tomorrowDay = day + 1;
		    		
		    	}
		    	else if (day == 31){
		    		
		    		tomorrowDay = 1;
		    		tomorrowMonth = month + 1;
		    		
		    	}
		    	
		    	else {
		    		
		    		System.out.println("Invalid Input Date");
		    	
		    	}
		        break;
		    case 2: // 30 Day
		    case 3: // December
		    	
		    	if (day < 31) {
		    		tomorrowDay = day + 1;
		    		
		    	}
		    	else {
		    		
		    	tomorrowDay = 1;
		    	tomorrowMonth = 1;
		    		if (year == 2021) {
		    			System.out.println("Invalid Input Date");
		    		}
		    			else {
		    				
		    	tomorrowYear = year + 1;
		    	}
		    	}
		    	
		    	break;
		    case 4: //February
		    if (day < 28) {
		    	tomorrowDay = day + 1;

		    }
		    else {
		    	if (day == 28) {

		    		if ((year%4) == 0 && year != 2000) {
		    			tomorrowDay = 29;
		    		}
		    		else {

		    		tomorrowDay = 1;
		    		tomorrowMonth = 3;
		    		} 
		    	}

		    	else	{

		    		if (day == 29) {

		    			if ((year%4) == 0 && year != 2000)  {
		    				tomorrowDay = 1;
		    				tomorrowMonth = 3;


						}	
		    			else {

		    				if (day > 29) {

		    				 	System.out.println("Invalid Input Date");

		    				}



		    			}	


		    			}

		    		}


		    }
		    
		    
			break; 
		}


System.out.println(tomorrowMonth);
System.out.println(tomorrowDay);
System.out.println(tomorrowYear);
		    
		
		
		
	}
			
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 phaseTwoNextDate test = new phaseTwoNextDate();
	 test.nextDate(2,29,1992);
		
	}

}
