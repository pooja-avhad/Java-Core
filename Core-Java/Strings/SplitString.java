public class SplitString 
{
    public static void main(String[] args) 
    {
        String s="java full stack";
        String [] words=s.split(" ");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
    }
}
