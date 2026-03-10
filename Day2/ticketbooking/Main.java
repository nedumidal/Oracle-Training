record TicketData(String Vechiclename)
{}

abstract class tickets
{
    abstract void book(String name);
    abstract void check();
}

class Train extends tickets
{
    TicketData td;
    void book(String name)
    {
        System.out.println("Booked In Train..!");
        td=new TicketData(name);
    }

    void check()
    {
        System.out.println("Vechicle Name : "+td.Vechiclename());
    }
}

class Bus extends tickets
{
    TicketData td;
    void book(String name)
    {
        System.out.println("Booked In Bus..!");
        td=new TicketData(name);
    }

    void check()
    {
        System.out.println("Vechicle Name : "+td.Vechiclename());
    }
}

class Flight extends tickets
{
    TicketData td;
    void book(String name)
    {
        System.out.println("Booked In Flight..!");
        td=new TicketData(name);
    }

    void check()
    {
        System.out.println("Vechicle Name : "+td.Vechiclename());
    }
}


class Factory
{
    static tickets createBooking(String type)
    {
        if(type.equalsIgnoreCase("Bus"))
        {
            return new Bus();
        }
        else if(type.equalsIgnoreCase("Train"))
        {
            return new Train();
        }
        else if(type.equalsIgnoreCase("Flight"))
        {
            return new Flight();
        }
        else
        {
            return null;
        }
    }
}


public class Main
{
    public static void main(String[] args) {
        tickets t1 = Factory.createBooking("Bus");

        t1.book("Flash");
        t1.check();

        tickets t2 = Factory.createBooking("Train");

        t2.book("Express");
        t2.check();

        tickets t3 = Factory.createBooking("Bus");

        t3.book("KingFisher");

        t3.check();
    }
}