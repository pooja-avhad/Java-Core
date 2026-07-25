public class ATMWithdraw 
{
    public static void main(String[] args) 
    {
        int pin=123;
        int balance=5000;
        if(pin==123)
        {
            if(balance>=1000)
            {
                System.out.println("Transcation Successful");
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Invalid PIN");
        }
    }
}
