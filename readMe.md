AESMain.java : This is where the control for the Java application starts. This file has the main method and this calls the run() in the AESImplementation.java file

AESImplementation.java : This file does the initial clean up of the input and then picks and assigns the value we give in input and choose the mode whether we want 
to trigger CBC or CFB or ECB. In this file we have implemented only CBC, so our AES code for CBC mode will be executed.

AES.java : This is an abstract file has the common implementation for AES algorithm. This file has the base methods like keyExpansion(), gFunction(), addRoundKey(), mixColumns(),
shiftRowsForEncryption/Decryption() and substitueBytes() along with some helper methods deepCopyState(), parseInitializationVector(), toString() and some abstract 
methods like encrypt() and decrypt(). The main purpose of this file is to hold the definition of these methods and perform operation which has to be done by AES.

CBC.java: This file extends AES.java so this file defines the encrypt() and decrypt() based on the CBC logic.
