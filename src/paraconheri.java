public class paraconheri {
    paraconheri(int a)
    {
        System.out.println("Base constructor"+ a);
    }
    paraconheri()
    {
        System.out.println("Non Para");
    }
}
class paraconheri1 extends paraconheri
{
    paraconheri1(int z)
    {
        super(z);
        System.out.println("Child constructor");
    }
}
class paraconherimain
{
    public static void main(String[] args) {
        paraconheri obj1 = new paraconheri();
        paraconheri1 obj = new paraconheri1(11);

    }
}