import java.util.Scanner;

public class AScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(sc)
        {
            int i = Integer.parseInt(sc.next());
        }
        catch(Exception obj)
        {
            obj.printStackTrace();
            //System.out.println(obj.toString());
            //System.out.println(obj.getMessage());
            System.out.println(obj);
        }
        System.out.println("End of the code");
    }
}
