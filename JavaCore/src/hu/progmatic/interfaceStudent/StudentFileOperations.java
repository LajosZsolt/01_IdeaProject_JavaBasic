package hu.progmatic.interfaceStudent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StudentFileOperations implements StudentSaver, StudentReader {
    private String fileName = "student.txt";


    public StudentFileOperations() {        //ha nem látjuk ez akkor is itt van, minden Objektum
        super();                        // példányosítható!!
    }


    @Override
    public void save(String student) {
        try {
            Files.writeString(Path.of("src/resources/" + fileName), student);
            System.out.println("Data saved: "+ student);
        } catch (IOException ex) {
            System.out.println("Cannot write file");
        }

    }

    @Override
    public List<String> read() {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(Path.of("src/resources/" + fileName));
        } catch (IOException ex) {
            System.out.println("Cannot read file");
        }
        return result;
    }
}
