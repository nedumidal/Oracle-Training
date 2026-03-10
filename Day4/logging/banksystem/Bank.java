import java.util.logging.Logger;

public class Bank
{

    static Logger logger = Logger.getLogger(Bank.class.getName());

    String name;
    int amt;

    Bank(String name , int amt)
    {
        this.name=name;
        this.amt=amt; 
    }

    void withDraw(int amt)
    {
        if(this.amt < amt)
        {
            logger.severe("Insufficient Balance..!");
        }
        else
        {
            this.amt -= amt;
            logger.warning(amt+" Withdrawed ..!");

        }
    }

    void deposit(int amt)
    {
        this.amt += amt;
        logger.warning(amt+" Deposit ..!");
    }

    void show()
    {
        logger.info("Name : "+name + " : Balance : "+amt);
    }

    public static void main(String[] args) 
    {
        Bank c1 = new Bank("Nishanth",5000);

        c1.withDraw(1000);

        c1.withDraw(5000);

        c1.withDraw(4000);

        c1.deposit(1000);

        c1.show();
        
    }
}