public class costinher {
    costinher()
    {
        System.out.println("Base constructor");
    }
}
class costinher2 extends costinher
{
    costinher2()
    {
        System.out.println("Child constructor");
    }
}
class costihermain
{
    public static void main(String[] args) {
        costinher2 obj = new costinher2();
    }
}