

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAccess {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello read a file");
        var lines = Files.lines(Path.of("aaa.adoc"));
        lines.forEach(System.out::println);
    }
}
