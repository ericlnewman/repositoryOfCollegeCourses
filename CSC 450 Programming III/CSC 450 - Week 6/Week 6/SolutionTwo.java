import java.net.*;
import java.io.*;
import java.util.logging.*;
public class SolutionTwo {
    private final String file = "file.txt";
        void readData() {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String data;
                while ((data = br.readLine()) != null) {
                    System.out.println(data);
                }
            } catch (IOException e) {
                // log framework that provides useful tool for diagnosing an exceptions and thread safe
                log.error("Error during reading", e);
        } br.close();
    }
}