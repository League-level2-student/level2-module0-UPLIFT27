package arrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		//1. make an array of 5 Strings
		String[] LeGoats = {"LeBron", "James", "Bronny", "Jr", "Bryce"};
		//2. print the third element in the array
		
		
		System.out.println(LeGoats[2]);
		//3. set the third element to a different value
		LeGoats[2] = "Kevin";
		//4. print the third element again
		System.out.println(LeGoats[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
	
		
		for(int i =0; i<5; i++)
		{
			System.out.println(LeGoats[i]);
			
		}
		
		//6. make an array of 50 integers
		
		//7. use a for loop to make every value of the integer array a random number
		
		int[] ranNumbs = new int[50];
		for(int i =0; i< ranNumbs.length; i++)
		{
			int numb = random.nextInt(50);
			ranNumbs[i] = numb;
		}
		int smallestNum = ranNumbs[0];
		for(int i =1; i<ranNumbs.length; i++)
		{
			
			if(smallestNum>ranNumbs[i])
			{
				smallestNum=ranNumbs[i];
			}
			
			 
		}
		System.out.println("This is the smallest Number "+ smallestNum);
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		
		for(int i =0; i<50; i++)
		{
			
			System.out.println(ranNumbs[i]);
		}
		
		int LargestNum = ranNumbs[0];
		for(int i =1; i<ranNumbs.length; i++)
		{
			
			if(LargestNum<ranNumbs[i])
			{
				LargestNum=ranNumbs[i];
			}
			
			 
		}
		System.out.println("This is the largest Number "+ LargestNum);
	}
}
