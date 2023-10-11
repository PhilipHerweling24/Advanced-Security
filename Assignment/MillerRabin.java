/*****************************************************************************************
** Author:      Philip Herweling                                                        **
** Email:       c18470774@mytudublin.ie                                                 **
**                                                                                      **
** Description:                                                                         **
** This program checks if a number is prime by using the Miller-Rabin Algorithm. It     **
** has two methods checkForPrime which is called in main. checkForPrime is where I      **
** implemented the miller-rabin algorithm. generateLong is called in checkForPrime      **
** and generates a number between 1 and n-1 using Math.random().                        **
*****************************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class MillerRabin {

    public static void main(String[] args){

        //Initialising scanner scan and input variable
        long input = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("\nChecking if a number is prime or not using Miller-Rabin Algorithm");

        //Asking users to enter a number and storing it 
        //In the variable 'input'
        System.out.println("\nPlease Enter A Number:");
        input = scan.nextLong();

        //Calling on checkForPrime method and passing in 'input'
        String output = checkForPrime(input);

        //Outputing result of checkForPrime
        System.out.print("\nOutput: "+output);

    }//End of Main

    private static String checkForPrime(long input){

        long n = input;

        //If input = 0 or 1 return false because they arent prime
        if(n == 0 || n == 1){
            return "inconclusive";
        }
        //If input = 2 return true as its prime
        if(n == 2){
            return "composite";
        }
        //If input = an even number other than 2 return false 
        //as its not a prime number
        if(n % 2 == 0){
            return "inconclusive";
        }


        //Finding integers k, q with k > 0, q is odd so that (n - 1 = 2^k q)
        long q = n-1;
        int k = 0;

        //While q is odd
        //divide q by 2 and increment k
        while(q % 2 == 0){ 
            q = q/2; 
            k++;     
        }

        //Select a random integer a where 1 < a < n-1
        //by calling generateLong method
        long a = generateLong(n);

        //If a^q mod n = 1 then return "inconclusive"
        if(((a^q) % n) == 1){
            return "inconclusive";
        }

        for(int j =0; j < k-1; j++){
            //if a^((2^j)q) mod n == n - 1 then return "inconclusive"
            long p = 2^j * q;
            long res = a^p;

            if(res % n == n-1) {
                return "inconclusive";
            }
        }
        //Return "composite"
        return "composite";
    }

    //Generates a random integer a where 1 < a < n-1
    public static long generateLong(long n){

        //These variables are used to set the range 
        long leftLimit = 2;
        long rightLimit = (n-1);

        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));

        return generatedLong;

    }//End of generateLong

    
}//End of Class
