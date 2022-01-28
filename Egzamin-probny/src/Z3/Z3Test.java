package Z3;


public class Z3Test {
    public static void main(String[] args) {
        String[] files = Z3.allFilesInCatalog("E:\\POJavaProjects\\Object_Oriented-Java");

        for (String s: files
             ) {
            System.out.println(s);
        }
    }
}