public class NegatePhrase {
    public static void main(String[] args) {
        String str = args[0];
        String strBeg = str.substring(0,3);
        if (strBeg.equals("not")){
            System.out.println(str);
        }else{
            System.out.println("not "+str);
        }
    }
}
