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

    //Stub method to check if user input is valid or not
    //Part of Task #4 on Github
    public static boolean IsValidInput(String input){

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

        String cleanedInput = input.replaceAll("\\s+",""); //remove all spaces from input

        //get string as a char array
        char[] cInput = cleanedInput.toCharArray();

        for(int i = 0; i < cInput.length; i++){    //loop through each character in the string
            char current = cInput[i];

            if (Character.isDigit(current)) continue;             //If characters are integers or equation signs continue
            if (current == '*' || current == '+' || current == '-') continue;

            return false;   //if character is not integer or equation sign break and return false
        }
        //if able to reach here return true
        return true;
    }

}

    }

}
