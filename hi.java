package Game;

public class hi {
	
	public static void main(String[] args) {
		System.out.println("Multiple of 5 are: ");
		System.out.println("The Sum Of The Squares Of All Multiples Of 5");
		for(int num=0;num<100;num++) {
			if(num%5==0) {
				System.out.println(num+"="+num*num);				
			}
		}	
	}
}