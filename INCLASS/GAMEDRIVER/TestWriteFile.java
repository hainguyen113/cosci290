import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriteFile {

	public void write(String filename, String information) {
    
    //String FILENAME = "testWriting.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			//String content = "This is the content to write into file\n";

			bw.write(content);

			//System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}