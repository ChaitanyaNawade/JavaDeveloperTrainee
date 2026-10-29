interface MyInterface1
{
    void print();
}

interface MyInterface2
{
    int sum(int a , int b);
}

class Greeting
{
    public static void greet()
    {
        System.out.println("hello world");
    }
}

class MathUtil
{
    static int add(int a , int b)
    {
        return a + b;
    }
}


class Demo
{
    public void demo()
    {
        // MyInterface1 obj1 = ()->Greeting.greet();//Using Lambda
        // obj1.print();

        MyInterface1 obj2 = Greeting::greet;//Using Method Reference
        obj2.print();

        // MyInterface2 obj3 = (a,b)->MathUtil.add(a,b);
        // obj3.sum(10, 20);

        MyInterface2 obj3 = MathUtil::add;
        int result =  obj3.sum(10,20);

        System.out.println("Sum :"+result);
    }
} 
 


class MethodReference
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.demo();
    }
}