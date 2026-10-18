import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample
{
    public static void main(String[] args)
    {
        try (FileWriter writer = new FileWriter("demo.txt"))
        {
            writer.write("Hello Pooja!");
            System.out.println("Data written successfully.");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}