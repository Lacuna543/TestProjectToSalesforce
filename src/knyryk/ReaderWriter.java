package knyryk;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderWriter {

    public static List<String> readFromFile(String fileName) {
        List<String> text = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            text = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static void writeToFile(String str, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

