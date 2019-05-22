import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class TextFileReadApache {
	public static void main(String[] args) {
		TextFileReadApache test = new TextFileReadApache();
		System.out.println(test.readFile("dummy.txt"));
	}
	public String readFile(String Filename){
		File file = new File(Filename);
		String text = null;
		try {
			text = FileUtils.readFileToString(file, "UTF-8");
		} catch (IOException e) {
			System.out.print("Error reading" + file.getAbsolutePath());
		}
		return text;
	}
}
