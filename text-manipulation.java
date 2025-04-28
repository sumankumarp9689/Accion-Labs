import java.io.*;
import java.util.*;

class NameList {
    private List<String> names;
    private String filePath;

    public NameList(String filePath) {
        this.filePath = filePath;
        this.names = new ArrayList<>();
    }

    public void loadNames() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    names.add(line.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public List<String> getSortedNames() {
        List<String> sortedNames = new ArrayList<>(names);
        Collections.sort(sortedNames);
        return sortedNames;
    }

    public void displayNames() {
        List<String> sortedNames = getSortedNames();
        for (String name : sortedNames) {
            System.out.println(name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NameList nameList = new NameList("names.txt");
        nameList.loadNames();
        nameList.displayNames();
    }
}
