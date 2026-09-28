enum OrderStatus
{
    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

public class OrderExample
{
    public static void main(String[] args)
    {
        for(OrderStatus status : OrderStatus.values())
        {
            System.out.println(status);
        }
    }
}