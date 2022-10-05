/*************************************************************************
 *  Class for getting and validating UserInput
 *  Currently populated by stub methods to be filled
 *
 *  @author	 Indigo Bosworth
 *           Sai Pranay Gamini
 *  @Creation Date: 3/10/2022
 *          
 *
 *************************************************************************/

import java.util.Scanner;

public class ValidateInput {
    
    static Scanner input;

    //Method to get user input during program from console
    //Part of Task #4 on Github
    public static String GetUserInput(){
        input = new Scanner( System.in );
		String returnString = "";
		if(input.hasNextLine()) {
			returnString = input.nextLine();
		}
		//clear to the next line of the scanner
		return returnString;
    }

    //Method to print result of program to user
    //Part of Task #4 on Github
    public static void PrintResult(int result){
        System.out.printf("The Result of the equation is: %d%n", result);
        return;
    }

    //Method to check if user input is valid or not
    //Part of Task #4 on Github
    public static boolean IsValidInput(String input){

        //error check on input string
        if(input == null || input.trim().length() == 0){
            return false;
        }

        String cleanedInput = input.replaceAll("\\s+",""); //remove all spaces from input

        //get string as a char array
        char[] cInput = cleanedInput.toCharArray();

        boolean wasLastCharOperator = false;

        for(int i = 0; i < cInput.length; i++){    //loop through each character in the string
            char current = cInput[i];

            if (Character.isDigit(current)){ //If characters are integers continue
                wasLastCharOperator = false;
                continue;  
            }            
            if (current == '*' || current == '+' || current == '-'){ 
                
                //check and break if two operators are in a row
                if(wasLastCharOperator == true){
                    return false;
                }
                
                //otherwise if char is operator continue
                wasLastCharOperator = true;
                continue;
            } 

            return false;   //if character is not integer or equation sign break and return false
        }
        //if able to reach here return true
        return true;
    }

}
