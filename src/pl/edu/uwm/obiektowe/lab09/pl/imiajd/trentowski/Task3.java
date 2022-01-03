package pl.edu.uwm.obiektowe.lab09.pl.imiajd.trentowski;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){

        ArrayList<String> text = new ArrayList<String>();
        try{
            File file = new File("E:\\POJavaProjects\\Object_Oriented-Java\\src\\pl\\edu\\uwm\\obiektowe\\lab09\\pl\\imiajd\\trentowski\\text.txt");
            Scanner read = new Scanner(file);
            while(read.hasNextLine()) {
                text.add(read.nextLine());
            }
            read.close();
        } catch (FileNotFoundException e){
            System.out.println("Plik nie istnieje");
            e.printStackTrace();
        }
        System.out.println("Before sort:");
        System.out.println(text);

        text.sort(Comparator.naturalOrder());

        System.out.println("After sort:");
        System.out.println(text);
    }
}
