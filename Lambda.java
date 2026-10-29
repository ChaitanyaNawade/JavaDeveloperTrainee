interface Vehicle  //Functional Interface 1
{
    void start();
}

interface  Calculator
{
    int sum(int a, int b);
}

class Bike 
{
     Vehicle v = () -> System.out.println("Bike Engine started");
}


class Demo
{
    public void demo()
    {
        Vehicle v = () -> System.out.println("Vehicle engine started");
        v.start();

       Calculator c = (a,b) -> a + b;
       System.out.println(c.sum(10,20));
    }
}
class Lambda
{
    public static void main(String A[])
    {
       Vehicle bike = ()-> System.out.println("Bike Engine started");

       Demo dobj = new Demo();
       dobj.demo();
    }
}