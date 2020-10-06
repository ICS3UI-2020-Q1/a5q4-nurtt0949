import java.util.Scanner;
/**
 *Tells user their final balance after investment
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner
     Scanner input = new Scanner(System.in);
    //ask user for starting balance
    System.out.println("Please enter a starting balance");
    //declare a variable to store strating balance
    double balance = input.nextDouble();
    //ask user for their intrest rate
    System.out.println("Please enter your interest rate");
    //declare a variable for interest rate
    double intrest = input.nextDouble();
     intrest = intrest/100;
    //ask user for amount of years that they will invest
    System.out.println("Please enter the number of years you will invest for");
    //declare a variable for years of investment
    double investment = input.nextDouble();
    //create a loop 
    for(int year = 1; year <= investment; year++){
      //loop action:calculate the balance
         
         balance = balance + intrest * balance;
      

        
    }
     System.out.println("Your final balance would be " + balance); 

    
  }
}
