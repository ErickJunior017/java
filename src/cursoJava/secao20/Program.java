package cursoJava.secao20;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        //put vai adicionar uma chave e o valor relaciondo aquela chave
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        //vai remover de acordo com a chave passada
        cookies.remove("email");
        cookies.put("phone", "99711133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()){
            //get vai pegar o valor relacionado a chave
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
