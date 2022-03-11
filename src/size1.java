
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class size1 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\Hp\\Desktop\\abc");
        List<Path> paths = listFiles(path);
        paths.forEach(System.out::println);

        List<Path>paths1 = (List<Path>) size(path);
        System.out.println(paths);

    }

    // list all files from this path
    public static List<Path> listFiles(Path path) throws IOException {

        List<Path> result;
        try (Stream<Path> walk = Files.walk(path)) {
            result = walk.filter(Files::isRegularFile)

                    .collect(Collectors.toList())
                    ;
        }
        return result;

    }

    public static List<Path> size(Path path) throws IOException{
        try (Stream<Path> paths = Files.walk(Paths.get(String.valueOf(path)), 2)) {
        paths.filter(Files::isRegularFile)
                .mapToLong(p -> p.toFile().length())
                .forEach(System.out::println);
        return (List<Path>) paths;

    }
    }
}