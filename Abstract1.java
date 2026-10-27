abstract class Hello
{
    public Hello()   //Constructor of The abstract class 
    {
        System.out.println("Inside the constructor of the hello class");
    }

    abstract  void show();

    public void getInfo()
    {
        System.out.println("This is the abstract class");
    }
}


class Demo extends Hello{

    public void show()
    {
        System.out.println("we given body successfully");
    }

    public void draw()
    {
        System.out.println("Draw circle");
    }
}


class Abstract1
{
    public static void main(String A[])
    {
        
        Demo dobj = new Demo();
        dobj.show();
        dobj.getInfo();
        dobj.draw();


        //Hello dobj = new Demo();
        //dobj.Draw();  Compilation Error
    }
}