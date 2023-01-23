public class ShortLongShort {
    public static void main(String[] args) {
     String str1 = args[0];
     String str2 = args[1];
     if (str1.length()>str2.length()){
        System.out.println(str2 +str1+str2);
     }else{
        System.out.println(str1+str2+str1);
     }   
    }
}
