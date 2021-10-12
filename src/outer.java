public class outer {
    public void display()
    {
        System.out.println("Method of Outer class");
    }
    class inner
    {
        public void display()
        {
            System.out.println("Method of Inner class");
        }
    }
}
class oimain
{
    public static void main(String[] args) {
        outer obj = new outer();
        outer.inner obj1 = obj.new inner();
        obj.display();
        obj1.display();
    }
}
