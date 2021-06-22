
package banksystem;


public class BankSystem {


    public static void main(String[] args) {
        
        BankAcc ba = new BankAcc("Damien",666,100000,23);
        
        System.out.println(ba.getCurrentBalance());
        
        ba.deposit(45);
        
        System.out.println(ba.getCurrentBalance());
        
        ba.withdraw(10);
        
        System.out.println(ba.getCurrentBalance());
        
        
    }
}
