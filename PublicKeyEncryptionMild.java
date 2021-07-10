import java.io.*;
import java.util.*;

/*

Hunter CS Program
Public Key Encryption Project
Daniel Moscoe, Sangmin Pak, and Jonathan Swotinsky

"Mild" Version of Student Facing Task

Note: 
The methods used in this program to determine the values of n, Phi, e, and d, as
well as the method for encrypting and decrypting numeric messages are based on the 
RSA algorithm described in the you tube video provided by Mike Zamansky and accessible
at the following site:

https://www.youtube.com/watch?v=Z8M2BTscoD4&amp;list=WL&amp;index=76&amp;t=356s

TASK:

Reminder: 	As you work through this task, keep the following workflow in mind:
			Compile/Run > Check/Reflect > Modify > Repeat

(1)	The first step in the RSA algorithm is to select two large prime, numbers, 
and find their product, n.
	
	(a) In the variables section of the code below, set p and q to large prime numbers.  
	If you need some help finding large prime numbers, check out the link below:
	https://en.wikipedia.org/wiki/List_of_prime_numbers#The_first_1000_prime_numbers
	
	(b) In the variables section of the code below, set the value of n to the product
	of p and q.
	
	(c) Uncomment the first block of code in the main() method to confirm that you have 
	successfully completed steps a and b above.
	
	*Note: A getter method has been written to access the value of n from outside this class.
	 

(2) The next step in the RSA algorithm is to determine Phi(n).  Phi(n) can be 
determined by multiplying (p-1) by (q-1).

	(a) Locate the method, getPhi() below and complete it by writing its body.
	
	(b) Uncomment the second block of code in the main() method to confirm that you have 
	successfully completed step a above.
	

(3) Next you need will need to generate the public key, e.  This is the key that
others will use to encrypt their message before they send it to you.  The value of e
must meet the following requirements: First, e must be greater than or equal to 3.  
Next, e must be prime.  Finally, e may not be a factor of Phi.  Before writing a method
that sets the value of e, you will first need to write some helper methods.

	(a) Locate the method, isFactorOf() below and complete it by writing its body.
	
	(b) Locate the method, isPrime() below and complete it by writing its body.
		(Subgoal labels are provided below to help you out with this one).
		
	(c) Locate the method, setE() below and complete it by writing its body.
		(Subgoals labels are provided below to you out with this one as well).
		
	(d) Uncomment the third, fourth, and fifth blocks of code in the main() method to confirm 
	that you have successfully completed steps a-c above.
		
	*Note: A getter method has been written to access the value of e from outside this class.
		
	
(4) You will also need a private key, d.  This is the key that you will use to decrypt
the messages you recieve from others.  Remember, this is the key that only you know.  
The method required to find d has been written below.  It will also be live-coded in class. 

	(a) Review the following video about the RSA encryption: 
	https://www.youtube.com/watch?v=Z8M2BTscoD4&amp;list=WL&amp;index=76&amp;t=356s , 
	in particular from 11:00 to 14:00.
	
	(b) Locate the method, getD() below.

	(c) With a partner discuss what you notice about the video and the code.  Specifically, can you
	determine where each step from the alogrithm in the video appears in the code?  Try tracing through
	the code on some KtS.  Remember to write down some questions, suggestions for alternate strategies, etc.
	
	(d) Uncomment the sixth block of code in the main() method to confirm that the getD() method has been
	written correctly.
	
	
(5) You are now ready to write a method that can be used to encrypt and decrypt numeric messages. First, 
take a moment to review the strategy for encrypting and decrypting messages.  Need a hint?

To encrypt a message, m, use the following formula: encrypted message = m^e mod n
To decrypt a message, m, use the following formula: decrypted message = m^d mod n.

It is important to keep in mind that even a long has a limit in java.  So, since RSA requires very 
large numbers, you will need to first write another helper method. 

	(a) Locate the method, largePowerMod() below and complete it by writing its body.
	(Subgoals labels are provided below to you out again).
	
	(b) Locate the method, applyKey() below and complete it by writing its body.
	
	(c) Uncomment the seventh and eigth block of code in the main() method to confirm that you 
	have successfully completed steps a and b above.
	
	
(6) Congratulations! You now know how to encrypt and decrypt numeric messages using the RSA algorithm.
But, what if you want to encrypt a message that contains characters?  Checkout the methods stringToAscii()
and stringToLong() below.

	(a) With your partner, review the methods and discuss what you notice.  Specifically, what are 
	some advantages of using the methods above to translate from Strings to longs?  What are some 
	disadvantages? How might you write these methods differently to better serve their purpose?
	
	(d) Uncomment the ninth, and tenth blocks of code in the main() method to confirm that the
	stringToAscii() and stringToLong() methods have been written correctly.
	
	
(7) Finally, try encrypting and decrypting some numeric messages using the EncryptDecryptDriverMild.java file.

	(a) In the EncryptDecryptDriverMild.java file try using the public key, e, from this activity to encrypt
	a numeric message.  Then try using the private key, d, from this activity to decrypt it.  
	Did you get your original message?
	
	(b) Try changing p and q in this file.  What are your new public and private key?  Try using your new
	public and private keys in the EncryptDecryptDriverMild.java file to encrypt and decrypt numeric messages.
	
	(c) Have fun sending and recieving secure messages!


*/


public class PublicKeyEncryptionMild{
    
	////////////////////Variables////////////////////
	
	private static long p = ; // Set p equal to a large prime number.
	private static long q = 523; // Set q equal to a large prime number.
	private static long e = 2; // Note: The initial value of e has been set equal to 2.  
							   //The setE() method below will change this value to a value 
							   //that is acceptable for the RSA algorithm. 
    private static long n = ; // Set n equal to the product of p and q.
		
		
	////////////////////Methods////////////////////
	
	/**
	* Return the value of n. 
	*/
	public static long getN(){
		return n;
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
		
		// Subgoals:
		
		// Check all integers from 2 to the square root of n:
		
		// If any integer is a factor of n, return false. (Hint: You may want to use 
		// the method you wrote above.)
		
		// If none of the integers you checked are a factor of n, return true.
			
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
		
		// Subgoals:
		
		// Declare a boolean variable, foundE to store the value true if e has been found
		// or false if e has not yet been found.  Set the initial value of foundE to false.
		
		// Until e is found, repeat the following steps:
		
		// (1) Increment the value of e by 1.  (Remember, e was initially set equal to 2)
		// (2) Check to see if e is prime and also a factor of Phi.
		// (3) If both conditions above are true, change the value of foundE to true.
				
	}// end setE()
	
	
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
	* Write a method to take a base, b, exponent, n, and a modulus, m 
	* and return b^n mod m.  This method should mod the result every time 
	* it multiplies by b. Subgoal labels are provided below.
	*/
	private static long largePowerMod(long b, long n, long m){
		
		// Your code goes here!
		
		// Subgoals:
		
		// Declare a long variable, result to store the result of b^n mod m.
		
		// Repeat the following n times:
		
		// (1) Multiply the result by b.
		// (2) Mod the result by m.
		
		// Return the result.
		
	}// end largePowerMod()
	
	
	/**
	* Write a method that applies the public key, e, to encrypt a message
	* or the private key, d, to decrypt a message.
	* Hint: To encrypt a message, m, use the formula: encrypted message = m^e mod n
	* Hint: To decrypt a message, m, use the formula: decrypted message = m^d mod n.	
	*/
	public static long applyKey(long message, long eOrD, long n){
		
		// Your code goes here!
		
		// Hint: This code can be written in a single line.
		
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
	
}// end PublicKeyEncryptionMild() class