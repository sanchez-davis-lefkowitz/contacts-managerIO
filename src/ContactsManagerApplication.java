import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ContactsManagerApplication {
    public static void main(String[] args) throws IOException {
        String directory = "./src/contactsIO/data";
        String filename = "contacts.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        //System.out.println("dataFile = " + dataFile);

        if(Files.notExists(dataDirectory)){//IF T: got down path and directory not there!

            Files.createDirectories(dataDirectory); //go ahead and create a directory on this path :)

        }

        if(Files.notExists(dataFile)){//IF T: got down path and file not found in directory~

            Files.createFile(dataFile);
        }
        Path  contactsTxtPath = Paths.get(directory,filename);

        System.out.println("contactsTxtPath = " + contactsTxtPath);

        List<String> contacts = Arrays.asList("Jonathan Sanchez 2104445467", "Timothy Lefkowitz 2106548756","Felecia Davis 3362547998");




    }
}
