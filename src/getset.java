import java.util.Scanner;

class myemployee{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void  setName(String n)
    {
        name=n;
    }

    public void setId(int i)
    {
        id =i;
    }
    public int getId()
    {
        return id;
    }
}

public class getset {
    public static void main(String[] args) {
        myemployee harry= new myemployee();

        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        harry.setName(name);
        System.out.println(harry.getName());

        harry.setId(512);
        System.out.println(harry.getId());
    }
}
