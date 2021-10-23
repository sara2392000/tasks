/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account;
import java.util.Scanner;

public class Account {
private int id ;
private  double balance = 5000;
private double annualItreseRate;
  private  int dateCreated;
    
  Account(){}  
    
    Account(int Id ,double Balance){
    
  id = Id; 
    balance =Balance;
    
  
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualItreseRate(double annualItreseRate) {
        this.annualItreseRate = annualItreseRate;
    }

    public double getAnnualItreseRate() {
        return annualItreseRate;
    }

    public int getDateCreated() {
        return dateCreated;
    }

 
    public void GitMonthlyInterseRate(  double annualItreseRate){
    
    
    
  double  monthlyRate = annualItreseRate/12;
    
    System.out.println("monthly rate is : " + monthlyRate  );
   
    }
    
    public  void withdraw (double money){
    
   double newBalance  = balance - money;
    
    System.out.println( money +" is withdrawn  and the new balance is " + newBalance);
    }
    
    public void Deposit(double DMoney){
    
  double newbalance =balance+DMoney;
       System.out.println( DMoney+" is drawen and the new account is "  + newbalance);
        
    }
    public static void main(String[] args) {
   
        Account a = new Account();
     
      a.GitMonthlyInterseRate(5000);
       a.withdraw(2000);
        a.Deposit(3000);
        
        
        
        
        
        
        
        
        
        
    }
    
}
