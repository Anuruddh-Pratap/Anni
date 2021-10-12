interface Testinter {
    void square();
}
class Arithmetic implements Testinter
{
    public void square()
    {
        System.out.println("Arithmetic class");
    }
}
class ToTestint extends Arithmetic
{
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.square();
    }
}
