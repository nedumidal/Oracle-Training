@FunctionalInterface
interface Operation
{
    double calculate(double a , double b);

    public static void main(String args[])
    {
        Operation add =(a,b)-> a+b;
        Operation sub = (a,b) -> a-b;
        Operation pow = (a,b) -> Math.pow(a,b);

        System.out.println("Add : " + add.calculate(10,10));
        System.out.println("Sub : " + sub.calculate(10,10));
        System.out.println("POW : " + pow.calculate(2,5));
    }
}