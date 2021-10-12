public class point {
    private int x,y;
    public point()
    {
        System.out.println("Non parameterized constructor");
    }
    point(int x, int y)
    {
        System.out.println("Value of x and y are" + x + " "+ y);
    }
    public void setX(int x)
    {
        System.out.println("Value of x is" +x);
    }
    public void setY(int y)
    {
        System.out.println("Value of y is"+y);
    }
    public void setXY(int x, int y)
    {
        System.out.println("Value of x and y are"+x +" "+ y);
    }
}
class pointmain
{
    public static void main(String[] args) {
        point obj = new point();
        point obj1 = new point(10,15);
        obj.setX(10);
        obj.setY(15);
        obj.setXY(10,15);
    }
}
