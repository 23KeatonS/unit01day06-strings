// good
public class Abbreviate {
    public static void main(String[] args) {
        String str = args[0];
        if (str.length()<8){
            String finalstr = str;
            System.out.println(finalstr);
        }else{
            String strBeg = str.substring(0,2);
            String strEnd = str.substring(str.length()-2,str.length());
            String finalstr = strBeg+"..."+strEnd;
            System.out.println(finalstr);
        }
    }
}
