
class Functional
{
    public static void main(String A[])
    {
        new Thread(()->System.out.println("new Thread Created")).start();
    }
}