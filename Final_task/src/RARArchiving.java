/*import java.io.File;
import java.io.IOException;

import de.innosystec.unrar.Archive;
import de.innosystec.unrar.rarfile.FileHeader;

public class RARArchiving {
    public static void archiveFileInRar(String filename, String rarFilename) {
        try {
            File file = new File(filename);
            File rarFile = new File(rarFilename);
            Archive archive = new Archive(rarFile);
            FileHeader fh = archive.nextFileHeader();
            while (fh != null) {
                if (fh.isDirectory()) {
                    fh = archive.nextFileHeader();
                    continue;
                }
                archive.extractFile(fh, file);
                fh = archive.nextFileHeader();
            }
            archive.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/