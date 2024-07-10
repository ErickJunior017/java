package cursoJava.secao7;

public class FuncoesString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase();

        String s02 = original.toUpperCase();

        String s03 = original.trim();

        String s04 = original.substring(2);

        String s05 = original.substring(2, 13);

        String s06 = original.replace('a', 'x');

        String s07 = original.replace("abc", "xyz");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -"+original+"-");
        System.out.println("toLowerCase: -"+s01+"-");
        System.out.println("toUpperCase: -"+s02+"-");
        System.out.println("trim: -"+s03+"-");
        System.out.println("Substring: -"+s04+"-");
        System.out.println("Substring: -"+s05+"-");
        System.out.println("Replace('a', 'x'): -"+s06+"-");
        System.out.println("Replace('abc', 'xyz'): -"+s07+"-");
        System.out.println("IndexOf(\"bc\"): "+i);
        System.out.println("LastIndexOf(\"bc\"): "+j);
    }
}
