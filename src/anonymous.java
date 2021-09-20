public class anonymous {
    int b;
    anonymous(int a)
    {
        b=a;
    }
    public void prin()
    {
        System.out.println(b);
    }
}
class anonymousmain
{
    public static void main(String[] args) {
        new anonymous(7).prin();
    }
}
