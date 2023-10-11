public class HillCipher {
    
    public static void main(String[] args){

        //Plaintext and Key 
        String plaintext = "CAKE";
        String key = "BAKE";

        //Getting rid of all spaces and setting 
        //all charaters to uppercase
        plaintext = plaintext.replace(" " , "");
        plaintext = plaintext.toUpperCase();

        key = key.replace(" " , "");
        key = key.toUpperCase();
        
        //Calling encryption method and passing in the plaintext and key
        hillCipherEncryption(plaintext, key);
        
    }

    private static void hillCipherEncryption(String plaintext, String key) {

        //checking if the length of the message is even
        //if its not im adding 'Z' to the end of the plaintext message
        if (plaintext.length() % 2 != 0){
            plaintext += "Z";
        }

        //Turning the plaintext into a matrices
        int[][] plaintext2D = new int[2][plaintext.length()];
        int itr1 = 0;
        int itr2 = 0;
        for (int i = 0; i < plaintext.length(); i++){
            if (i%2 == 0){
                plaintext2D[0][itr1] = ((int)plaintext.charAt(i)) - 65;
                itr1++;
            } else {
                plaintext2D[1][itr2] = ((int)plaintext.charAt(i)) - 65;
                itr2++;
            } //End if-else
        } //End for

        //Putting the key into 2x2 matrix
        int[][] key2D = new int[2][2];
        int itr3 = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                key2D[i][j] = (int)key.charAt(itr3)-65;
                itr3++;
            }
        }

        String encryptedText = "";
        int count = plaintext.length() / 2;

        for (int i = 0; i < count; i++) {
            int temp1 = plaintext2D[0][i] * key2D[0][0] + plaintext2D[1][i] * key2D[0][1];
            encryptedText += (char)((temp1 % 26) + 65);
            int temp2 = plaintext2D[0][i] * key2D[1][0] + plaintext2D[1][i] * key2D[1][1];
            encryptedText += (char)((temp2 % 26) + 65);
        }


        System.out.println("\nEncrypted Text: " + encryptedText);

    }

    //Modulo function
    public static int moduloFunc(int a, int b){
        int result = a % b;
        if (result < 0){
            result += b;
        }
        return result;
    }
}