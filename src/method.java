
class Employee
{
    int id1,id2;
    Employee(int id1,int id2)
    {
        this.id1=id1;
        this.id2=id2;

    }
}
class check
{
    void swap(Employee obj)
    {
        int temp;
        temp=obj.id1;
        obj.id1=obj.id2;
        obj.id2=temp;
    }
}

/*class Person{
    private String name;
    private int age;

    public void setname(String name)
    {
        this.name= name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}

 */
public class method {
    public static void main(String[] args)
    {
        Employee obj1=new Employee(10,20);
        check obj = new check();
        System.out.println(obj1.id1+"\t"+ obj1.id2);
        obj.swap(obj1);
        System.out.println(obj1.id1+"\t"+ obj1.id2);

        /*Person p1 = new Person();
        p1.setname("Hridhanshu");
        p1.setAge(23);

        System.out.println("Name= "+p1.getName());
        System.out.println("Age= "+p1.getAge());

         */

    }
}
