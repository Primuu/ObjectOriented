package SOLO.zz3;

import java.io.File;

public class z3 {
    public static String[] allFiles(String path){
        File catalog = new File(path);
        return catalog.list((dir, name) -> true);
    }

    public static void main(String[] args) {
        String[] files = allFiles("E:\\POJavaProjects\\Object_Oriented-Java");

        for (String s: files
        ) {
            System.out.println(s);
        }
    }
}
