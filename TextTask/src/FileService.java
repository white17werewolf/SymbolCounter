import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileService {
    public static void writeTriangleToTxtFile(File file, TextTask text) throws IOException {
        String string = " ";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeBytes(String.valueOf(text));
            dos.writeBytes(string);

        }
    }
}
