public class cons {
    int num1,num2;
}
class test45{
    int num;
    cons obj;
    test45()
    {
        num = 93;
        obj = new cons();
        obj.num1=15;
        obj.num2=007;
    }
}
class test45main{
    public static void main(String[] args) {
        test45 obj1 = new test45();
        System.out.println(obj1.obj.num1);
        System.out.println(obj1.obj.num2);
    }
}
