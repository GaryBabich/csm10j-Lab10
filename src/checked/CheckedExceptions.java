package checked;

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    
    public static void OpenFileChecked() throws FileNotFoundException{
        
        try{
            Scanner filename = new Scanner(new FileReader("nofile.txt"));
            filename.close();
        } catch (FileNotFoundException kujyhtrd){
            throw kujyhtrd;
        }
    }
}
