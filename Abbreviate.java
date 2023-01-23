public class Abbreviate {
    public static void main(String[] args) {
        String str = args[0];
        if (str.length()<8){
            System.out.println(str);
        }else{
            String strBeg = str.substring(0,2);
            String strEnd = str.substring(str.length()-2,str.length());
            System.out.println(strBeg+"..."+strEnd);
        }
    }
}
