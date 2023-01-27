package week3week4coding;

public class weeks34codingassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// Question 1-a);
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		 
		int b =  ages[ages.length-1] - ages [0];
		 
		System.out.println(b);

		    // Question 1-b);

		int[] ages2 = new int [9];

		for(int i=0 ; i<ages.length; i++) {
			ages2[i] = ages[i];
		}
		System.out.println (ages2[1]);
		    
			//I preferred to add the new age as 6;
		
		ages2[8] = 6;
		
		int c = ages2[ages2.length-1] - ages2 [0];
		System.out.println(c);
			
		   //Question 1-c);
		 
		double total = 0;
		for (int j=0; j<ages2.length;j++) {
			total += ages2 [j];
		}
		double avg = total / ages2.length ;
        System.out.println(avg);
		
			//Question 2-a);
		
		double totall = 0;
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
				
		for (String name : names) {
			totall = totall + name.length();	
				}
		double average = totall / names.length;
		System.out.println(average);
				
			// Question 2-b);
		
		String concatenate = "";
		
		for (String name : names) {
			concatenate = concatenate + name + " " ;
					}
		System.out.println(concatenate);
		
			// Question 3);
		
			// to access the last element of array we use arrayname[arrayname.length-1] for example;
				
		int[] exampleQuestion3 = {1,2,3,4,5};
		System.out.println(exampleQuestion3[exampleQuestion3.length-1]);
			// printed number to the console is 5.
		
			// Question 4);
				
			// to access the first element of array we use arrayname[0] for example;
						
		int[] exampleQuestion4 = {1,2,3,4,5};
		System.out.println(exampleQuestion4[0]);
			// printed number to the console is 1.
		
			//Question 5); 
		
		int[] nameLengths = new int[6];
				
		for (int i = 0 ; i<names.length; i++) {
				nameLengths [i] = names[i].length();
					}
		for ( int lengthOfEachName : nameLengths) {
			System.out.println(lengthOfEachName);
				}
			
			//Question 6);
		
		int sum =0;
		
		for (int lengthOfEachName : nameLengths) {
		sum = sum + lengthOfEachName;
				}
		System.out.println(sum);
		
			// calling the method (question7)	
		
		String word = "hello";
		int n = 3;
		System.out.println(question7(word,n));
        
			//calling the method (question8)
		
		String firstName = "Ali";
		String lastName = "Ustunyer";
		System.out.println(question8(firstName,lastName));
		
			//calling the methods (question9 and question10)
		
		int [] array = {15,12,24,32,8,13,44};
		System.out.println(question9(array));
		System.out.println(question10(array));
				
		int [] array2 = {1,5,6,7,7,8,9};
		System.out.println(question9(array2));
		System.out.println(question10(array2));
		
			//calling the method (question11)
		
		double [] doublearray1 = {15.33,12.12,24.99};
		double [] doublearray2 = {5.90,1.55,2.1,3.4};
		System.out.println(question11(doublearray1,doublearray2));
		// output is: true;
		
		System.out.println(question11(doublearray2,doublearray1));
		// output is: false;
				
        	//calling the method (question12)
		
		// case 1
		boolean outsideIsHot = true ;
		double rich = 15.5;
		System.out.println(willBuyDrink(outsideIsHot,rich));
		// output is: true;
		
		//case 2
		outsideIsHot = true ;
		double poor = 9.5;
		System.out.println(willBuyDrink(outsideIsHot,poor));
		// output is: false;
		
		//case 3
		boolean outsideIsNotHot = false;
		rich = 15.5;
		System.out.println(willBuyDrink(outsideIsNotHot,rich));
		// output is: false;
		
		//case 4
		outsideIsNotHot = false;
		poor = 9.5;
		System.out.println(willBuyDrink(outsideIsNotHot,poor));
		// output is: false;
		
			//calling the method (question13)
		
		// case 1
		double householdIncome = 1500 ;
		int householdSize  = 2;
		double disabilityRatio = 0.65;
				
		System.out.println(isEligible(householdIncome,disabilityRatio, householdSize ));
		// output is: true;
				
		//case 2
		householdIncome = 1000 ;
		householdSize  = 3;
		disabilityRatio = 0.65;
		
		System.out.println(isEligible(householdIncome,disabilityRatio, householdSize ));
		// output is: false;
				
		//case 3
		householdIncome = 3000 ;
		householdSize  = 7;
		disabilityRatio = 0.45;
				
		System.out.println(isEligible(householdIncome,disabilityRatio, householdSize ));
		// output is: false;
	}
			//Question 7);
		
		public static String question7(String word, int n){
			
			String newString = "";
			for (int i =0; i < n ; i++) {
				newString +=  word ;
			}
			return newString;
		}
		
			//Question 8);
		
		public static String question8(String firstName, String lastName ){
				
			String fullName =  firstName + " " +lastName ;
			return fullName;
		}
		
			//Question 9);
		
		public static boolean question9(int[] array){
			int sum = 0;
			boolean a;
				for (int ints : array) {
					 sum = sum + ints;
				}
				if (sum > 100)	{
					a = true;
					
				} 
				else {
					a= false ;
					
				}
			return a;	
				}
			
			//Question 10);
			
		public static double question10(int[] array){
			double sum = 0;
				
				for (int ints : array) {
					 sum = sum + ints;
				}
			double average = sum / array.length;
			return average;	
				}	
			
			//Question 11);
			
		public static boolean question11(double[] array1, double [] array2){
			double sum1 = 0;
			double sum2 = 0;
			boolean a = false;
						
				for (double arr1 : array1) {
							 sum1 = sum1 + arr1;
						}
			double average1 = sum1 / array1.length;
				
				for (double arr2 : array2) {
					
					 sum2 = sum2 + arr2;
				}
			double average2 = sum2 / array2.length;
			
				if (average1 > average2) {
					 a = true;
				}
			return 	a ;	
		}
			
			//Question 12);
			
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
			boolean drinkChoice = false;
				if (isHotOutside == true && moneyInPocket > 10.5) {
				
					drinkChoice = true;
				}
				else {
					 drinkChoice = false;
				}
		    return drinkChoice;
		}
			
			//Question 13 );
			
			// this method takes three variables, which are household income, disability ratio and household size 
			// and returns a boolean value as an indication of an applicant's eligibility for a social 
			// assistance program for the disabled people that requires income per capita in the household 
			//to be less than  $500 and the disability ratio to be more than 0.5 (%50).
			
		public static boolean isEligible(double householdIncome, double disabilityRatio, int householdSize){
			
				if (householdIncome / householdSize > 500 && disabilityRatio > 0.5) {
				
					return true;
				}
				else {
					 return false;
				}		
	 }
		
}


