import java.io.File;
public class CreateFileExample1
{
    public static void main(String[] args)
    {
        try
        {
            File f= new File("D:\\A Programming\\PPA\\JAVA\\sec\\hridhanshu.txt");    //file to be delete
            if(f.delete())                      //returns Boolean value
            {
                System.out.println(f.getName() + " deleted");   //getting and printing the file name
            }
            else
            {
                System.out.println("failed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}