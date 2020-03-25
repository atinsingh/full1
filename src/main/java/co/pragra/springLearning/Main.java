package co.pragra.springLearning;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//IO - YOU MAY GET EXCEPTION
// CHECKED EXCEPTION
public class Main {
    // read this file
    // add populate the list
    public static void main(String[] args) {
        List<String> words  = null;
        // in Java 8 they added a interface
        // Path
        Path filePath = Paths.get("src","main","resources","alice.txt");
        try {
            words =  Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        words.forEach(System.out::println);
    }
}
