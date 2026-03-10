import java.util.logging.Logger;

public class T1
{

    static Logger logger = Logger.getLogger(T1.class.getName());


    public static void main(String[] args) 
    { 
        logger.info("Program started");

        int x = 20;

        logger.warning("Value of x = " + x);

        logger.severe("This is severe message");
    }
}