import java.util.Scanner;

//This code will do Substitution Cipher encryption and decryption
//It will take a key as input first and then a string to encrypt or decrypt
//The key should be a string of 26 characters
//The string should be a string of alphabets
public class SubstitutionCipher{

    //default key
    private static String defaultKey = "DPRMOLTZSGQJUWFIEBACVKYXHN";

    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        String key = "";
        System.out.println("Substitution Cipher");
        System.out.println("Would you like to use the default key? Enter 1 for yes or 0 for no");
        int defaultChoice = inputScanner.nextInt();
        if(defaultChoice != 1){
            System.out.println("Enter the key: ");
            key = inputScanner.nextLine();
            if(key.length() != 26 || !key.matches("[a-zA-Z]+")){
                System.out.println("Invalid key");
                inputScanner.close();
                return;
            }
        }
        else{
            key = defaultKey;
        }
        key = key.toUpperCase();
        while(true){
            System.out.println("Would you like to encrypt(1) or decrypt(2)? Enter 1 or 2");
            int choice = inputScanner.nextInt();
            if(choice == 1){
                encryption(key, inputScanner);
            }
            else if(choice == 2){
                decryption(key, inputScanner);
            }
            else {
                System.out.println("Invalid choice");
            }
            System.out.println("Would you like to continue? Enter 1 to continue or 0 to exit");
            int continueChoice = inputScanner.nextInt();
            if(continueChoice == 0){
                break;
            }
        }
        inputScanner.close();
    }

    //This function will take a string and print encrypted string
    private static void encryption(String key, Scanner inputScanner){

        System.out.println("Enter the string to encrypt without space: ");
        inputScanner.nextLine();
        String inputString = inputScanner.nextLine();
        if(inputString.length() == 0 || !inputString.matches("[a-zA-Z]+")){
            System.out.println("Invalid string");
            return;
        }
        inputString = inputString.toUpperCase();
        String encryptedString = "";
        //Check each character of the string and encrypt it using the key ex) A -> D
        for(int i = 0; i < inputString.length(); i++){
            char c = inputString.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                encryptedString += key.charAt(c - 'A');
            }
            else {
                encryptedString += c;
            }
        }
        System.out.println("Original string: " + inputString);
        System.out.println("Encrypted string: " + encryptedString);
    }
    //This function will take a string and print decrypted string
    private static void decryption(String key, Scanner inputScanner){

        System.out.println("Enter the string to decrypt without space: ");
        inputScanner.nextLine();
        String inputString = inputScanner.nextLine();
        if(inputString.length() == 0 || !inputString.matches("[a-zA-Z]+")){
            System.out.println("Invalid string");
            return;
        }
        inputString = inputString.toUpperCase();
        String decryptedString = "";
        //Check each character of the string and decrypt it using the key ex) D -> A
        for(int i = 0; i < inputString.length(); i++){
            char c = inputString.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                decryptedString += (char)(key.indexOf(c) + 'A');
            }
            else {
                decryptedString += c;
            }
        }
        System.out.println("Original string: " + inputString);
        System.out.println("Decrypted string: " + decryptedString);
        
    }
}