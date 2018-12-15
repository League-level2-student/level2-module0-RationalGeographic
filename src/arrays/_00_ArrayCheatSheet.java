package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		// String[] arstring = new String[50];
		// for (int i = 0; i < 50; i++) {
		// arstring[i] = "i am " + i;
		// }
		// arstring[0] = "nikita";
		// arstring[1] = "cobra";
		// arstring[2] = "john";
		// arstring[3] = "daniel";
		// arstring[4] = "alex";

		// Arrays.sort(arstring);

		// for (int i = 0; i < 50; i++) {
		// if(i==3) {
		// System.out.println(arstring[i]);
		// }
		// }

		// 2. print the third element in the array

		// 3. set the third element to a different value
		// for (int i = 0; i < 50; i++) {
		// if (i == 3) {
		// i=30;
		// }
		// System.out.println(arstring[i]);
		// }
		// 4. print the third element again

		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		int lowval = 100;
		// 6. make an array of 50 integers
		int[] arint = new int[50];
		for (int x = 0; x < 50; x++) {
			arint[x] = x;
		}
		for (int x = 0; x < 50; x++) {
			Random r = new Random();

			arint[x] = r.nextInt(50);
			System.out.println(arint[x]);

			if (arint[x] < lowval) {
				lowval = arint[x];
			}
		}
		System.out.println(lowval);
	}

	// 7. use a for loop to make every value of the integer array a random number

	// 8. without printing the entire array, print only the smallest number in the
	// array

	// 9 print the entire array to see if step 8 was correct

	// 10. print the largest number in the array.
}
