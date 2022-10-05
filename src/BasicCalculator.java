/*************************************************************************
 *  Basic Calculator Main class.
 *  Runs in loop of getting user input, checking if it is valid
 *  Then if it is valid, printing the result of the calculation to the user
 *
 *  @author	 Indigo Bosworth
 *           Sai Pranay Gamini
 *  @Creation Date: 3/10/2022
 *          
 *
 *************************************************************************/


public class BasicCalculator {

  //Main method for program, does as required by assignment description (see above)
  //Part of Task #6 on Github
	public static void main(String[] args) {
    
    boolean running = true;

    //loop the program while running is true
    while(running){

      System.out.printf("Please enter an infix equation below, using only operators '+','-' and '*'." +
                        "%nBe aware order of operations and brackets will be ignored.%n" +
                        "Type 'exit' to end the program");

      //get input
      String input = ValidateInput.GetUserInput();

      //check if input is exit, and exit
      if(input.equalsIgnoreCase("exit")){
        running = false;
        System.out.printf("Exiting program...%n");
        break;
      }

      //check if input is valid
      if(ValidateInput.IsValidInput(input)){
        //if input was valid, run calculator and return result
        ValidateInput.PrintResult(CalculateResult.RunCalculator(input));
      }else{
        //if input was invalid, give an error and loop
        System.out.printf("ERROR: Input was invalid :(%n");
      }
    }//end of while loop

  }//end of main

}