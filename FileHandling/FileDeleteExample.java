import java.io.File;
import java.io.IOException;

public class FileDeleteExample
{
    public static void main(String[] args)
    {
        File file = new File("sample-delete.txt");

        try
        {
            file.createNewFile();

            if(file.delete())
            {
                System.out.println("File deleted successfully.");
            }
            else
            {
                System.out.println("File could not be deleted.");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}