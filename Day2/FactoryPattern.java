
abstract class Notification
{
    abstract void send();
}


class Email extends Notification
{
    @Override
    void send()
    {
        System.out.println("Msg send via Email..!");
    }

}

class SMS extends Notification
{
    @Override
    void send()
    {
        System.out.println("Msg send via SMS..!");
    }
}

class NotificationFactory
{
    static Notification sendNotification(String type)
    {
        if(type.equalsIgnoreCase("SMS"))
        {
            return new SMS();
        }
        else if(type.equalsIgnoreCase("Email"))
        {
            return new Email();
        }
        else
        {
            return null;
        }
    }
}

public class FactoryPattern
{
    public static void main(String[] args)
    {

        Notification email = NotificationFactory.sendNotification("Email");
        email.send();
    }
}