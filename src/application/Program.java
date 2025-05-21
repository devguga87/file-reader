package application;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};
        String path = "C:\\Users\\gusta\\Desktop\\dev\\java\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine(); //por padrao n tem quebra de linha entao boto esse newline
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
