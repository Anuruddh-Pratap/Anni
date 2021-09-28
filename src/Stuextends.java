public class Stuextends extends Student {
    public int roll;
    public String naam;
    Stuextends(int roll, String naam) {
        roll = Rollno;
        naam = Name;
        System.out.println(roll);
        System.out.println(naam);
    }
}
class Stuextendsmain
{
    public static void main(String[] args) {
        Stuextends obj2 = new Stuextends(69,"kane");
    }
}

