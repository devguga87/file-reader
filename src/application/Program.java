package application;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        String path = "C:\\Users\\gusta\\Desktop\\dev\\java\\in.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); //se tiver no final retorna nulo

            while(line!= null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
