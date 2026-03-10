sealed interface Payment permits UPI , CreditCard , NetBanking
{
    void calculate();
}

final class UPI implements Payment
{
    int amt;

    public UPI(int amt)
    {
        this.amt=amt;
    }

    public void calculate()
    {
        System.out.println("Amount : "+amt);
        System.out.println("Fees : "+(amt*(1.0/100)));
    }
}

final class CreditCard implements Payment
{
    int amt;

    public CreditCard(int amt)
    {
        this.amt=amt;
    }

    public void calculate()
    {
        System.out.println("Amount : "+amt);
        System.out.println("Fees : "+amt*(2.5/100));
    }
}

final class NetBanking implements Payment
{
    int amt;

    public NetBanking(int amt)
    {
        this.amt=amt;
    }

    public void calculate()
    {
        System.out.println("Amount : "+amt);
        System.out.println("Fees : "+(amt-50));
    }
}

class Factory
{
    static Payment getPayment(String type , int amt)
    {
        if(type.equalsIgnoreCase("UPI"))
        {
            return new UPI(amt);
        }
        else if(type.equalsIgnoreCase("CreditCard"))
        {
            return new CreditCard(amt);
        }
        else if(type.equalsIgnoreCase("NetBanking"))
        {
            return new NetBanking(amt);
        }
        else
        {
            return null;
        }
    }
}


public class T1
{
    public static void main(String[] args) 
    {
        Payment p1 = Factory.getPayment("UPI", 1000);

        p1.calculate();
    }
} 