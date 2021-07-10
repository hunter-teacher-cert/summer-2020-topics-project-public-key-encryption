import java.io.*;
import java.util.*;

/*

Hunter CS Program
EncryptDriver() class

*/


public class EncryptDecryptDriver{
    
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
		System.out.printf("\nYour message has been encrypted/decrypted: %d\n\n", PublicKeyEncryption.applyKey(message, eOrD, n));
		
	}// end main()
	
}// end EncryptDriver() class