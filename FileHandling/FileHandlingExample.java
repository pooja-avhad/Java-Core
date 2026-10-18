import java.io.File;
import java.io.IOException;

public class FileHandlingExample
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("demo.txt");

            if(file.createNewFile())
            {
                System.out.println("File created successfully.");
            }
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}