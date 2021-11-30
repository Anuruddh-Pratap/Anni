import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) {
        String target = "07054476604ghc gla917054476604";
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        int ctr =0;
        Matcher m = p.matcher(target);
        while(m.find())
        {
            ctr++;
            System.out.println(m.start() + "   "+ m.end()+ "   "  + m.group());
        }
        System.out.println(ctr);
    }
}
