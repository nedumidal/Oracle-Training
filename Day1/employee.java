record Employeerecord(String name,int salary)
{
    void checkEligible()
    {
        if(salary > 20000)
        {
            System.out.println("Not Eligible For Loan..!");
        }
        else if(salary < 20000)
        {
            System.out.println("Eligible For Loan..!");
        }
    }
}

public class employee
{
    public static void main(String arg[])
    {
        Employeerecord e1 = new Employeerecord("Nishanth",10000);

        e1.checkEligible();

        Employeerecord e2 = new Employeerecord("Moon",40000);

        e2.checkEligible();
    }
}