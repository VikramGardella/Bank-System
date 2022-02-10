package gardella.vik.bank;

public class Account {

    //Private Member Variables
    private int accountID;
    private String firstName;
    private String lastName;
    private double balance;
    private double interestRate;

    //Constructor
    public Account(int aID, String fn, String ln, double bal, double ir){
        accountID = aID;
        firstName = fn;
        lastName = ln;
        balance = bal;
        interestRate = ir;
    }

    //Accessors
    public int getAccountID(){return accountID;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public double getBalance(){return balance;}
    public double getInterestRate(){return interestRate;}

    //Mutators
    public void setAccountID(int newAccountID){accountID = newAccountID;}
    public void setFirstName(String newFirstName){firstName = newFirstName;}
    public void setLastName(String newLastName){lastName = newLastName;}
    public void setBalance(double newBalance){balance = newBalance;}
    public void setInterestRate(double newInterestRate){interestRate = newInterestRate;}

    //Functions
    public void compoundInterest(){}
}
