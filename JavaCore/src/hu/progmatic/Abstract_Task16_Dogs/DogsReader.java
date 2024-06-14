package hu.progmatic.Abstract_Task16_Dogs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DogsReader {
    List<AbstractDog> dogs = new ArrayList<>();

    void readCsvFiles() {
        try {
            List<String> fileContent = Files.readAllLines(Path.of("src/resources/dogs.csv"));
            for (String row : fileContent) {
                String[] rowData = row.split(", ");
                String type = rowData[0];
                String name = rowData[1];
                String gender = rowData[2];
                String birthday = rowData[3];
                String weight = rowData[4];
                String additionalProperties = rowData[5];

                if (type.equals("Bulldog")) {
                    //AbstractDog bulldog = new AbstractDog(type, name, gender, birthDay, weight, additionalProperties);
                    Bulldog bulldog = new Bulldog(type, name, gender, birthday, weight, additionalProperties);
                    dogs.add(bulldog);
                    // rövidítve az alábbi:
                    // dogs.add( new Bulldog(type,name,gender,birthDay,weight,additionalProperties));
                } else if (type.equals("YorkshireTerrier")) {
                    dogs.add(new YorkshireTerrier(type, name, gender, birthday, weight, additionalProperties));
                } else if (type.equals("CaucasianShepherd")) {
                    dogs.add(new CaucasianShepherd(type, name, gender, birthday, weight, additionalProperties));
                } else {
                    System.out.println("Wrong input: " + row);
                }
            }
        } catch (IOException e) {
            System.out.println("Can not read the file");
        }
    }
        public List<AbstractDog> getDogs(){return dogs;}

}

