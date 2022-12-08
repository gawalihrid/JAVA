import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class size {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello from main");

        long c;
        size obj = new size();
        c=obj.whenGetFolderSizeUsingJava8_thenCorrect();

    }

    public long whenGetFolderSizeUsingJava8_thenCorrect() throws IOException {
        long expectedSize = 12607;

        Path folder = Paths.get("G:\\A\\Hridhanshu\\Hridhanshu");
        long size = Files.walk(folder)
                .filter(p -> p.toFile().isFile())
                .mapToLong(p -> p.toFile().length())
                .sum();

        assertEquals(expectedSize, size);
        return expectedSize;
    }

    public void assertEquals(long expectedSize, long size) {

        System.out.println(size);
    }
}


