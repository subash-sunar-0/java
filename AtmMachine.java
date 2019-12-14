import java.util.Scanner;
public class AtmMachine{
  public static void main(String args[]){
        
    transaction();
  }
  public static void transaction(){
    boolean run =false;
    while (run){
      int balance = 0; 
      int deposit;
    
      Scanner input = new Scanner(System.in);
    
      int choice; 
      System.out.println("Please select an option"); 
      System.out.println("1. Withdraw");
      System.out.println("2. Deposit");
      System.out.println("3. Balance");
      choice = input.nextInt();
      switch(choice){
        case 1:
          int amount; 
          System.out.println("Please enter amount to withdraw: "); 
          amount = input.nextInt();
          if(amount > balance || amount == 0){
            System.out.println("You have insufficient funds\n\n"); 
            
          } else {
            
            
           
            System.out.println("You have withdrawn "+ amount);
            
          }
              break; 
        case 2:
          
          
          System.out.println("Please enter amount you would want to deposit: "); 
          deposit = input.nextInt();
          
          balance = deposit + balance;
          System.out.println("You have deposited "+deposit);
          
          break; 
        case 3:

          
        
          System.out.println("Your balance is "+balance);
          
          break;
        default:
          System.out.println("Invalid option"); 
          
      }   break;
    }
  }
  
  
}