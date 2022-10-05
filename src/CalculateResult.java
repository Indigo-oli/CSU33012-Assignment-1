/*************************************************************************
 *  Class for evaluating valid input
 *  works as the calculator part of the program
 *
 *  @author	 Indigo Bosworth
 *           Sai Pranay Gamini
 *  @Creation Date: 3/10/2022
 *          
 *
 *************************************************************************/


public class CalculateResult {
    
    //Stub method to return result of a valid user input
    //Part of Task #5 on Github
    public static int RunCalculator(String validInput){

        //error checking for if valid input is null
        if(validInput == null)
            return 0;
        
        validInput = validInput.replaceAll("\\s+",""); //remove all spaces from input
        
        //This method assumes that order of operations need not be obeyed

        //method needs to go through string, and at each equation calculate results based on two sides
        String[] equationNumbers = validInput.split("\\+|\\*|-");   //get all numbers involved first
        String   operatorsInUse = validInput.replaceAll("\\d",""); //then get all operators involved

        int result = Integer.parseInt(equationNumbers[0]);
        int operatorCount = 0;

        //error check - skip loop if only one number
        if(equationNumbers.length == 1) {
            return result;
        }

        for(int i = 1; i < equationNumbers.length; i++){
            switch(operatorsInUse.charAt(operatorCount)){
                case '*':
                    result *= Integer.parseInt(equationNumbers[i]);
                    break;
                case '+':
                    result += Integer.parseInt(equationNumbers[i]);
                    break;
                case '-':
                    result -= Integer.parseInt(equationNumbers[i]);
                    break;
                default:
                	break;
            }
            operatorCount++;
        }

        return result;
    }
}