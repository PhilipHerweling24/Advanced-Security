import java.util.HashMap; 

public class Frequency {
    
    public static void main(String[] args) {  

        String cipherText = "UZQSOVUOHXMOPVGPOZPEVSGZWSZOPFPESXUDBMETSXAIZVUEPHZ"+
                            "HMDZSHZOWSFPAPPDTSVPQUZWYMXUZUHSXEPYEPOPDZSZUFPOMBZ"+
                            "WPFUPZHMDJUDTMOHMQ";  

        int[] freq = new int[cipherText.length()];  
        int i, j;  
          
        //Converts given string into character array  
        char letter[] = cipherText.toCharArray();  
          
        for(i = 0; i <cipherText.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <cipherText.length(); j++) {  
                if(letter[i] == letter[j]) {  
                    freq[i]++;  
                      
                    //Set letter[j] to 0 to avoid printing visited character  
                    letter[j] = '0';  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(letter[i] != ' ' && letter[i] != '0')  
                System.out.println(letter[i] + "-" + freq[i]);  
        }  
    } //End Main 
       
} 

