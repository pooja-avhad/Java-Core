import java.io.FileReader;
import java.io.IOException;

public class FileReadExample
{
    public static void main(String[] args)
    {
        try (FileReader reader = new FileReader("demo.txt"))
        {
            int ch;

            while ((ch = reader.read()) != -1)
            {
                System.out.print((char) ch);
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}