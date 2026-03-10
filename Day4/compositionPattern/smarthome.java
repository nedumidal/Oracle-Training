interface Switch
{
    void start();
    void stop();
}

class Light implements Switch
{
    public void start()
    {
        System.out.println("Light turned On..!");
    }

    public void stop()
    {
        System.out.println("Light turned OFF..!");
    }
}


class Fan implements Switch
{
    public void start()
    {
        System.out.println("Fan turned On..!");
    }

    public void stop()
    {
        System.out.println("Fan turned OFF..!");
    }
}

class switchBox
{
    Switch s1;
    Switch s2;

    public switchBox() 
    {
        s1=new Light();
        s2=new Fan();
    }

    void start(Switch t)
    {
        t.start();
    }

    void stop(Switch t)
    {
        t.stop();
    }    
}


public class smarthome
{
    public static void main(String[] args) 
    {
        switchBox ob1 = new switchBox();

        ob1.start(ob1.s1);

        ob1.start(ob1.s2);
        
        ob1.stop(ob1.s1);

        ob1.stop(ob1.s2);
    }
}

