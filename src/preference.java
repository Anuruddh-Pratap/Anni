public class preference {
    {
        System.out.println("Instance Block");
    }
    static
    {
        System.out.println("Static Block");
    }
    void molly()
    {
        System.out.println("Function Block");
    }
}
class preferencemain
{
    public static void main(String[] args) {
        System.out.println("Main Block");
        new preference().molly();
    }
}
