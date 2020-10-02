import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        try {
            new Main();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Main() throws Exception {
        List<String> content = Files.readAllLines(Paths.get("content.txt"));
        int count = 1104, lineCount = 0;
        while (lineCount < content.size()) {
            String s = content.get(lineCount);

            if (s.equals(String.valueOf(count))) {

                System.out.println(count + "\t"
                        + content.get(lineCount + 1) + "\t"
                        + content.get(lineCount + 3));

                lineCount += 3;
                count--;
            } else
                lineCount++;
        }
    }
}