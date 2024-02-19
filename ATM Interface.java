import java.util.Scanner;
class Bank_account{
  int balance;
  public Bank_account(){
    this.balance=balance;
  }
  //deposit method
  public void deposit(int amount){
    balance+=amount;
  }
  //withdraw method
  public void withdraw(int amount){
    if(amount<=balance){
      balance-=amount;
      return;
    }
    System.out.println("Insufficient balance");
  }
  //getBalance method
  public int getBalance(){
    return balance;
  }
}
class Main{
  public static void main(String[] args){
    Bank_account b=new Bank_account();
    System.out.println("Welcome to the bank");
    System.out.println("enter your choice: \n1.Deposit \t 2.Withdraw \n3.Check Balance \t 4.Exit");
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    while(true){
      if(choice==1){
        System.out.println("Enter the amount to deposit:");
        int amount=sc.nextInt();
        b.deposit(amount);
        System.out.println("Amount deposited sucessfully.");
        System.out.println("Thank you for using our service \n Do you want to continue?");
        String s=sc.next();
        if(s.equals("yes")){
          System.out.println("enter your choice: \n1.Deposit \t 2.Withdraw \n3.Check Balance \t 4.Exit");
          choice=sc.nextInt();
          }else if(s.equals("no")){
            System.out.println("Thank you for using our service");
            break;
          }else{
            System.out.println("invalid choice");
          }
      }else if(choice==2){
        System.out.println("enter the amount you want to withdraw");
        int amount1=sc.nextInt();
        b.withdraw(amount1);
        System.out.println("Amount withdrawn sucessfully");
        System.out.println("Thank you for using our service\n Do you want to continue?");
        String s=sc.next();
        if(s.equals("yes")){
          System.out.println("enter your choice: \n1.Deposit \t 2.Withdraw \n3.Check Balance \t 4.Exit");
          choice=sc.nextInt();
        }else if(s.equals("no")){
          System.out.println("Thank you for using our service");
          break;
        }else{
          System.out.println("invalid choice");
        }
      }else if(choice==3){
        System.out.println("your current balance is:"+b.getBalance());
        System.out.println("Thank you for using our service");
        break;
      }else if(choice==4){
        System.out.println("Thank you for using our service");
        System.exit(0);
      }else{
        System.out.println("invalid choice. Please try again");
      }
    }
  }
}
