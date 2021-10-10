public class doubt {
    doubt()
    {
        System.out.println("Constructor Block");
    }
}
class doubtmain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            doubt obj = new doubt();
        }
    }
}
