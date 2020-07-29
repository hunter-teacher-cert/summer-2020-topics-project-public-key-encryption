import java.io.*;
import java.util.*;

/*

Hunter CS Program
Public Key Encryption Project
Daniel Moscoe, Sangmin Pak, and Jonathan Swotinsky

"Medium" Version of Student Facing Task

Note: 
The methods used in this program to determine the values of n, Phi, e, and d, as
well as the method for encrypting and decrypting numeric messages are based on the 
RSA algorithm described in the you tube video provided by Mike Zamansky and accessible
at the following site:

https://www.youtube.com/watch?v=Z8M2BTscoD4&amp;list=WL&amp;index=76&amp;t=356s

TASK:

(1) Complete the PublicKeyEncryptionMild.java file.

(2) Try using the public key, e, from the PublicKeyEncryptionMild.java activity to encrypt
a numeric message.  Then try using the private key, d, from the PublicKeyEncryptionMild.java
activity to decrypt it. Did you get your original message?
	
(3) Try changing p and q in the PublicKeyEncryptionMild.java file. What are your new 
public and private keys?  Try using your new public and private keys to encrypt and decrypt
numeric messages.
	
(4) Have fun sending and recieving secure messages!

*/


public class EncryptDecryptDriverMild{
    
	public static void main(String[] args){
		
		// Create a scanner object:
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a message to encrypt or decrypt:
		System.out.print("\nEnter a message to encrypt/decrypt: ");
		
		// Store the message from the user in a variable:
		long message = input.nextLong();
		
		// Prompt the user to enter the first part of the key (n):
		System.out.print("\nEnter the first part of the key (n): ");
		
		// Store n in a variable:
		long n = input.nextLong();
		
		// Prompt the user to enter the second part of the public key (e or d):
		System.out.print("\nEnter second part of the key (e or d): ");
		
		// Store e or d in a variable:
		long eOrD = input.nextLong();
		
		// Encrypt the message and display it to the user:
		System.out.printf("\nYour message has been encrypted/decrypted: %d\n\n", PublicKeyEncryptionMild.applyKey(message, eOrD, n));
		
	}// end main()
	
}// end EncryptDecryptDriverMild() class