public class excep{
    int roll;
    String name;

    excep() {
        roll = 15;
        name = "Anuruddh";
        System.out.println(roll);
        System.out.println(name);
    }

    public void dis() {
        System.out.println(roll);
        System.out.println(name);
    }
}
class excepmain
{
    public static void main(String[] args) {
        excep obj = new excep();
        System.out.println(obj);
    }
}

