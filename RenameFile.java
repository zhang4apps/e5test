import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("oldFileName.txt");
        File newFile = new File("newFileName.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("Rename successful");
        } else {
            System.out.println("Rename failed");
        }
    }
}
