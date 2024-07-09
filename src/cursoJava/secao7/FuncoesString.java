package cursoJava.secao7;

public class FuncoesString {
    public static void main(String[] args) {
        String original = "abcd FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();

        String s02 = original.toUpperCase();

        String s03 = original.trim();

        System.out.println("Original: -"+original+"-");
        System.out.println("toLowerCase: -"+s01+"-");
        System.out.println("toUpperCase: -"+s02+"-");
        System.out.println("trim: -"+s03+"-");
    }
}