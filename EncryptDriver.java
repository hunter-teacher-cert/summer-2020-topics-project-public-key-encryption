import java.io.*;
import java.util.*;

/*

Hunter CS Program
EncryptDriver() class

*/


public class EncryptDriver{
    
	public static void main(String[] args){
		
		long p = 229;
		long q = 523;
		long publicKeyN = PublicKeyEncryption.getN();
		long publicKeyE = PublicKeyEncryption.getE();
		long messageToEncrypt = 150;
		System.out.printf("Public key: n = %d, e= %d\n",publicKeyN, publicKeyE);
		System.out.printf("Message to encrypt: %d\n",messageToEncrypt);
		System.out.printf("Encrypted message: %d\n\n",PublicKeyEncryption.encryptNumeric(messageToEncrypt, publicKeyE, publicKeyN));
		
	}// end main()
	
}// end EncryptDriver() class