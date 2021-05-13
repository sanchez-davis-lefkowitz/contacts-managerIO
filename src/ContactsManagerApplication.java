import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Class
public class ContactsManagerApplication {

    public static String directory = "./src/contactsIO/data";
    public static String filename = "contacts.txt";
    public static Path contactsTxtPath = Paths.get(directory,filename);
    public static Path dataDirectory = Paths.get(directory);
    public static Path dataFile = Paths.get(directory, filename);


    //instances fields
//    private static Path dataDirectory;
//    private static Path dataFile;
//    private static Path contactsTxtPath;
//    Path  contactsTxtPath = Paths.get(directory,filename);



    //constructors



    // class properties
    public static String contactList;



    //main method
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the contacts manager!");
//        contactList();
        mainMenu();
        removeName();


    }

    // Contact list for application
    public static void contactList() throws IOException {


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
//
        System.out.println("contactsTxtPath = " + contactsTxtPath);


        List<String> contacts = Arrays.asList("Jonathan Sanchez | 2104445467", "Timothy Lefkowitz | 2106548756","Mary Davis | 3362547998");

        System.out.println("Contacts txt file = " + contacts);

        Files.write(contactsTxtPath, contacts);

        List<String> contactList = Files.readAllLines(contactsTxtPath);


        System.out.println("Name            |        Phone Number\n" + "----------------------------");

        for (int i = 0; i < contactList.size(); i +=1){
            System.out.println((i + 1) + ": " + contactList.get(i));
        }

    }
    // This is our main menu for our application.
    public static void mainMenu() throws IOException {


        Scanner ui = new Scanner(System.in);
        int userInput;

        boolean looper = true;
        while (looper) {
            System.out.println("Contacts Manager");
            System.out.println("Please input one of the following: ");
            System.out.println("1. View Contacts.");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Search a contact by name.");
            System.out.println("4. Delete an existing contact.");
            System.out.println("5. Exit.");
            System.out.println("Enter an option (1, 2, 3, 4, 5)");
            userInput = ui.nextInt();
            if (userInput == 0) {
                looper = false;
            } else if (userInput == 1){
                contactList();
            } else if (userInput == 2){
                addContact();
            } else if (userInput == 3){

            } else if (userInput == 4){
                removeName();
            } else if (userInput == 5){
                looper = false;
            }
        }
    }

//    public static void removeName() throws IOException {
//////        File inputFile = new File("myFile.txt");
////        File tempFile = new File("myTempFile.txt");
////
////        BufferedReader reader = new BufferedReader(new FileReader(filename));
////        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
////
////
////        Scanner sc = new Scanner(System.in);
////
////        System.out.println(" Please Enter name to delete");
////        String inputContactFirstname = sc.nextLine();
////
////        String lineToRemove = inputContactFirstname;
////        String currentLine;
////
////        while((currentLine = reader.readLine()) != null) {
////            // trim newline when comparing with lineToRemove
////            String trimmedLine = currentLine.trim();
////            if(trimmedLine.equals(lineToRemove)) continue;
////            writer.write(currentLine + System.getProperty("line.separator"));
////        }
////        writer.close();
////        reader.close();
////        boolean successful = tempFile.renameTo(new File(filename));
//
//        //Method to remove  contact with string.
//    }

    public static void removeName() throws IOException {
        Scanner cl = new Scanner(System.in);
        System.out.println("Please enter a name to delete \n");
        String name = cl.nextLine();
        List<String> contactName = Files.readAllLines(contactsTxtPath);
        List<String> anotherCL = new ArrayList<>();

        for (String contact : contactName) {
            if (contact.contains(name)) {
                continue;
            } else
                anotherCL.add(contact);
        }
            Files.write(contactsTxtPath, anotherCL);
//        System.out.println(anotherCL);

    }


    // Use this method to add a contact.

    public static void addContact() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Please Enter Firstname");
        String inputContactFirstname = sc.nextLine();

        System.out.println(" Please Enter Lastname");
        String inputContactLastname = sc.nextLine();

        System.out.println(" Please Enter Phone Number without Dashes");
        int inputContactPhoneNumber = sc.nextInt();

        System.out.printf("%s " + "%s " + "| " + "%d ", inputContactFirstname, inputContactLastname, inputContactPhoneNumber);

        Path  contactsTxtPath = Paths.get(directory,filename);
        Files.write(contactsTxtPath, Arrays.asList(inputContactFirstname + " " + inputContactLastname + " | " + inputContactPhoneNumber), StandardOpenOption.APPEND);

    }}

    // This method is to search for an existing contact by name.

//    public void searchContact(){
//    }

    // This method is for deleting an existing contact.

//    public static void removeName(){
//        System.out.printf("Please enter name to remove");
//    }
