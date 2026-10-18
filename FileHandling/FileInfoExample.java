import java.io.File;

public class FileInfoExample
{
    public static void main(String[] args)
    {
        File file = new File("demo.txt");

        System.out.println("File exists: " + file.exists());
        System.out.println("File name: " + file.getName());
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Absolute path: " + file.getAbsolutePath());
    }
}