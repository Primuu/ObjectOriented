package Z3;

import java.io.File;
import java.util.Arrays;

public class AllFiles {
    public static String[] allFiles(String path){
        File file = new File(path);
        return file.list((dir, name) -> true);
    }

    public static void main(String[] args) {
        String path = "E:\\POJavaProjects\\Object_Oriented-Java";
        System.out.println(Arrays.toString(allFiles(path)));

    }
}
