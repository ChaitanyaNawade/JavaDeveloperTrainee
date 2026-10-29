interface MyInterface1
{
    void print();
}


class Demo
{
    public void demo()
    {
        MyInterface1 obj1 = ()->System.out.println("code executed");
        obj1.print();
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