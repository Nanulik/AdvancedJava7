package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {
        String file = "NanaFile.txt";
        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "I'm writing inside file that I have created in my privious function, \n" +
                "this is line 2 ");

        fileManager.readFromFile(file);
        fileManager.deleteFile(file);
    }

    public void createFile(String fileName){
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeToFile(String fileName, String text) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error can't write to " + fileName);
            e.printStackTrace();
        }
    }

    public void readFromFile(String fileName){
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
           // while(scanner.hasNextLine()){
            //    String row = scanner.nextLine();
            //    System.out.println(row);
            //}

            //another way to do it
            for (int i = 0; scanner.hasNextLine(); i ++) {
                String row = scanner.nextLine();
                System.out.println(i);
                System.out.println(row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
    }

}