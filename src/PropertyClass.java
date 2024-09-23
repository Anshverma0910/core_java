import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("abc.properties");
        Properties prop = new Properties();
        prop.load(file);

        System.out.println("The name is "+prop.getProperty("name"));
        System.out.println("The id is "+prop.getProperty("id"));

        FileReader file2 = new FileReader("src/temp.properties");
        Properties prop2 = new Properties();
        prop2.load(file2);

        System.out.println("The name is "+prop2.getProperty("name"));
        System.out.println("The mail is "+prop2.getProperty("mail"));
    }
}
