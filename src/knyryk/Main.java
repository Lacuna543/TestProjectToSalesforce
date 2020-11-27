package knyryk;


import java.util.List;

public class Main {
    public static final String FILE_NAME_SOURCE = "text.txt";
    public static final String FILE_NAME_DESTINATION = "dest.txt";

    public static void main(String[] args) {
        List<String> originText = ReaderWriter.readFromFile(FILE_NAME_SOURCE);
        String result = Util.reworkLines(originText);
        ReaderWriter.writeToFile(result, FILE_NAME_DESTINATION);
    }
}
