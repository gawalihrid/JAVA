import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Methods {

    public static void main(String[] args) throws IOException {

        var dirName = "C:\\Users\\Hp\\iCloudDrive\\Anoop";

        try (Stream<Path> paths = Files.walk(Paths.get(dirName), 2)) {
            paths.filter(Files::isRegularFile)
                    .mapToLong(p -> p.toFile().length())
                    .forEach(System.out::println)

                    ;
        }
    }
}