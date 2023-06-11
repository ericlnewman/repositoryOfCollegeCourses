import java.net.*;
import java.io.*;
import java.util.logging.*;
public class SolutionOne {
    void readData() {
        BufferedReader br = null;
            try {
                String data;
                br = new BufferedReader(new FileReader("file.txt"));
                while ((data = br.readLine()) != null) {
                    System.out.println(data);
                }
            } catch (IOException e){
                // log framework that provides useful tool for diagnosing an exceptions and thread safe
                log.error("Error during reading", e);
            } finally {
                try {
                    if (br != null)
                        br.close();
                } catch (IOException e) {
            // log framework that provides useful tool for diagnosing an exceptions and thread safe
            log.error("Error during reading", e);
            }
        }
    }
}