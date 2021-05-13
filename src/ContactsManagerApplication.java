import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Class
public class ContactsManagerApplication {
//Refactored
    public static void main(String[] args) throws IOException{

      //a-little-refactoring
      Scanner cl = new Scanner(System.in);
       String name = cl.nextLine();


    //instances fields
//    private static Path dataDirectory;
//    private static Path dataFile;
//    private static Path contactsTxtPath;
    String directory = "./src/contactsIO/data";
    String filename = "contacts.txt" main

    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename);
    Path  contactsTxtPath = Paths.get(directory,filename);



    //constructors




    // class properties
    public static String contactList;

    //main method
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the contacts manager!");
        System.out.println(contactList());


    }

    // Contact list for application
    public void contactList() throws IOException {
//        String directory = "./src/contactsIO/data";
//        String filename = "contacts.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);

        System.out.println("dataFile = " + dataFile);

        if(Files.notExists(dataDirectory)){//IF T: got down path and directory not there!

            Files.createDirectories(dataDirectory); //go ahead and create a directory on this path :)

        }

        if(Files.notExists(dataFile)){//IF T: got down path and file not found in directory~

            Files.createFile(dataFile);
        }
//        Path  contactsTxtPath = Paths.get(directory,filename);

        System.out.println("contactsTxtPath = " + contactsTxtPath);

        List<String> contacts = Arrays.asList("Jonathan Sanchez | 2104445467", "Timothy Lefkowitz | 2106548756","Mary Davis | 3362547998");

        System.out.println("Contacts txt file = " + contacts);

        Files.write(contactsTxtPath, contacts);

        List<String> contactList = Files.readAllLines(contactsTxtPath);

        System.out.println("Name      |        Phone Number\n" + "----------------------------");

        for (int i = 0; i < contactList.size(); i +=1){
            System.out.println((i + 1) + ": " + contactList.get(i));
        }
// a-little-refactoring


    }
    // This is our main menu for our application.
    public static void mainMenu(String input){


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
                System.out.print(contactList);
            }
        }
 main
    }
    // Use this method to add a contact.

 a-little-refactoring
public static void mainMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Contacts Manager");
    System.out.println("Please input one of the following: ");
    System.out.println("1. View Contacts.");
    System.out.println("2. Add a new contact.");
    System.out.println("3. Search a contact by name.");
    System.out.println("4. Delete an existing contact.");
    System.out.println("5. Exit.");
    System.out.println("Enter an option (1, 2, 3, 4, 5)");
}

//    public static void contactList() throws IOException {
//        String directory = "./src/contactsIO/data";
//        String filename = "contacts.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        //System.out.println("dataFile = " + dataFile);
//
//        if(Files.notExists(dataDirectory)){//IF T: got down path and directory not there!
//
//            Files.createDirectories(dataDirectory); //go ahead and create a directory on this path :)
//
//        }
//
//        if(Files.notExists(dataFile)){//IF T: got down path and file not found in directory~
//
//            Files.createFile(dataFile);
//        }
//        Path  contactsTxtPath = Paths.get(directory,filename);
//
//        System.out.println("contactsTxtPath = " + contactsTxtPath);
//
//        List<String> contacts = Arrays.asList("Jonathan Sanchez | 2104445467", "Timothy Lefkowitz | 2106548756","Felecia Davis | 3362547998");
//
//        System.out.println("Contacts txt file = " + contacts);
//
//        Files.write(contactsTxtPath, contacts);
//
//        List<String> contactList = Files.readAllLines(contactsTxtPath);
//
//        System.out.println("Name      |        Phone Number\n" + "----------------------------");
//
//        for (int i = 0; i < contactList.size(); i +=1){
//            System.out.println((i + 1) + ": " + contactList.get(i));
//        }

    }
//
//
//
//
//    public static void mainMenu(String input){
//
//
//        Scanner ui = new Scanner(System.in);
//        int userInput;
//
//        boolean looper = true;
//        while (looper) {
//            System.out.println("Contacts Manager");
//            System.out.println("Please input one of the following: ");
//            System.out.println("1. View Contacts.");
//            System.out.println("2. Add a new contact.");
//            System.out.println("3. Search a contact by name.");
//            System.out.println("4. Delete an existing contact.");
//            System.out.println("5. Exit.");
//            System.out.println("Enter an option (1, 2, 3, 4, 5)");
//            userInput = ui.nextInt();
//            if (userInput == 0) {
//                looper = false;
//            } else if (userInput == 1){
//                System.out.print(contactList);
//            }
//        }
//    }
//
//
//    public static String contactList;
//
//    public static void main(String[] args) throws IOException {
//
//
//
//    }
//
//        // This is our Contact List
//
//
//
//
//
//
//    // This is our Deleting Contact
//
//    public static void removeName(){
//        System.out.printf("Please enter name to remove");
//    }
//
//
//
//
//    // This is our adding contact
//
//    public static void addContact(){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println(" Please Enter Firstname");
//        String inputContactFirstname = sc.nextLine();
//
//        System.out.println(" Please Enter Lastname");
//        String inputContactLastname = sc.nextLine();
//
//        System.out.println(" Please Enter Phone Number without Dashes");
//        int inputContactPhoneNumber = sc.nextInt();
//
//        System.out.printf("%s " + "%s " + "| " + "%d ", inputContactFirstname, inputContactLastname, inputContactPhoneNumber);
//
//        Files.write(contactsTxtPath, Arrays.asList(inputContactFirstname + " " + inputContactLastname + " | " + inputContactPhoneNumber), StandardOpenOption.APPEND);
//
//
//    }
//
//    // This is our Searching method
//
//    public static void search(){
//
//    }

    public void addContact() throws IOException {
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

    }

    // This method is to search for an existing contact by name.

//    public void searchContact(){
//    }

    // This method is for deleting an existing contact.

    public static void removeName(){
        System.out.printf("Please enter name to remove");
    }
}
