package hu.progmatic.Abstract_Task17_Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader {
    List<Employee> emloyeeList = new ArrayList<>();
    List<Employee> testerList = new ArrayList<>();  //csak a jobb megértésért
        List<String> fileContentList = new ArrayList<>();
    void readCsvFile() {
        try {
            fileContentList = Files.readAllLines(Path.of("src/resources/Employees.csv"));
            for (String row : fileContentList) {
                String[] rowData = row.split(", ");
                String position = rowData[0];
                String name = rowData[1];
                String salary = rowData[2];
                String anyOthers = rowData[3];
                switch (position) {
                    case "Developer" -> emloyeeList.add(new Developer(position, name, salary, anyOthers));
                    case "Tester" -> {emloyeeList.add(new Tester(position, name, salary, anyOthers));
                    testerList.add(new Tester(position, name, salary, anyOthers));}  //csak a jobb megértésért
                    case "HrAssistant" -> emloyeeList.add(new HrAssistant(position, name, salary, anyOthers));
                    case "FinanceAssistant" ->
                            emloyeeList.add(new FinanceAssistant(position, name, salary, anyOthers));
                    case "ExecutiveDirector" ->
                            emloyeeList.add(new ExecutiveDirector(position, name, salary, anyOthers));
                    default -> System.out.println("Wrong data: " + row);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Employee> getEmloyeeList() {
        return emloyeeList;
    }

    public List<String> getFileContentList() {  //csak a jobb megértésért
        return fileContentList;
    }

    public List<Employee> getTesterList() {
        return testerList;
    }
}
