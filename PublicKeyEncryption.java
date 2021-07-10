import java.io.*;
import java.util.*;

/*

Hunter CS Program
Public Key Encryption Project
Daniel Moscoe, Sangmin Pak, and Jonathan Swotinsky

Full Code

Note: 
The methods used in this program to determine the values of n, Phi, e, and d, as
well as the method for encrypting and decrypting numeric messages are based on the 
RSA algorithm described in the you tube video provided by Mike Zamansky and accessible
at the following site:

https://www.youtube.com/watch?v=Z8M2BTscoD4&amp;list=WL&amp;index=76&amp;t=356s

*/


public class PublicKeyEncryption{
    
	////////////////////Variables////////////////////
	
	private static long p = 229; // 50th prime number.  (Any large prime number could be selected)
	private static long q = 523; // 99th prime number.  (Any large prime number could be selected)
	private static long e = 2; // Set the initial value of e to 2.  The setE() method will change this value to a value that is acceptable for the RSA algorithm. 
    private static long n = p * q; // Set n equal to the product of p and q.
		
	////////////////////Methods////////////////////
	
	/**
	* Take two longs, m and n, and return true if m is a factor of n or false if m is not a factor of n.
	*/
	private static boolean isFactorOf(long m, long n){
		return n % m == 0;
	}// end isFactorOf()
	
	
	/**
	* Take a long, n, and return true if n is prime or false if n is not prime.
	*/
	private static boolean isPrime(long n){
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(isFactorOf(i, n)){
				return false;
			}// end if	
		}// end for i
		return true;	
	}// end isPrime()
	
	
	/**
	* For large integers, take a base, b, and exponent, n, and a modulus, m and return b^n mod m.
	*/
	private static long largePowerMod(long b, long n, long m){
		long result = 1;
		for(int i = 1; i <= n; i++){
			result = (result*b)%m;
		}// end for i
		return result;
	}// end largePowerMod()
	
	
	/**
	* Return the value of n. 
	*/
	public static long getN(){
		return n;
	}// end getN()
	
	
	/**
	* Take two "large" primes, p and q, and return the product of (p-1) and (q-1). 
	*/
	private static long getPhi(long p, long q){
		return (p-1)*(q-1);
	}// end getPhi()
	
	
	/**
	* Set the value of the public key, e, such that it is the least positive long that meets all of the following requirements:
	* e is greater than or equal to 3. 
	* e is prime.
	* e is not a factor of Phi.
	*/
	private static void setE(long p, long q){
		boolean foundE = false;
		while(foundE == false){
			e++;
			if(isPrime(e) && isFactorOf(e,getPhi(p,q)) != true){
				foundE = true;
			}// end if
		}// end while		
	}// end getE()
	
	
	/**
	* Get the value of e:
	*/
	public static long getE(){
		e = 2;
		setE(p,q);
		return e;	
	}// end getE()
	
		
	/**
	* Return a private key, d, such that (e * d) mod phi = 1.
	* (This method uses the Extended Euclidean Algorithm (EAE).)
	*/
	private static long getD(long p, long q){
		// Establish variables:
		long phi = getPhi(p,q);
		e = getE();		
		// Construct a 2D Array to walk through the steps of the EAE: 
		long[][] euclid = new long[2][2];
		// Set the values of the first row in the array to phi:
		euclid[0][0] = phi;
		euclid[0][1] = phi;
		// Set the values of the second row in the array to e and 1 respectively:
		euclid[1][0] = e;
		euclid[1][1] = 1;
		// Repeat the following process until euclid row 2 column 1 is equal to 1:
		while(euclid[1][0] != 1){
			// Find the quotient of euclid[0][0] and [1][0]
			long quotient = euclid[0][0]/euclid[1][0];
			// Create an array to hold the products of quotient and each of the values in euclid row 2 respectively:
			long[] products = {euclid[1][0]*quotient,euclid[1][1]*quotient};
			// Create an array to hold the differences of the values in euclid row 1 and the values in product[] respectively.
			long[] differences = {euclid[0][0] - products[0], euclid[0][1] - products[1]};
			// While any of the values in differences are negative add Phi until they become positive:
			while(differences[0] < 0){
				differences[0] = differences[0] + phi;
			}// end while
			while(differences[1] < 0){
				differences[1] = differences[1] + phi;
			}// end while		
			// Assign the values in euclid row 2 to euclid row 1, and assign the values in differences to euclid row 2:
			euclid[0][0] = euclid[1][0];
			euclid[0][1] = euclid[1][1];
			euclid[1][0] = differences[0];
			euclid[1][1] = differences[1];
		}// end while
		return euclid[1][1];		
	}// end getD()
	
	
	/**
	* Apply the public key, e, to encrypt a message or the private key, d, to decrypt a message. 
	*/
	public static long applyKey(long message, long eOrD, long n){
		return largePowerMod(message, eOrD, n);
	}// end applyKey()
	
		
	/**
	* Take a character, and return its ASCII number as a 3-digit string. 
	*/
	private static String toAscii(char ch){
		// Convert char to it's ASCII equivalent:
		int asciiInt = (int) ch;
		String asciiString = Integer.toString(asciiInt);
		// If the ASCII equivalent of ch contains only one digit, place two leading zero's at the front.
		if(asciiInt <= 9){
			asciiString = "00" + asciiString;
			return asciiString;
		} else if(asciiInt >= 10 && asciiInt <= 99){
			asciiString = "0" + asciiString;
			return asciiString;
		} else {
			return asciiString;
		}// end if else
	}// end toAscii()
	
	
	/**
	* Take a String, and transform it to a long. 
	*/
	private static long stringToLong(String s){
		// Create an empty String, numberString:
		String numberString = "";
		// For each character in s, append it's ASCII representation to the end of numberString:
		for(int i = 0; i <= s.length() - 1; i++){
			numberString = numberString + toAscii(s.charAt(i));
		}// end for i	
		long num = Long.parseLong(numberString);
		return num;
	}// end stringToLong()
	
	
	/**
	* main 
	*/
	public static void main(String[] args){
		
		// Test for isFactorOf() method:
		System.out.println("\nTest for isFactorOf() method:");
		System.out.printf("%d is a factor of %d: %B\n",2,10,isFactorOf(2,10));
		System.out.printf("%d is a factor of %d: %B\n",2,6,isFactorOf(2,6));
		System.out.printf("%d is a factor of %d: %B\n",6,2,isFactorOf(6,2));
		System.out.printf("%d is a factor of %d: %B\n",3,10,isFactorOf(3,10));			
		System.out.println();
		
		
		// Test for isPrime() method:
		System.out.println("Test for isPrime() method:");
		for(int i = 2; i <= 20; i++){
			System.out.printf("%d is prime: %B\n", i, isPrime(i));
		}// end for i
		System.out.println();
			
		
		// Test for largePowerMod() method:
		System.out.println("Test for largePowerMod() method:");
		System.out.printf("%d^%d mod %d = %d\n", 2, 3, 5, largePowerMod(2, 3, 5));
		System.out.printf("%d^%d mod %d = %d\n", 5, 8, 1000, largePowerMod(5, 8, 1000));
		System.out.printf("%d^%d mod %d = %d\n", 123, 456, 7890, largePowerMod(123, 456, 7890));
		System.out.println();
		
		
		// Test for getN() method:
		System.out.println("Test for getN() method:");
		System.out.printf("p = %d\n", p);
		System.out.printf("q = %d\n", q);
		System.out.printf("n = %d\n", getN());	
		System.out.println();
		
		
		// Test for getPhi() method:
		System.out.println("Test for getPhi() method:");
		System.out.printf("p - 1 = %d\n", p - 1);
		System.out.printf("q - 1 = %d\n", q - 1);
		System.out.printf("Phi = %d\n", getPhi(p,q));	
		System.out.println();
		
		
		// Test for setE() and getE() method:
		System.out.println("Test for getE() method:");
		System.out.printf("Phi = %d\n", getPhi(p,q));
		System.out.printf("e = %d\n", getE());	
		System.out.println();
		
		
		// Test for getD() method:
		System.out.println("Test for getD() method:");
		long d = getD(p,q);
		long Phi = getPhi(p,q);
		System.out.printf("e = %d\n", e);
		System.out.printf("d = %d\n", d);
		System.out.printf("Phi = %d\n",Phi);
		System.out.printf("%d * %d mod %d = %d\n",e,d,Phi,(e*d)%Phi);
		System.out.println();
			
		
		// Test for applyKey() method with both encryption and decryption.
		long message = 150;
		System.out.printf("Test for encryption (assume p = %d and q = %d):\n",p,q);
		System.out.printf("Public key: n = %d, e = %d\n", n, e);
		System.out.printf("Message to encrypt: %d\n", message);
		System.out.printf("Encrypted message: %d\n\n",applyKey(message, e, n));
		
		message = 72019;
		System.out.printf("Test for decryptNumeric (assume p = %d and q = %d):\n", p, q);
		System.out.printf("Private key: n = %d, d = %d\n", n, d);
		System.out.printf("Message to decrypt: %d\n", message);
		System.out.printf("Decrypted message: %d\n\n", applyKey(message, d, n));
		
		
		// Test for toAscii() method:
		System.out.println("Test for toAscii() method:");
		System.out.printf("tab:\t %S\n", toAscii('\t'));
		System.out.printf("!:\t %S\n", toAscii('!'));
		System.out.printf("1:\t %S\n", toAscii('1'));
		System.out.printf("A:\t %S\n", toAscii('A'));
		System.out.printf("a:\t %S\n", toAscii('a'));
		System.out.println();
		
		
		// Test for stringToLong() method:
		System.out.println("Test for stringToLong() method:");
		String s = "Hello";
		System.out.printf("%s: %s\n", s, stringToLong(s));
		System.out.println();
		
		// Test for converting an ASCII number to a char: 
		System.out.println("Test for converting an ASCII number to a char:");
		System.out.printf("The character that corresponds to ASCII number %d is...",100);
		System.out.println((char)100);
		
	}// end main()
	
}// end PublicKeyEncryption() class