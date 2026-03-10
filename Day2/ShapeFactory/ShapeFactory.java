abstract class  Shape
{
    abstract void area(int a);
}

class Circle extends Shape
{
    @Override
    void area(int r)
    {
        double res=3.14*r*r;
        System.out.println("Circle Area : "+res);
    }
}

class Square extends Shape
{
    @Override
    void area(int a)
    {
        double res=a*a;
        
        System.out.println("Square Area : "+res);
    }
}

class Factory
{
    static Shape getObjShape(String type)
    {
        if(type.equalsIgnoreCase("Circle"))
        {
            return new Circle();
        }
        else if(type.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        else
        {
            return null;
        }
    }

}

public class ShapeFactory
{
    public static void main(String[] args) {
        Shape s1 =Factory.getObjShape("Circle");

        s1.area(10); 

        Shape s2 =Factory.getObjShape("Square");

        s2.area(5);
    }
}