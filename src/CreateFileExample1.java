import java.io.File;
public class CreateFileExample1
{
    public static void main(String[] args)
    {
        try
        {
            File f= new File("C:\\Users\\Hp\\Desktop\\hridhanshu1.java");    //file to be delete
            if(f.delete())                      //returns Boolean value
            {
                System.out.println(f.getName() + "\n"+"Delet");   //getting and printing the file name
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