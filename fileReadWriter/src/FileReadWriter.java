import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// create a FileReadWriter class
public class FileReadWriter {
    public List<List<String>> fileContent = new ArrayList<>();
    public List<List<String>> truncatedFileContent = new ArrayList<>();
    //read line by line from the file
    public String readFile(String path){
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                fileContent.add(Arrays.asList(values));
            }
        } catch (Exception e) {
            System.out.println("invalid input!");
        }
        return getNeededText(fileContent);
    }

    // get the first 3 columns
    public String writeFile(String path) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
            for (List<String> line : fileContent) {
                String[] values = {line.get(0), line.get(1), line.get(2)};
                truncatedFileContent.add(Arrays.asList(values));
                pw.println(String.join(",", values));
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
        return getNeededText(truncatedFileContent);
    }

    // output the first 5 lines
    private String getNeededText(List<List<String>> content) {
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < 5; i ++) {
            tmp.add(String.join(",", content.get(i)));
        }
        return String.join("\n", tmp);
    }
}
