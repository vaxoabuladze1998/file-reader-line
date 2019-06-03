import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderLine {


    public static void main(String[] args) {
        int i=0;
        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\windows 10\\IdeaProjects\\untitled4\\src\\data.txt"));
            for (String line : allLines) {
               if(i%2==0){
                System.out.println(line);
               }
               i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}