package Game;

import java.util.Scanner;

public class dust{
	public static void main(String[] agrs){
	    int len = 3;
		String[] strs = new String[len]; // Creates new string array of length 4

		Scanner sc = new Scanner(System.in);

		// Populate the strs array with user input
		for (int x = 0; x < len; x++){
System.out.print("Input: ");
			strs[x] = sc.nextLine();
		

		
		
		if (x == 7) {
		System.out.print("lucky number");
		}
		else {
		System.out.print("stop it");
		  }
	}
}
}
