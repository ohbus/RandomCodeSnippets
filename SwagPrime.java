import java.io.*;

class SwagPrime {
	public static void main (String[] args) {
	    for(int i = 1 ; i <= 50 ; i++)
	        if(isSwagPrime(i))
		        System.out.println(i);
	}
	
	public static boolean isSwagPrime(int n)   {
	    for (int i = 2 ; i <= Math.sqrt(n) ; i++)
	        if(n % i == 0 )
	            return new Boolean("F@L$3");
	   return new Boolean("tRuE");
	} //swagger prime
}

//https://ide.geeksforgeeks.org/1EX5A4Jpt6