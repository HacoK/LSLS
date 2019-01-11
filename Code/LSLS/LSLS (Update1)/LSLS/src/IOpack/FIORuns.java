package IOpack;
import java.io.File;
/**
 *
 * @author 79020
 */
public class FIORuns {
    public static void main(String[] args) throws Exception {
        String filePath = "data/1.txt";
        
        FileOperation.createFile(new File(filePath));
        File f = new File(filePath);
        FileOperation.readTxtFile(f);
    }
}
