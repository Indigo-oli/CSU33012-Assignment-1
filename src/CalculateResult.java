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
        
        //This method assumes that order of operations need not be obeyed

        //method needs to go through string, and at each equation calculate results based on two sides
        String[] equationNumbers = validInput.split("\\+|\\*|-");   //get all numbers involved first
        String   operatorsInUse = validInput.replaceAll("\\d",""); //then get all operators involved

        int result = Integer.parseInt(equationNumbers[0]);
        int operatorCount = 0;
        for(int i = 1; i < equationNumbers.length; i++){
            switch(operatorsInUse.charAt(operatorCount)){
                case '*':
                    result *= Integer.parseInt(equationNumbers[i]);
                case '+':
                    result += Integer.parseInt(equationNumbers[i]);
                case '-':
                    result -= Integer.parseInt(equationNumbers[i]);
                default:
            }
            operatorCount++;
        }

        return result;
    }
}
