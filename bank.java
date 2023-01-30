/*Create a class that represents a bank account, including the account holder's name, account number, and current balance. Write methods to deposit and withdraw money, and to display the account balance.*/

import java.util.Scanner;
class account{
  String aname;
  double bnumber;
  double caccount;
  double n1amount;
  double n2amount;
  double wamount;
  double damount;
  Scanner sc=new Scanner(System.in);
  void bank(){
    System.out.println("enter accountant name");
    aname=sc.next();
    System.out.println("enter accountant number");
    bnumber=sc.nextDouble();
    System.out.println("enter accountant balance");
    caccount=sc.nextDouble();   
  }
    void withdraw(){
       System.out.println("enter withdraw amount");
     double wamount=sc.nextDouble();
    double n2amount=caccount-wamount;
    System.out.println("the deposit amount" +n2amount);  
    }
  void deposit(){
    System.out.println("enter deposit amount");
     double damount=sc.nextDouble();
   double n1amount=caccount+damount;
    System.out.println("the deposit amount" +n1amount);
  }
    void report(){
       System.out.println("enter deposit amount");
      double damount=sc.nextDouble();
      System.out.println("enter withdraw amount");
      double wamount=sc.nextDouble();
     double n1amount=caccount+damount;
     double n2amount=caccount-wamount;
      System.out.println("the account name" +aname);
      System.out.println("the account number" +bnumber);
      System.out.println("the account balance" +caccount);
      System.out.println("the account withdraw" +wamount);
      System.out.println("the account deposit" +damount);
      System.out.println("the enter new account after deposit" +n1amount);
       System.out.println("the enter new account after withdraw amount" +n2amount);
      
    }
  }
class bank{
  public static void main(String args[]){
    account a=new account();
    a.bank();
    a.deposit();
    a.withdraw();
    a.report();
  }
}