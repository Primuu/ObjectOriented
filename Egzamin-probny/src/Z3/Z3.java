package Z3;

import java.io.File;
import java.io.FilenameFilter;

public class Z3 {
    public static String[] allFilesInCatalog(String path){
        File catalogToCheck = new File(path);
        return catalogToCheck.list();
    }
}
