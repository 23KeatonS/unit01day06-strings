// good
public class NegatePhrase {
    public static void main(String[] args) {
        String str = args[0];
        String strBeg = str.substring(0,3);
        if (strBeg.equals("not")){
            String finalstr = str;
            System.out.println(finalstr);
        }else{
            String finalstr = "not "+str;
            System.out.println(finalstr);
        }
    }
}
