public class trai {
    public static void main(String[] args) {
        int a =10;
        System.out.println("Before Exception");
        try{
            System.out.println(a/0);
        }
        catch(ArithmeticException obj)
        {
        }
        System.out.println("After Exception");
    }
}
