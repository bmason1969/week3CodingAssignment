package week3CodingAssignment;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] 
//				in your code). Print the result to the console.

		int sub = ages[ages.length - 1] - ages[0];
		System.out.println(sub);

//			b.	Add a new age to your array and repeat the step above to ensure it is dynamic 
		int[] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 15 };
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.	
		double avg = 0;
		for (int age : ages2) {
			avg += age;
		}
		avg /= ages2.length;
		System.out.println(avg);

//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.			

		int sumOfLetters = 0;

		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters / names.length);

//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String sumOfNames = "";
		for (String name1 : names) {
			sumOfNames += name1 + " ";
		}
		System.out.println(sumOfNames);

//		3.	How do you access the last element of any array?
		System.out.println(names[names.length -1]);

//		4.	How do you access the first element of any array?
		System.out.println(names[0]);

//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and 
//	    add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}

//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.	
		int sum = 0;
		for (int length : nameLengths) {
			sum += length;
		}
		System.out.println(sum);
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
//		. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		System.out.println(returnWord("hi", 5));
//		
// 		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
		String firstName = "John";
		String lastName = "Smith";
		System.out.println(returnFullName(firstName, lastName));
		
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.		
		System.out.println(returnSumStatus(ages));
		
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double[] array = {3.50, 6.50, 7.50, 8.50, 9.50};
		
		System.out.println(averageOfElements(array));
			
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
//		greater than the average of the elements in the second array.	
		double[] arrayOneElements = {2.50, 6.50, 8.50, 9.50};
		double[] arrayTwoElements = {1.50, 4.50, 6.50, 3.50};
		
		System.out.println(comparisonAverage(arrayOneElements, arrayTwoElements));
		
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot 
//		outside and if moneyInPocket is greater than 10.50.	
		boolean isHotOutside = true;
		double moneyInPocket = 15.50;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
						
//		13. Create a method named returnSum that accepts 2 integer variables named num1 and num2. Return the sum of the two variables.
			int num1 = 6;
			int num2= 8;
			
			System.out.println(returnSum(num1, num2));
		
	} // end of main
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
//		. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).

	public static String returnWord(String word, int n) {
		String concat = "";
		for (int i = 0; i < n; i++)
			concat += word;

		return concat;
	}

//	  8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
//	 (the full name should be the first and the last name as a String separated by a space).

	public static String returnFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}

//	9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean returnSumStatus(int[] listOfNum) {
		int sum = 0;

		for (int i = 0; i < listOfNum.length - 1; i++)
			sum += listOfNum[i];

		if (sum > 100)
			return true;
		else
			return false;

	}

//	10.	Write a method that takes an array of double and returns the average of all the elements in the array.

	public static double averageOfElements(double[] listOfDouble) {
		double average = 0;
		double sum = 0;
		for (int i = 0; i < listOfDouble.length - 1; i++)
			sum += listOfDouble[i];

		average = sum / listOfDouble.length;
		return average;
	}

//	11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
//		greater than the average of the elements in the second array.
	public static boolean comparisonAverage(double[] arrayOne, double[] arrayTwo) {
		double average = 0, averageTwo = 0;
		double sum = 0, sumTwo = 0;
		for (int i = 0; i < arrayOne.length - 1; i++)
			sum += arrayOne[i];

		for (int i = 0; i < arrayTwo.length - 1; i++)
			sumTwo += arrayTwo[i];

		average = sum / arrayOne.length;
		averageTwo = sumTwo / arrayTwo.length;

		if (average > averageTwo)
			return true;
		else
			return false;
	}

//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot 
//		outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {

		if (isHotOutside && moneyInPocket > 10.50)
			return true;
		else
			return false;
	}

//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
//		Create a method named returnSum that accepts 2 integer variables named num1 and num2. Return the sum of the two variables.
// The method adds integers variables and returns sum. Method was created to show method structure and return.  		
	public static int returnSum(int num1, int num2) {

		int sum = 0;
		sum = num1 + num2;
		return sum;
	}

}
