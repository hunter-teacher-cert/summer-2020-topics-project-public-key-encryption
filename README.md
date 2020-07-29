# Public Key Encryption
# Team Members
1. Daniel Moscoe
2. Sangmin Pak
3. Jonathan Swotinsky

# Instructions
Add the text content of your lesson/unit plan to this file. Add any extra files and source code to this repository. Make sure to provide any instructions needed to run the code.

# Abstract

Public key encryption allows two parties to communicate secretly, even though all their communications—including those regarding their encryption strategy—are public. 

The RSA encryption method is a commonly used algorithm for public key encryption. The materials presented here comprise most of what would be required for a 6-10 day unit on RSA encryption in an AP Computer Science course. 

The unit addresses the essential questions, “How can we communicate privately across a public channel?” And, “What is the advantage of public key encryption over earlier encryption methods?” 

During the unit, students will learn to use the RSA algorithm, both by hand and by implementing it in Java. This will require some review of the relevant mathematics, which we include. 

We also provide online resources, especially videos and calculators for computing with very large numbers.

# Table of Contents
Public Key Encryption – Unit Plan - 
Contains essential questions, pre- and summative assessments, appropriate standards, and suggested sequence of lessons.  Each lesson has academic tasks that can be turned into learning objectives with appropriate DOK level, key facts on what you should include in each lesson, as well as appropriate differentiation/pedagogical techniques.

PublicKeyEncryption*.java 
Coding templates for students to create their own implementation of the RSA algorithm. 
PublicKeyEncryption.java contains the full working code. 
PublicKeyEncryptionMild.java, PublicKeyEncryptionMedium.java, and PublicKeyEncryptionSpicy.java serve as differentiated student facing activities with varying levels of scaffolding. (Mild provides the greatest scaffolding, and spicy the least)

EncryptDecryptDriver*.java   
Methods to accept input, format output, and test student work on  PublicKeyEncryption*.java.

funwithrsa.java. - a method for prime factorizing, and a method for multiplying large numbers. Used to generate data for runtime analysis.

learning guide understanding rsa encryption moscoe - 
Student-facing document including an introduction to the topic, a review of the relevant mathematics, and a walkthrough of a simple example of RSA encryption/decryption. 
Checks for Understanding could serve as formative or summative assessments.

learning guide rsa runtime analysis moscoe -  

Student-facing document relating fundamental big-O run-time concepts to the prime factorization and multiplication algorithms found in funwithrsa.java. 
Students develop an understanding of the very long run-times required to decrypt RSA by analyzing graphical data. 
Checks for Understanding could serve as formative or summative assessments.