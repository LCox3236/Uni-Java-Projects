
package banksystem;


public class BankAcc {
    private String accountName;
    private int accountNumber;
    private int accountOverdraft;
    private int currentBalance;
    
    public BankAcc(String accountName, int accountNumber, int accountOverdraft, int currentBalance ){
        
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountOverdraft = accountOverdraft;
        this.currentBalance = currentBalance;
        
    }
    
    public void deposit(int money){
        
        this.currentBalance += money;
    }

    public int getCurrentBalance() {
        return this.currentBalance;
    }
    
    public void withdraw(int money){
        
        int curr = this.currentBalance + this.accountOverdraft;
        
        if (money < curr){
            
            this.currentBalance -= money;
        }
        
    }
    
    
}
