class myEmployee{

    private int id;
    private String name;
    public myEmployee(){
          id=45;
          name= "Hridhanshu";
    }

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

public class Constructor {
    public static void main(String[] args) {
        myEmployee hrid = new myEmployee();
        System.out.println(hrid.getId());
        System.out.println(hrid.getName());



    }
}
