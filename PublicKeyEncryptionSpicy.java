import java.io.*;
import java.util.*;

/*

Hunter CS Program
Public Key Encryption Project
Daniel Moscoe, Sangmin Pak, and Jonathan Swotinsky

"Spicy" Version of Student Facing Task

Note: 
The methods used in this program to determine the values of n, Phi, e, and d, as
well as the method for encrypting and decrypting numeric messages are based on the 
RSA algorithm described in the you tube video provided by Mike Zamansky and accessible
at the following site:

https://www.youtube.com/watch?v=Z8M2BTscoD4&amp;list=WL&amp;index=76&amp;t=356s

TASK:

Reminder: 	As you work through this task, keep the following workflow in mind:
			Compile/Run > Check/Reflect > Modify > Repeat

(1) Watch the video below to learn about encrypting and decrypting numeric messages using the RSA algorithm:
https://www.youtube.com/watch?v=Z8M2BTscoD4&amp;list=WL&amp;index=76&amp;t=356s


(2) Write a program that can be used to encrypt and decrypt messages using the RSA algorithm.

Your program should include the variables:

private static int p - (p should be a prime number)
private static int q - (q should be a prime number)
private static long n - (n should be the product of p and q)
private static long e - (e should initially be set equal to 2.  You will change its value later using the setE() method.)


Your program should also include the following methods:

HINT: Some of the methods below can be used as helper methods in writing the code for other methods.
	
public static long getN() - takes no arguments, returns the value of n.
private static long getPhi(long p, long q) - takes two "large" primes, p and q, and returns the product of (p-1) and (q-1).
private static boolean isFactorOf(long m, long n) - takes two longs, and returns true if m is a factor of n or false if m is not a factor of n.	
private static boolean isPrime(n) - takes a long, n, and returns true if n is prime or false if n is not prime.
private static void setE() - sets the value of the public key, e to the least positive long that is greater than 3, prime, and not a factor of Phi.
public static long getE() - takes no arguments, returns the value of the public key, e.
private static long getD(long p, long q) - takes two primes, p and q, as arguments and uses p, q, and e to return the value of the private key, d.
	* HINT: For this methods, refer to 11:00 - 14:00 in the video above.
private static long largePowerMod(long b, long n, long m) - takes a base, b, an exponent, n, and a modulus, m and returns the value b^n mod m.
	* HINT: This method must work for very large numbers.  Consider writing this method such apply the modulus operator several more than once throughout the method.
public static long applyKey(long message, long eOrD, long n) - takes a numeric message, a public or private key eOrD, and a public key, n, and returns the encrypted or decrypted version of the message.
public static String toAscii(char ch) - takes a character and converts it to its ASCII equivalent in string form.
private static long StringToLong(String s) - takes a string and converts it to a long.
	

(3) Thoroughly test your program.  You may use the tests in the main method below or write your own.

(4) Write a program in the EncryptDecryptDriverSpicy.java file that can be used to encrypt and decrypt messages.


*/


public class PublicKeyEncryptionSpicy{
    
	////////////////////Variables////////////////////
	
	// Your code goes here!
			
	////////////////////Methods////////////////////
	
	/**
	* Write a method that returns the value of n. 
	*/
	public static long getN(){
		
		// Your code goes here!
		
	}// end getN()
	
	
	/**
	* Write a method that takes two "large" primes, p and q, and returns the 
	* product of (p-1) and (q-1). 
	*/
	private static long getPhi(long p, long q){
		
		// Your code goes here!
				
	}// end getPhi()
	
		
	/**
	* Write a method that takes two longs, m and n, and returns true if m is a factor of n
	* or false if m is not a factor of n.
	*/
	private static boolean isFactorOf(long m, long n){
		
		// Your code goes here!
		
	}// end isFactorOf()
	
	
	/**
	* Write a method that takes a long, n, and return true if n is prime 
	* or false if n is not prime.  Subgoal labels are provided below.
	*/
	private static boolean isPrime(long n){
		
		// Your code goes here!
			
	}// end isPrime()
	
	
	/**
	* Write a method to set the value of the public key, e, such that it is the least 
	* positive long that meets all of the following requirements:
	* e is greater than or equal to 3. 
	* e is prime.
	* e is not a factor of Phi.
	* Subgoal labels are provided below.
	*/
	private static void setE(long p, long q){
		
		// Your code goes here!
				
	}// end setE()
	
	
	/**
	* Write a method that gets the value of e:
	*/
	public static long getE(){
		
		// Your code goes here!
		
	}// end getE()
		
		
	/**
	* Write a method that returns a private key, d, such that (e * d) mod phi = 1.
	* (This method uses the Extended Euclidean Algorithm (EAE).)
	*/	
	private static long getD(long p, long q){
		
		// Your code goes here!
	
	}// end getD()
	
	
	/**
	* Write a method to take a base, b, exponent, n, and a modulus, m 
	* and return b^n mod m.  This method should mod the result every time 
	* it multiplies by b. Subgoal labels are provided below.
	*/
	private static long largePowerMod(long b, long n, long m){
		
		// Your code goes here!
		
	}// end largePowerMod()
	
	
	/**
	* Write a method that applies the public key, e, to encrypt a message
	* or the private key, d, to decrypt a message.
	* Hint: To encrypt a message, m, use the formula: encrypted message = m^e mod n
	* Hint: To decrypt a message, m, use the formula: decrypted message = m^d mod n.	
	*/
	public static long applyKey(long message, long eOrD, long n){
		
		// Your code goes here!
		
	}// end applyKey()
		
	
	/**
	* Take a character, and return its ASCII number as a 3-digit string. 
	*/
	private static String toAscii(char ch){
		
		// Your code goes here!
		
	}// end toAscii()
	
	
	/**
	* Take a String, and transform it to a long. 
	*/
	private static long stringToLong(String s){
		
		// Your code goes here!
		
	}// end stringToLong()
		
	
	/**
	* main 
	*/
	public static void main(String[] args){
		
		// Test for getN() method:
		/*
		System.out.println("Test for getN() method:");
		System.out.printf("p = %d\n", p);
		System.out.printf("q = %d\n", q);
		System.out.printf("n = %d\n", getN());	
		System.out.println();
		*/
		
		
		// Test for getPhi() method:
		/*
		System.out.println("Test for getPhi() method:");
		System.out.printf("p - 1 = %d\n", p - 1);
		System.out.printf("q - 1 = %d\n", q - 1);
		System.out.printf("Phi = %d\n", getPhi(p,q));	
		System.out.println();
		*/
		
		
		// Test for isFactorOf() method:
		/*
		System.out.println("\nTest for isFactorOf() method:");
		System.out.printf("%d is a factor of %d: %B\n",2,10,isFactorOf(2,10));
		System.out.printf("%d is a factor of %d: %B\n",2,6,isFactorOf(2,6));
		System.out.printf("%d is a factor of %d: %B\n",6,2,isFactorOf(6,2));
		System.out.printf("%d is a factor of %d: %B\n",3,10,isFactorOf(3,10));			
		System.out.println();
		*/
		
		
		// Test for isPrime() method:
		/*
		System.out.println("Test for isPrime() method:");
		for(int i = 2; i <= 20; i++){
			System.out.printf("%d is prime: %B\n", i, isPrime(i));
		}// end for i
		System.out.println();
		*/	
			
			
		// Test for setE() and getE() method:
		/*
		System.out.println("Test for getE() method:");
		System.out.printf("Phi = %d\n", getPhi(p,q));
		System.out.printf("e = %d\n", getE());	
		System.out.println();
		*/
		
		
		// Test for getD() method:
		/*
		System.out.println("Test for getD() method:");
		long d = getD(p,q);
		long Phi = getPhi(p,q);
		System.out.printf("e = %d\n", e);
		System.out.printf("d = %d\n", d);
		System.out.printf("Phi = %d\n",Phi);
		System.out.printf("%d * %d mod %d = %d\n",e,d,Phi,(e*d)%Phi);
		System.out.println();
		*/	
		
		
		// Test for largePowerMod() method:
		/*
		System.out.println("Test for largePowerMod() method:");
		System.out.printf("%d^%d mod %d = %d\n", 2, 3, 5, largePowerMod(2, 3, 5));
		System.out.printf("%d^%d mod %d = %d\n", 5, 8, 1000, largePowerMod(5, 8, 1000));
		System.out.printf("%d^%d mod %d = %d\n", 123, 456, 7890, largePowerMod(123, 456, 7890));
		System.out.println();
		*/
			
				
		// Test for applyKey() method with both encryption and decryption.
		/*
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
		*/
		
		
		// Test for toAscii() method:
		/*
		System.out.println("Test for toAscii() method:");
		System.out.printf("tab:\t %S\n", toAscii('\t'));
		System.out.printf("!:\t %S\n", toAscii('!'));
		System.out.printf("1:\t %S\n", toAscii('1'));
		System.out.printf("A:\t %S\n", toAscii('A'));
		System.out.printf("a:\t %S\n", toAscii('a'));
		System.out.println();
		*/
		
		
		// Test for stringToLong() method:
		/*
		System.out.println("Test for stringToLong() method:");
		String s = "Hello";
		System.out.printf("%s: %s\n", s, stringToLong(s));
		System.out.println();
		*/
		
		
	}// end main()
	
}// end PublicKeyEncryptionSpicy() class