abstract class Shape  //Abstract class
{
    abstract double calculateArea(); //Abstract Method
}

class Circle extends Shape
{
    double radius = 5;

    double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

class RectAngle extends Shape
{
    double length = 10;
    double width = 5;

    double calculateArea()
    {
        return length * width;
    }
}

class Abstract2
{
    public static void main(String A[])
    {
        Shape sobj1 = new Circle();
        Shape sobj2 = new RectAngle();


        double dRet = 0.0;

        dRet = sobj1.calculateArea();
        System.out.println("The area of the circle is "+dRet);

        dRet = sobj2.calculateArea();
        System.out.println("The area of the Rectangle is "+dRet);
    }
}