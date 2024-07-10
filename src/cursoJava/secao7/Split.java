package cursoJava.secao7;

public class Split {
    public static void main(String[] args) {

        String a = "adsasdisidjasj  sd jsaji dasij ija nsanfsakn fsaf nalfklnafn asn asfn nkas fnan kfaklnf sal fnaskf nksa kfaskf sank fn ";
        String s = "Erick Junior Batista Garcia";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        String word4 = vect[3];
        int s01 = a.indexOf("as");
        int s02 = a.lastIndexOf("as");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(s01);
        System.out.println(s02);
    }
}
