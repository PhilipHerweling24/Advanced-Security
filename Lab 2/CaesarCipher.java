import java.util.ArrayList;
import java.util.Scanner;

public class CaesarCipher{

    //Main Method
    public static void main(String[] args) {

        //creating a scanner to take in user input
        Scanner scann = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        //asking the user to select an option
        System.out.println("\n\nPlease pick one of the following options:\n"+
        "\nTo encrypt using caesar cipher enter '1', \nTo decrypt a caesar cipher encrypted text enter '2',"+
        " \nTo encrypt using vingere cipher enter '3', \nTo decrypt a vingere cipher encrypted text enter '4'!\n");   

        //storing users input in a variable called 'option'
        int option = scann.nextInt();

        //System.out.println(option);

        //this if/ else if statement 
        //checks what option the user chose and then calls the method needed
        //and takes in the what ever parameters are needed

        //caesar cipher encryption
        if(option == 1){

            //Getting user input required for th CaesarEncryption() method
            System.out.println("\nPlease enter text you want encrypted.");
            String plain_text = scan.nextLine();

            System.out.println("\nPlease enter shift. (number between 1 and 25)");
            int shift = scann.nextInt();

            CaesarEncryption(shift, plain_text);

        }

        //caesar cipher decryption
        else if(option == 2){

            //Getting user input required for the CaesarDecryption() method
            System.out.println("\nPlease enter cipher text you want decrypted.");
            String cipher_text = scan.nextLine();

            System.out.println("\nPlease enter shift. (number between 1 and 25)");
            int shift = scann.nextInt();

            CaesarDecryption((26 - shift), cipher_text);

        }

        //vingere cipher encryption
        else if(option == 3){

            //Getting user input required for the VignereEncryption method
            System.out.println("\nPlease enter cipher text you want encrypted.");
            String plain_text = scan.nextLine();

            System.out.println("\nPlease enter key");
            String key = scan.nextLine();

            VignereEncryption(key, plain_text);

        }

        //vingere cipher decryption
        else if(option == 4){

            //Getting user input required for the VignereDecryption method
            System.out.println("\nPlease enter cipher text you want decrypted.");
            String plain_text = scan.nextLine();

            System.out.println("\nPlease enter key");
            String key = scan.nextLine();

            VignereDecryption(key, plain_text);

        }

        

    }

    //Method Which encrypts a message using caesar cipher
    public static String CaesarEncryption(int shift, String text) {

        //Creating a string buffer which will hold the cipher text
        String cipher_text = "";


        //Going through the plain text letter by letter
        //to encrypte it
        for (int i = 0; i<text.length(); i++){

            //If the next character in the buffer is a space
            //add a space int the cipher text
            if((text.charAt(i)) == ' ')
            {

                cipher_text =' ';
            }


            //encrypts all letters which are upper case
            else if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + shift - 65) % 26 + 65);
                cipher_text += (ch);
            }


            //encrypts all letters which are lower case
            else
            {

                char ch = (char)(((int)text.charAt(i) + shift - 97) % 26 + 97);
                    cipher_text += (ch);
            }
            
        }
            
        

        System.out.println("\n\nCipher Text:\t"+cipher_text);

      return cipher_text;
    }

    //Method which decrypts a cipher text 
    public static String CaesarDecryption(int shift, String text) {

        String plain_text = "";


        for (int i = 0; i<text.length(); i++){

            if((text.charAt(i)) == ' ')
            {

                plain_text += ' ';
            }

            else if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + shift - 65) % 26 + 65);
                plain_text += (ch);
            }

            else
            {

                char ch = (char)(((int)text.charAt(i) + shift - 97) % 26 + 97);
                plain_text += (ch);
            }
        }

        System.out.println("\n\nPlain Text:\t"+plain_text);


        return plain_text;
    }

    //Method Which encrypts a message using vingere cipher
    public static String VignereEncryption(String key, String text) {

        //Getting rid of all spaces in plain text
        text = text.replace(" ", "");

        //capitilising the key and text
        key = key.toUpperCase();
        text = text.toUpperCase();

        //Converting text to char array plain_text
        char plain_text[] = text.toCharArray();
        int plain_text_length = plain_text.length;
        int i,j;
  
        //Creating A keyword array which will hold the key after its made
        //Creating a cipher text array which holds the cipher text
        char keyword[] = new char[plain_text_length];
        char cipher_text[] = new char[plain_text_length];
  
        //Making the key and storing it in my keyword array
        //key keeps being repeated until the same size as plain text
        for(i = 0, j = 0; i < plain_text_length; ++i, ++j)
        {
               
            if(j == key.length())
            {
                j = 0;
            }
            
            keyword[i] = key.charAt(j);
            
        }
  
        //encrypting the plain text and storing outcome in ciphertext array 
        for(i = 0; i < plain_text_length; ++i)
        {

            if(plain_text[i] == ' ')
            {
                cipher_text[i] =' ';
            }

            else 
            {
                cipher_text[i] = (char) (((plain_text[i] + keyword[i])  % 26) + 'A');
            }
        }
            

        System.out.println("\n\nCipher Text:\t");
        System.out.print(String.valueOf(cipher_text));

        return null;
    }

    //Method which decrypts a vingere text 
    public static StringBuffer VignereDecryption(String key, String text) {

        //Getting rid of all spaces in cipher text
        text = text.replace(" ", "");

        //capitilising the key and text
        key = key.toUpperCase();
        text = text.toUpperCase();

        //Converting text to char array cipher_text
        char cipher_text[] = text.toCharArray();
        int cipher_text_length = cipher_text.length;
        int i,j;
  
        //Creating A keyword array which will hold the key after its made
        //Creating a plain text array which holds the plain text
        char keyword[] = new char[cipher_text_length];
        char plain_text[] = new char[cipher_text_length];
  
        //Making the key and storing it in my keyword array
        //key keeps being repeated until the same size as cipher text
        for(i = 0, j = 0; i < cipher_text_length; ++i, ++j)
        {
               
            if(j == key.length())
            {
                j = 0;
            }
            
            keyword[i] = key.charAt(j);
            
        }
  
        //decrypting the cipher text and storing outcome in plain_text array 
        for(i = 0; i < cipher_text_length; ++i){

            if(cipher_text[i] == ' ')
            {
                plain_text[i] =' ';
            }

            else 
            {
                plain_text[i] = (char) ((((cipher_text[i] - keyword[i]) +26)  % 26) + 'A');
            }
        }
            

        
        System.out.println("\n\nPlain Text:\t");
        System.out.println(String.valueOf(plain_text));


        return null;
    }

}