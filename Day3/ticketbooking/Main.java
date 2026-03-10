record TicketData(String name , String destination){}

sealed abstract class Ticket permits Train , Bus , Flight
{
    abstract void Book();
}

final class Train extends Ticket
{
    private TicketData data;

    Train(TicketData data)
    {
        this.data = data;
    }

    @Override
    void Book()
    {
        System.err.println("Train : "+"Name : "+ data.name() + "-- Destination : " + data.destination() + "has been Booked..!");
    }
}

final class Bus extends Ticket
{
    private TicketData data;

    public Bus(TicketData data)
    {
        this.data = data;
    }

    @Override
    void Book()
    {
        System.err.println("Bus : "+"Name : "+ data.name() + "-- Destination : " + data.destination() + "has been Booked..!");
    }
}

final class Flight extends Ticket
{

    private TicketData data;

    public Flight(TicketData data)
    {
        this.data = data;
    }

    @Override
    void Book()
    {
        System.err.println("Flight : "+"Name : "+ data.name() + "-- Destination : " + data.destination() + "has been Booked..!");
    }
}


class Factory
{
    static Ticket getTicket(String type , String name , String destination)
    {

        TicketData data = new TicketData(name,destination);

        if(type.equalsIgnoreCase("Train"))
        {
            return new Train(data);
        }
        else if (type.equalsIgnoreCase("Bus"))
        {
            return new Bus(data);
        }
        else if(type.equalsIgnoreCase("Flight"))
        {
            return new Flight(data);
        }
        else
        {
            return null;
        }
    }
}


public class Main
{
    public static void main(String arg[])
    {
        Ticket p1 = Factory.getTicket("Train", "Nishanth", "Salem");

        p1.Book();

        Ticket p2 = Factory.getTicket("Train", "Sabari", "Erode");

        p2.Book();
    }
}