package cursoJava.secao17;

import java.io.File;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = in.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files){
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subder").mkdir();
        System.out.println("Directory created successfully: " + success);

        System.out.println();

        in.close();

    }
}
