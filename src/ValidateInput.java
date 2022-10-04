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


public class ValidateInput {
    
    //Stub method to get user input during program
    //Part of Task #4 on Github
    public static String GetUserInput(){

        return "";
    }

    //Stub method to print result of program to user
    //Part of Task #4 on Github
    public static void PrintResult(int result){

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
