import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Week3_FileExample {
    public static void main(String[] args)throws IOException{
        var fileName = "Week3_students.txt";
        var studentFile = Paths.get(fileName);
        var allStudents = Files.readString(studentFile);
        String [] separetedNames = allStudents.split("\n");
        //now lets show the user
        System.out.println("Here are the students in your class: ");
        for (String name : separetedNames) {
            System.out.println(name);
        }
    }
}