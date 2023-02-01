// good
public class ShortLongShort {
    public static void main(String[] args) {
     String str1 = args[0];
     String str2 = args[1];
     if (str1.length()>str2.length()){
        String strFinal = str2 +str1+str2;
        System.out.println(strFinal);
     }else{
        String strFinal = str1+str2+str1;
        System.out.println(strFinal);
     }   
    }
}
