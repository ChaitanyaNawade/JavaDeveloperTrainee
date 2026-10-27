interface Payment
{
    void pay();
}

class UPIPayment implements  Payment
{
    public void pay()
    {
        System.out.println("enter your upi id");
    }
}

class CardPayment implements Payment
{
    public void pay()
    {
        System.out.println("Enter you card number here");
    }
}

class InterFace1
{
    public static void main(String A[])
    {
        UPIPayment uobj = new UPIPayment();
        uobj.pay();

        CardPayment cobj = new CardPayment();
        cobj.pay();
    }
}