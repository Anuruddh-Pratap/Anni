public class box {
    int l=10,b=4,h=5;
    int area,vol;
    box()
    {
        area = 2*(l*b+b*h+h*l);
        vol = l*b*h;
        System.out.println(area);
        System.out.println(vol);
    }
}
class box3d extends box
{
    box3d()
    {
        int area1 = area;
        int vol1= vol;
        System.out.println(area1 +" "+vol1);
    }
}
class boxmain
{
    public static void main(String[] args) {
        box3d obj = new box3d();
    }
}
