import java.util.Scanner;
class para {
    int num1;
    int num2;

    para(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public void show() {
        System.out.println(num1);
        System.out.println(num2);
    }
}
    class paramain
    {
        public static void main(String[] args) {
            para obj = new para(07,15);
            obj.show();
        }
    }