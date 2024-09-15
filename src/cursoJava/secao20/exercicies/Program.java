package cursoJava.secao20.exercicies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public  static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = input.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Map<String, Integer> map = new LinkedHashMap<>();
            String line = br.readLine();
            String[] files = line.split(",");

            while(line != null){

                if (map.containsKey(files[0])){
                    map.put(files[0], map.get(files[0]) + Integer.parseInt(files[1]));
                }else {
                    map.put(files[0], Integer.parseInt(files[1]));
                }
                // C:\temp\in.txt
                line = br.readLine();
                if (line != null){
                    files = line.split(",");
                }
            }

            for (String key : map.keySet()){
                System.out.println(key + ": " + map.get(key));
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
