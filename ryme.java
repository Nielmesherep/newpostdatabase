package Game;

import java.util.Scanner;

public class ryme{

	public static void main(String[] args) {
		String name;
		int num;
		int i=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Your Name:");
		name=scan.nextLine();
		System.out.print("Enter A Number:");
		num=scan.nextInt();
		
		while(i<num) {
			System.out.println(name);
			i++;
		}
		scan.close();
	}

}