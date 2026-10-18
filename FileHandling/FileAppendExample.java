import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendExample
{
    public static void main(String[] args)
    {
        try (BufferedWriter bw =
                 new BufferedWriter(new FileWriter("demo.txt", true)))
        {
            bw.newLine();
            bw.write("New line added using append mode.");

            System.out.println("Data appended successfully.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}