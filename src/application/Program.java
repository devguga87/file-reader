package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        File file = new File("C:\\Users\\gusta\\Desktop\\dev\\java\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){ //verifica se ainda ha linhas
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
