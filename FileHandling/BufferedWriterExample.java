import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample
{
    public static void main(String[] args)
    {
        try (BufferedWriter bw =
                 new BufferedWriter(new FileWriter("demo.txt")))
        {
            bw.write("Hello Pooja!");
            bw.newLine();

            bw.write("Welcome to Java.");
            bw.newLine();

            bw.write("Learning File Handling.");

            System.out.println("Data written successfully.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}