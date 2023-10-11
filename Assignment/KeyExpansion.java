/*****************************************************************************************
** Author:      Philip Herweling                                                        **
** Email:       c18470774@mytudublin.ie                                                 **
**                                                                                      **
** Description:                                                                         **
** 
**                         
*****************************************************************************************/

public class KeyExpansion {
    
    public static void main(String[] args){

        //keyExpansion();

    }//End of main

    public static void keyExpansion(byte key[], String w[]){

        String temp[] = {""};
        int i = 0;

        for(i = 0; i < 4; i++){
            w[i] = key[4*i] + 
            key[4*i+1] +
            key[4*i+2] +
            key[4*i+3];
        }//End of For loop 1

        for(i = 4; i < 44; i++){
            temp = w[i - 1];

            if(i % 4 == 0){
                
            }

        }//End of for loop 2
    }

}//End of class
