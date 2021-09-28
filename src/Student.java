public class Student {
    int Rollno;
    String Name;
    Student()
    {
        Rollno=15;
        Name="Anuruddh";
    }
    Student(int Rollno,String Name)
    {
        this.Rollno=Rollno;
        this.Name=Name;
    }
    public void pri()
    {
        System.out.println(Rollno);
        System.out.println(Name);
    }
}
class studentMain
{
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student(16,"Andre");
        obj.pri();
        obj1.pri();
    }
}
