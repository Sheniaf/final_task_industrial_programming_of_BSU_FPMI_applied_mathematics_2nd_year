import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZIPArchiving {
    public static void archiveFile(String Filename, String zipFilename) {
        try {
            File file = new File(Filename);
            File zipFile = new File(zipFilename);
            FileInputStream fis = new FileInputStream(file);
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));
            ZipEntry zipEntry = new ZipEntry(file.getName());
            zos.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while((length = fis.read(bytes)) >= 0) {
                zos.write(bytes, 0, length);
            }
            zos.closeEntry();
            zos.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}